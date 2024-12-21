import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random r = new Random();
        ArrayList<Integer> estrazione = new ArrayList<>();
        ArrayList<Integer> scheda = new ArrayList<>();

        //Stampo un messaggio iniziale
        System.out.println("GIOCHIAMO A TOMBOLA!");

        //Genero randomicamente la scheda di 15 numeri
        while (scheda.size() < 15) {
            int numeriScheda = r.nextInt(90) + 1;
            // mi assicuro che non ci siano doppioni
            if (!scheda.contains(numeriScheda)) {
                scheda.add(numeriScheda);
            }
        } 

        // stampo la scheda iniziale
        System.out.println("\n\nEcco la tua cartella:");
        System.out.println("-------------------------------------------------------------------------------------------");
        for (Integer i : scheda) {
            System.out.print(i+ " ");
        }
        System.out.println("\n-------------------------------------------------------------------------------------------");

        // Genero randomicamente 90 numeri
        while (estrazione.size() < 90) {
            int numeri = r.nextInt(90) + 1;

            // mi assicuro che non ci siano doppioni
            if (!estrazione.contains(numeri)) {
                estrazione.add(numeri);

                // elimino i numeri estratti contenuti nella scheda
                if (scheda.contains(numeri)) {
                    System.out.println("\n\nDopo vari numeri estratti, finalmente ecco uno contenuto nella tua cartella:    "+numeri);
                    System.out.println("\n\nCartella aggiornata:");
                    System.out.println("-------------------------------------------------------------------------------------------");
                    for (int n : scheda) {
                        if (estrazione.contains(n)) {
                            System.out.print(" ["+n+"] ");  // evidenzio i numeri estratti
                        } else {
                            System.out.print(n + " ");      // numeri non estratti
                        }
                    }
                    System.out.println("\n-------------------------------------------------------------------------------------------");
                }
            }

        }
        System.out.println("\n\nTOMBOLA!\n\n");

    }
}
