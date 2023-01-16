import controllers.ReleveController;
import model.Releve;

public class SoapClientApplication {
    public static void main(String[] args) {
        ReleveController releveController = new ReleveController();
        Releve releve = releveController.getReleve();

        System.out.println("-------------------------");
        System.out.println("-----model.Releve bancaire-----");
        System.out.println("-------------------------");
        System.out.println("RIB : " + releve.getRib());
        System.out.println("Date : " + ReleveDiserializationApplication.dateformater(releve.getDateReleve()));
        System.out.println("Solde : " + releve.getSolde());
        System.out.println("\nListe des opérations du " + ReleveDiserializationApplication.dateformater(releve.getOperations().getDateDebut())
                + " jusqu'à " + ReleveDiserializationApplication.dateformater(releve.getOperations().getDateFin()));
        System.out.println("------------------------------------------------------------------");
        System.out.println("Date\t\t\t|\tType\t|\tMontant\t|\tDescription\t\t\t|");
        System.out.println("------------------------------------------------------------------");
        releve.getOperations().getOperations().forEach(operation -> {
            System.out.print(ReleveDiserializationApplication.dateformater(operation.getDate()) + "\t|\t");
            System.out.print(operation.getType() + "\t|\t");
            System.out.print(operation.getMontant() + "\t|\t");
            System.out.println(operation.getDescription() + "\t|");
            System.out.println("------------------------------------------------------------------");
        });
    }
}
