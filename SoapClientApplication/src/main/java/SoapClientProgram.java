import proxy.Releve;
import proxy.ReleveController;
import proxy.ReleveWs;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class SoapClientProgram {
    public static void main(String[] args) {
        ReleveController releveController = new ReleveWs().getReleveControllerPort();
        Releve releve = releveController.releves();

        System.out.println("-------------------------");
        System.out.println("-----model.Releve bancaire-----");
        System.out.println("-------------------------");
        System.out.println("RIB : " + releve.getRIB());
        System.out.println("Date : " + dateformater(releve.getDateReleve().toGregorianCalendar().getTime()));
        System.out.println("Solde : " + releve.getSolde());
        System.out.println("\nListe des opérations du " +
                dateformater(releve.getOperations().getDateDebut().toGregorianCalendar().getTime()) + " jusqu'à " +
                dateformater(releve.getOperations().getDateFin().toGregorianCalendar().getTime()));
        System.out.println("------------------------------------------------------------------");
        System.out.println("Date\t\t\t|\tType\t|\tMontant\t|\tDescription\t\t\t|");
        System.out.println("------------------------------------------------------------------");
        releve.getOperations().getOperations().forEach(operation -> {
            System.out.print(dateformater(operation.getDate().toGregorianCalendar().getTime()) + "\t|\t");
            System.out.print(operation.getType() + "\t|\t");
            System.out.print(operation.getMontant() + "\t|\t");
            System.out.println(operation.getDescription() + "\t|");
            System.out.println("------------------------------------------------------------------");
        });
    }

    public static String dateformater(Date dateToFormat) {
        Locale locale = new Locale("fr", "FR");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
        String date = dateFormat.format(dateToFormat);
        return date;
    }
}
