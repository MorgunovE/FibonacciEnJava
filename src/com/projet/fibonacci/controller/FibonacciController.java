package com.projet.fibonacci.controller;

import com.projet.fibonacci.model.FibonacciIteratif;
import com.projet.fibonacci.model.FibonacciRecursif;
import com.projet.fibonacci.view.FormatteurSortie;

public class FibonacciController {

    public void afficherSuiteFibonacci(String methode, int nombreDeTermes) {
        long[] fibNombres;
        if ("itérative".equals(methode)) {
            fibNombres = FibonacciIteratif.calculerSuiteFibonacci(nombreDeTermes);
        } else {
            fibNombres = new long[nombreDeTermes];
            for (int i = 0; i < nombreDeTermes; i++) {
                fibNombres[i] = FibonacciRecursif.calculerFibonacci(i);
            }
        }
        FormatteurSortie.afficher(fibNombres);
    }
}