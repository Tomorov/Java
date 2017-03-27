package Tree;

/**
 * Created by Anonimus on 23/03/2017.
 */
    public interface IntTree { // contratto degli alberi di interi

    /**
     * restituisce il valore associato alla radice
     * @return il valore della radice
     */
    public int getValue();

    /**
     * Il numero di figli di this
     * @return restituisce il numero di figli di this (0 se e’ una foglia)
     */
    public int childrenNumber ();

    /**
     * Il numero di nodi di this
     * @return restituisce il numero di nodi di this; 1 se this una foglia
     */
    public int nodes ();

    /**
     * L'altezza dell'albero
     * @return restituisce la lunghezza del cammino piu’ lungo dalla radice a una foglia
     */
    public int height ();

    /**
     *
     * @param t un albero
     * @return * t1.equals(t2) e’ true se t1 e t2 sono isomorfi, * ovvero indistunguibili ad un osservatore esterno
     */
    public boolean equals (IntTree t);

    /**
     * aggiunge child come primo figlio di this
     * @param child un albero IntTree
     */
    public void addChild (IntTree child); //

    /**
     * Ritorna il sottoalbero individuato da path
     * @param path
     * @return restituisce il sottoalbero individuato da path.
    Ad esempio, se path = [2,3,1], * restituisce il primo figlio del terzo figlio del secondo figlio di this; se un
    tale sottoalbero non esiste lancia NoSuchTreeException
     * @throws NoSuchTreeException se un tale sottoalbero non esiste
     */
    public IntTree followPath (int[] path) throws NoSuchTreeException;

    /**
     * stampa la sequenza di valori associati ai nodi dell’albero
     corrispondente * ad una visita in profondita’ (depth-first) pre-order
      */
    public void visit ();

    /**
     *  pritty prints this, ad esempio usando le parentesi, oppure l’indentazione
     */
    public void printIntTree ();
    }


