import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ciao benvenuti nell'app inserimento fiori");

        Scanner input= new Scanner(System.in);
        boolean cond = true;

        while (cond){

            System.out.println("Inserisci nome fornitore: ");
            String nome = input.nextLine();

            System.out.println("Scegli la categoria");
            System.out.println("Categorie:");
            System.out.println("0 - PIANTE");
            System.out.println("1 - VASELLAME");
            System.out.println("2 - CONCIME");
            System.out.println("3 - GIARDINAGGIO");
            
            byte scelta= input.nextByte();
            input.nextLine();
            categoriaFornitori categoria = categoriaFornitori.values()[scelta];

            System.out.println("Scrivi la partita IVA: ");
            String PIVA= input.nextLine();

            System.out.println("Scrivi il luogo in cui si trova: ");
            String luogo= input.nextLine();

            System.out.println("Scrivi il numero di telefono: ");
            String telefono= input.nextLine();

            System.out.println("Scrivi l'email: ");
            String email=input.nextLine();

            System.out.println("Scrivi la lingua dell'azienda: ");
            String lingua= input.nextLine();

            System.out.println("Scrivi l'iban dell'azienda: ");
            String iban= input.nextLine();

            System.out.println("Scrivi delle note: ");
            String note= input.nextLine();

            System.out.println("Scrivi nome del referente: ");
            String referente= input.nextLine();

            System.out.println("Le caratteristiche dell'azienda sono: ");
            System.out.println("Nome: "+ nome);
            System.out.println("Categoria: "+ categoria);
            System.out.println("Partita IVA: "+ PIVA);
            System.out.println("Luogo: "+ luogo);
            System.out.println("Telefono: "+ telefono);
            System.out.println("E-mail: "+ email);
            System.out.println("Lingua: "+ lingua);
            System.out.println("Iban: "+ iban);
            System.out.println("Note: "+ note);
            System.out.println("Referente: "+ referente);

            System.out.println("Vuoi aggiungere un'altra azienda: (si/no)");
            String scelta1= input.nextLine();
            if (scelta1.equalsIgnoreCase("si")){
                System.out.println("OK");
            }else if (scelta1.equalsIgnoreCase("no")){

                System.out.println("Grazie per l'uso.");
                cond=false;
            }else {
                System.out.println("Errore di digitalizzazione.");
            }
        
        }
        input.close();
    }
}