package com.projet.fibonacci.controller;

import com.projet.fibonacci.model.FibonacciCalculateur;
import com.projet.fibonacci.model.FibonacciIteratif;
import com.projet.fibonacci.model.FibonacciRecursif;
import com.projet.fibonacci.view.FormatteurSortie;

/**
 * Contrôleur pour gérer l'affichage de la suite de Fibonacci.
 */
public class FibonacciController {

    private FibonacciCalculateur calculateur;

    public void setCalculateur(FibonacciCalculateur calculateur) {
        this.calculateur = calculateur;
    }

    public void afficherSuite(String methode, int nombreDeTermes) {
        long[] suite;
        if ("itérative".equals(methode)) {
            setCalculateur(new FibonacciIteratif());
            suite = calculateur.calculerSuite(nombreDeTermes);
        } else {
            setCalculateur(new FibonacciRecursif());
            suite = new long[nombreDeTermes];
            for (int i = 0; i < nombreDeTermes; i++) {
                suite[i] = calculateur.calculer(i);
            }
        }
        FormatteurSortie.afficher(suite);
    }
}