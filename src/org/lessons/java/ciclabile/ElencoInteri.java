package org.lessons.java.ciclabile;

public class ElencoInteri {
	
	private int [] elenco; // Array di numeri 
	private int indice;
	
	// Costruttore che prende un array di numeri interi
	public ElencoInteri (int [] numeri) {
		this.elenco = numeri;
		this.indice = 0; //Inizialliziamo l'indice a 0
	}
	// Meteodo che ci restituisce l'elemento successivo se presente
	public int getElementoSuccessivo () {
        if (hasAncoraElementi()) {
            return elenco[indice ++]; 
        } return indice = 0;
	} 
    // Metodo che verifica se ci sono ancora elementi
    public boolean hasAncoraElementi() {
        return indice < elenco.length;  // Se l'indice è inferiore alla lunghezza dell'array vorrà dire che ci sono ancora elementi
    }
    

}
