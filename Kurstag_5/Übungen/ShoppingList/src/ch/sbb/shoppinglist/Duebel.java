/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2017.
 */

package ch.sbb.shoppinglist;

public class Duebel {
    private int anzahl;
    private int preis;

    //TODO: macht es wirklich Sinn, dass alles im Konstruktor zu machen?
    public Duebel(int anzahl, int preis){
        this.anzahl = anzahl;
        this.preis = preis;
    }

    public void anzahlÄndern(int i) {
       this.anzahl = i;
    }

    public static int anzahlAusgeben(){
       return 2;
    }
}
