package com.projet.fibonacci.controleur;

import com.projet.fibonacci.modele.CalculateurFibonacci;
import com.projet.fibonacci.modele.FibonacciIteratif;
import com.projet.fibonacci.modele.FibonacciRecursif;
import com.projet.fibonacci.vue.FormatteurSortie;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigInteger;

public class ControleurFibonacci {

    private static final Logger logger = LogManager.getLogger(ControleurFibonacci.class);
    private CalculateurFibonacci calculateur;

    public void setCalculateur(CalculateurFibonacci calculateur) {
        this.calculateur = calculateur;
    }

    public void afficherSuite(String methode, int nombreDeTermes) {
        try {
            BigInteger[] suite = getSuite(methode, nombreDeTermes);
            FormatteurSortie.afficher(suite);
        } catch (IllegalArgumentException e) {
            logger.error("Erreur: ", e);
            System.err.println("Erreur: " + e.getMessage());
        }
    }

    public BigInteger[] getSuite(String methode, int nombreDeTermes) {
        if (nombreDeTermes < 0) {
            throw new IllegalArgumentException("Le nombre de termes doit être positif.");
        }
        if ("itérative".equals(methode)) {
            setCalculateur(new FibonacciIteratif());
            return calculateur.calculerSuite(nombreDeTermes);
        } else {
            setCalculateur(new FibonacciRecursif());
            BigInteger[] suite = new BigInteger[nombreDeTermes];
            for (int i = 0; i < nombreDeTermes; i++) {
                suite[i] = calculateur.calculer(i);
            }
            return suite;
        }
    }
}