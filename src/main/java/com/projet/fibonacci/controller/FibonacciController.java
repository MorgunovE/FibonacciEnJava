package com.projet.fibonacci.controller;

import com.projet.fibonacci.model.FibonacciCalculateur;
import com.projet.fibonacci.model.FibonacciIteratif;
import com.projet.fibonacci.model.FibonacciRecursif;
import com.projet.fibonacci.view.FormatteurSortie;

/**
 * Contrôleur pour gérer l'affichage de la suite de Fibonacci.
 */
public class FibonacciController {

    /**
     * Calculateur de Fibonacci.
     */
    private FibonacciCalculateur calculateur;

    public void setCalculateur(FibonacciCalculateur calculateur) {
        this.calculateur = calculateur;
    }

    public void afficherSuite(String methode, int nombreDeTermes) {
        long[] suite = getSuite(methode, nombreDeTermes);
        FormatteurSortie.afficher(suite);
    }

    public long[] getSuite(String methode, int nombreDeTermes) {
        if ("itérative".equals(methode)) {
            setCalculateur(new FibonacciIteratif());
            return calculateur.calculerSuite(nombreDeTermes);
        } else {
            setCalculateur(new FibonacciRecursif());
            long[] suite = new long[nombreDeTermes];
            for (int i = 0; i < nombreDeTermes; i++) {
                suite[i] = calculateur.calculer(i);
            }
            return suite;
        }
    }
}