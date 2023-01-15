import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import model.Releve;

import java.io.File;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class ReleveDiserializationApplication {

    public static void main(String[] args) throws JAXBException {
        Releve releve;
        JAXBContext jaxbContext = JAXBContext.newInstance(Releve.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        releve = (Releve) unmarshaller.unmarshal(new File("releve.xml"));
        System.out.println("-------------------------");
        System.out.println("-----model.Releve bancaire-----");
        System.out.println("-------------------------");
        System.out.println("RIB : " + releve.getRib());
        System.out.println("Date : " + dateformater(releve.getDateReleve()));
        System.out.println("Solde : " + releve.getSolde());
        System.out.println("\nListe des opérations du " + dateformater(releve.getOperations().getDateDebut()) + " jusqu'à " + dateformater(releve.getOperations().getDateFin()));
        System.out.println("------------------------------------------------------------------");
        System.out.println("Date\t\t\t|\tType\t|\tMontant\t|\tDescription\t\t\t|");
        System.out.println("------------------------------------------------------------------");
        releve.getOperations().getOperations().forEach(operation -> {
            System.out.print(dateformater(operation.getDate()) + "\t|\t");
            System.out.print(operation.getType() + "\t|\t");
            System.out.print(operation.getMontant() + "\t|\t");
            System.out.println(operation.getDescription() + "\t|");
            System.out.println("------------------------------------------------------------------");
        });
    }

    /**
     * Format a date
     * @param dateToFormat
     * @return
     */
    public static String dateformater(Date dateToFormat) {
        Locale locale = new Locale("fr", "FR");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
        String date = dateFormat.format(dateToFormat);
        return date;
    }
}
