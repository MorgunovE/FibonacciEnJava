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

/**
 * Contrôleur pour la gestion des calculs de la suite de Fibonacci.
 * <p>
 * Cette classe gère l'interaction avec l'utilisateur, la validation des entrées,
 * et la délégation des calculs au service approprié.
 * </p>
 *
 * @version 2.0
 * @since 2024-11-30
 */
public class ControleurFibonacci {

    private static final Logger logger = LogManager.getLogger(ControleurFibonacci.class);
    private final LecteurEntree lecteurEntree;
    private final FibonacciService fibonacciService;
    private CalculateurFibonacci calculateur;

    /**
     * Constructeur de la classe ControleurFibonacci.
     *
     * @param lecteurEntree Le lecteur d'entrée pour lire les données de l'utilisateur.
     * @param fibonacciService Le service de calcul de Fibonacci.
     */
    public ControleurFibonacci(LecteurEntree lecteurEntree, FibonacciService fibonacciService) {
        this.lecteurEntree = lecteurEntree;
        this.fibonacciService = fibonacciService;
    }

    /**
     * Démarre le contrôleur et gère l'interaction avec l'utilisateur.
     */
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
                BigInteger nombreDeTermes = new BigInteger(input);
                fibonacciService.comparerMethodes(nombreDeTermes);
            } catch (Exception e) {
                logger.error("Erreur: ", e);
                System.err.println("Erreur: " + e.getMessage());
            }
        }
    }

    /**
     * Affiche le menu pour l'utilisateur.
     */
    private void afficherMenu() {
        System.out.println("#########################################################");
        System.out.println("############## Programme de calcul de Fibonacci  ###############");
        System.out.println("Entrez le nombre de termes de la suite de Fibonacci à afficher \n(ou tapez 'exit' pour quitter) : ");
    }

    /**
     * Affiche la suite de Fibonacci en utilisant la méthode spécifiée.
     *
     * @param methode La méthode de calcul ("itérative" ou "récursive").
     * @param nombreDeTermes Le nombre de termes de la suite de Fibonacci à afficher.
     */
    public void afficherSuite(String methode, BigInteger nombreDeTermes) {
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

    /**
     * Retourne la suite de Fibonacci en utilisant la méthode spécifiée.
     *
     * @param methode La méthode de calcul ("itérative" ou "récursive").
     * @param nombreDeTermes Le nombre de termes de la suite de Fibonacci à retourner.
     * @return Un tableau de BigInteger représentant la suite de Fibonacci.
     */
    public BigInteger[] getSuite(String methode, BigInteger nombreDeTermes) {
        if ("itérative".equalsIgnoreCase(methode)) {
            setCalculateur(new FibonacciIteratif());
        } else if ("récursive".equalsIgnoreCase(methode)) {
            setCalculateur(new FibonacciRecursif());
        } else {
            throw new IllegalArgumentException("Méthode inconnue: " + methode);
        }
        return calculateur.calculerSuite(nombreDeTermes);
    }

    /**
     * Définit le calculateur de Fibonacci à utiliser.
     *
     * @param calculateur Le calculateur de Fibonacci.
     */
    public void setCalculateur(CalculateurFibonacci calculateur) {
        this.calculateur = calculateur;
    }
}