package com.projet.fibonacci.controleur;

import com.projet.fibonacci.modele.CalculateurFibonacci;
import com.projet.fibonacci.modele.FibonacciIteratif;
import com.projet.fibonacci.modele.FibonacciRecursif;
import com.projet.fibonacci.service.FibonacciService;
import com.projet.fibonacci.service.LecteurEntree;
import com.projet.fibonacci.validation.ValidateurEntree;
import com.projet.fibonacci.vue.FormatteurSortie;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigInteger;

public class ControleurFibonacci {

    private static final Logger logger = LogManager.getLogger(ControleurFibonacci.class);
    private final LecteurEntree lecteurEntree;
    private final FibonacciService fibonacciService;
    private CalculateurFibonacci calculateur;

    public ControleurFibonacci(LecteurEntree lecteurEntree, FibonacciService fibonacciService) {
        this.lecteurEntree = lecteurEntree;
        this.fibonacciService = fibonacciService;
    }

    public void demarrer() {
        while (true) {
            try {
                afficherMenu();
                String input = lecteurEntree.nextLine();
                if ("exit".equalsIgnoreCase(input)) {
                    System.out.println("Programme terminé.");
                    break;
                }
                if (!ValidateurEntree.estEntierPositif(input)) {
                    throw new IllegalArgumentException("Le nombre de termes doit être un entier positif.");
                }
                int nombreDeTermes = Integer.parseInt(input);
                fibonacciService.comparerMethodes(nombreDeTermes);
            } catch (Exception e) {
                logger.error("Erreur: ", e);
                System.err.println("Erreur: " + e.getMessage());
            }
        }
    }

    private void afficherMenu() {
        System.out.println("#########################################################");
        System.out.println("############## Programme de calcul de Fibonacci  ###############");
        System.out.println("Entrez le nombre de termes de la suite de Fibonacci à afficher \n(ou tapez 'exit' pour quitter) : ");
    }

    public void afficherSuite(String methode, int nombreDeTermes) {
        if ("itérative".equalsIgnoreCase(methode)) {
            setCalculateur(new FibonacciIteratif());
        } else if ("récursive".equalsIgnoreCase(methode)) {
            setCalculateur(new FibonacciRecursif());
        } else {
            throw new IllegalArgumentException("Méthode inconnue: " + methode);
        }
        BigInteger[] suite = calculateur.calculerSuite(nombreDeTermes);
        FormatteurSortie.afficher(suite);
    }

    public BigInteger[] getSuite(String methode, int nombreDeTermes) {
        if ("itérative".equalsIgnoreCase(methode)) {
            setCalculateur(new FibonacciIteratif());
        } else if ("récursive".equalsIgnoreCase(methode)) {
            setCalculateur(new FibonacciRecursif());
        } else {
            throw new IllegalArgumentException("Méthode inconnue: " + methode);
        }
        return calculateur.calculerSuite(nombreDeTermes);
    }

    public void setCalculateur(CalculateurFibonacci calculateur) {
        this.calculateur = calculateur;
    }
}