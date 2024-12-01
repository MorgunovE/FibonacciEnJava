package com.projet.fibonacci.util;

/**
 * Classe pour mesurer la durée d'exécution en microsecondes.
 * <p>
 * Cette classe permet de démarrer et d'arrêter un chronomètre et de récupérer la durée écoulée en microsecondes.
 * </p>
 *
 * @version 2.0
 * @since 2024-11-30
 * @author Evgenii Morgunov
 */
public class Chronometre {

    /**
     * Temps de début en nanosecondes.
     */
    private long debut;

    /**
     * Temps de fin en nanosecondes.
     */
    private long fin;

    /**
     * Démarre le chronomètre.
     */
    public void demarrer() {
        debut = System.nanoTime();
    }

    /**
     * Arrête le chronomètre.
     */
    public void arreter() {
        fin = System.nanoTime();
    }

    /**
     * Retourne la durée écoulée en microsecondes.
     *
     * @return La durée écoulée en microsecondes.
     */
    public long getDureeMicrosecondes() {
        return (fin - debut) / 1000;
    }
}