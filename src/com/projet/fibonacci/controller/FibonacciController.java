package com.projet.fibonacci.controller;

import com.projet.fibonacci.model.FibonacciIteratif;
import com.projet.fibonacci.model.FibonacciRecursif;
import com.projet.fibonacci.view.FormatteurSortie;

public class FibonacciController {

    public void afficherSuite(String methode, int nombreDeTermes) {
        long[] suite;
        if ("itérative".equals(methode)) {
            suite = FibonacciIteratif.calculerSuite(nombreDeTermes);
        } else {
            suite = new long[nombreDeTermes];
            for (int i = 0; i < nombreDeTermes; i++) {
                suite[i] = FibonacciRecursif.calculer(i);
            }
        }
        FormatteurSortie.afficher(suite);
    }
}