import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import model.Operation;
import model.Releve;
import model.TypeOperation;

import java.io.File;
import java.util.Date;

public class ReleveSerializationApplication {
    public static void main(String[] args) throws JAXBException {
        Releve releve = new Releve();
        releve.setRib("04C045CCSD034340VDFREE53");
        releve.setDateReleve(new Date());


        Operation op1 = new Operation(TypeOperation.DEBIT, new Date(), 3000L, "Retrait de 3000DH");
        Operation op2 = new Operation(TypeOperation.CREDIT, new Date(), 6000L, "Virement de 6000DH");
        Operation op3 = new Operation(TypeOperation.DEBIT, new Date(), 5000L, "Retrait de 3000DH");
        Operation op4 = new Operation(TypeOperation.CREDIT, new Date(), 3000L, "Virement de 3000DH");

        releve.addOperation(op1);
        releve.addOperation(op2);
        releve.addOperation(op3);
        releve.addOperation(op4);

        JAXBContext jaxbContext = JAXBContext.newInstance(Releve.class);
        Marshaller marshaller = jaxbContext.createMarshaller();

        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(releve, new File("releve.xml"));
    }
}
