package com.projet.fibonacci.controleur;

import com.projet.fibonacci.modele.CalculateurFibonacci;
import com.projet.fibonacci.modele.FibonacciIteratif;
import com.projet.fibonacci.modele.FibonacciRecursif;
import com.projet.fibonacci.vue.FormatteurSortie;

/**
 * Contrôleur pour gérer l'affichage de la suite de Fibonacci.
 */
public class ControleurFibonacci {

    /**
     * Calculateur de Fibonacci.
     */
    private CalculateurFibonacci calculateur;

    public void setCalculateur(CalculateurFibonacci calculateur) {
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