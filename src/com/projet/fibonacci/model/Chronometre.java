package com.projet.fibonacci.model;

/**
 * La classe Chronometre fournit des méthodes pour mesurer le temps d'exécution.
 */
public class Chronometre {

    private long startTime;
    private long endTime;

    public void demarrer() {
        startTime = System.nanoTime();
    }

    public void arreter() {
        endTime = System.nanoTime();
    }

    public long getDureeMicrosecondes() {
        return (endTime - startTime) / 1000;
    }
}