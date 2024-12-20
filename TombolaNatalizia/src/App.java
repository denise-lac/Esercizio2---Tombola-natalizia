/*Esercizio 2 - Tombola natalizia
Scrivere un programma che simula il gioco della Tombola.
-Parte 1:
    Estrarre casualmente una serie di numeri dall'1 al 90 (non si può estrarre 2 volte lo stesso numero)
    Visualizzare i numeri estratti

-Parte 2:
    Generare ulteriori 15 numeri dall'1 al 90 diversi tra loro (che rappresentano la scheda della tombola).
    I numeri della scheda devono essere visualizzati sullo schermo appena parte il programma
    mano a mano che i numeri della parte 1 vengono estratti, bisogna evidenziare i numeri della scheda che corrispondono (ad esempio racchiudendoli tra parentesi quadre)
    il programma termina quando tutti i numeri della scheda sono stati estratti (Tombola!)

-Bonus (per chi termina prima del tempo assegnato) realizzare una o più delle seguenti funzionalità:
    Gestire le cartelle multiple (chiedere all'utente quante cartelle vuole "comprare")
    Visualizzare ogni cartella su 3 righe (come nella seguente immagine: https://www.bianconatale.com/wp-content/uploads/2011/12/Cartelle-Tombola-Bianco-Natale.jpg)
    Visualizzare le vincite intermedie (ambo, terno, quaterna, cinquina)
    Nella generazione della cartella seguire le seguenti regole:
    Ogni riga deve contenere 5 numeri
    In ogni colonna ci possono essere al massimo 2 numeri
    La colonna in cui posizionare il numero dipende dal suo valore (da 1 a 9 nella prima colonna, da 10 a 19 nella seconda, ecc.)
    La riga in cui posizionare il numero è casuale, ma in ogni colonna i numeri devono essere ordinati in maniera crescente */


import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> estrazione = new ArrayList<>();
        Random r=new Random();

        while(estrazione.size()<10) {
            int numeri=r.nextInt(10)+1;
            if (!estrazione.contains(numeri)) {
                estrazione.add(numeri);
            }
            
        }
        
        for (Integer i : estrazione) {
            System.out.println("estrazione "+i);
        }
        
    }
}
