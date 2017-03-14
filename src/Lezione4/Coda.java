package Lezione4;

/**
 * Created by Mario on 12/03/2017.
 */

import java.util.Objects;

import static java.lang.System.out;

/**Classe per gestire oggetti di tipo Coda. Crea una sorta di lista linkata con un puntatore al primo elemento e all'ultimo dela ooda.
 * Tramite questi due puntatori la classe effettua in tempo costante sia inserimento che rimozione.
 */
public class Coda {

    public int element;     //l'elemento della coda
    public Coda next;       //Il successivo elemento della coda
    public Coda start;      //Il primo elemento della coda
    public Coda end;        //L'ultimo elemento della coda
    int size = 0;       //La dimensione della coda

    /**
     * Crea un oggetto di tipo coda.
     */
    Coda() {
        this.next = null;
        this.start = null;
        this.end = null;
    }

    /**
     * Permette di inserire un intero in cima alla coda.
     * @param n Inserisce l'intero n nella coda
     */
    public void inserisci(int n) {
        Coda nuovo = new Coda();
        nuovo.element = n;
        if (start == null) {
            start = nuovo;
            start.next = null;
            end = nuovo;
        } else {
            end.next = nuovo;
            end = end.next;
        }
        size++;
    }

    /**
     * L'operazione di estrazione da una coda. Viene estratto il primo elemento.
     * @return L'intero estratto. Ovvero il primo elemento della coda.
     * @throws Coda_Vuota_Exception se la coda non contiene neussun elemento.
     */
    public int estrai() throws Coda_Vuota_Exception {
        if (size == 0) throw new Coda_Vuota_Exception();
        int result = start.element;
        start = start.next;
        size--;
        return result;
    }

    /**
     * Funzione per determinare se la coda è vuota.
     * @return true se la coda è vuota. Falso se contiene almeno un elemento.
     */
    public boolean is_empty() {
        if (Objects.equals(start, null))
            return true;
        else return false;
    }

    public static void main(String[] args) throws Coda_Vuota_Exception {
        test1();
    }

    public static void test1() throws Coda_Vuota_Exception {
        Coda prova = new Coda();
        prova.inserisci(-3);
        prova.inserisci(5);
        prova.inserisci(3);
        prova.inserisci(1);
        out.println(prova.start.element);
        out.println(prova.start.next.element);
        out.println(prova.end.element);




    }
}



