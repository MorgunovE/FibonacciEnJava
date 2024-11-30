package com.projet.fibonacci.model;

public class Chronometre {

    private long debut;
    private long fin;

    public void demarrer() {
        debut = System.nanoTime();
    }

    public void arreter() {
        fin = System.nanoTime();
    }

    public long getDureeMicrosecondes() {
        return (fin - debut) / 1000;
    }
}