package org.lessons.java.ciclabile;

public class Main {

    public static void main(String[] args) {

        int[] numeri = {2, 4, 6, 8, 10}; //Creo un array 
        ElencoInteri elenco = new ElencoInteri(numeri); //Iniziallizzo l'array 

        while (elenco.hasAncoraElementi()) {
            System.out.println("Il prossimo intero è : " + elenco.getElementoSuccessivo());
        }
    
    }
 }

