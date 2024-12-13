package com.projet.fibonacci.service;

import com.projet.fibonacci.controleur.ControleurFibonacci;
import com.projet.fibonacci.util.Chronometre;

import java.math.BigInteger;

/**
 * Service pour la gestion des calculs de la suite de Fibonacci.
 * <p>
 * Cette classe gère l'affichage des suites de Fibonacci et la comparaison des méthodes de calcul.
 * </p>
 *
 * @version 2.0
 * @since 2024-11-30
 */
public class FibonacciService {

    /**
     * Le contrôleur de Fibonacci.
     */
    private final ControleurFibonacci controleur;

    /**
     * Le chronomètre pour mesurer la durée des calculs.
     */
    private final Chronometre chronometre;

    /**
     * Constructeur de la classe FibonacciService.
     *
     * @param controleur Le contrôleur de Fibonacci.
     * @param chronometre Le chronomètre pour mesurer la durée des calculs.
     */
    public FibonacciService(ControleurFibonacci controleur, Chronometre chronometre) {
        this.controleur = controleur;
        this.chronometre = chronometre;
    }

    /**
     * Affiche la suite de Fibonacci en utilisant la méthode spécifiée.
     *
     * @param methode La méthode de calcul ("itérative" ou "récursive").
     * @param nombreDeTermes Le nombre de termes de la suite de Fibonacci à afficher.
     */
    public void afficherSuite(String methode, BigInteger nombreDeTermes) {
        chronometre.demarrer();
        controleur.afficherSuite(methode, nombreDeTermes);
        chronometre.arreter();
        long duree = chronometre.getDureeMicrosecondes();
        System.out.println("#### Durée de la méthode " + methode + " : " + duree + " microsecondes");
    }

    /**
     * Compare les méthodes itérative et récursive pour le calcul de la suite de Fibonacci.
     *
     * @param nombreDeTermes Le nombre de termes de la suite de Fibonacci à calculer.
     */
    public void comparerMethodes(BigInteger nombreDeTermes) {
        System.out.println("#########################################################");
        System.out.println("####### La calculation de la suite de Fibonacci pour " + nombreDeTermes + " termes ########");

        System.out.println("###################### Méthode itérative ####################");
        chronometre.demarrer();
        controleur.afficherSuite("itérative", nombreDeTermes);
        chronometre.arreter();
        long dureeIterative = chronometre.getDureeMicrosecondes();
        System.out.println("Durée de la méthode itérative : " + dureeIterative + " microsecondes");

        System.out.println("##################### Méthode récursive ####################");
        chronometre.demarrer();
        controleur.afficherSuite("récursive", nombreDeTermes);
        chronometre.arreter();
        long dureeRecursive = chronometre.getDureeMicrosecondes();
        System.out.println("Durée de la méthode récursive : " + dureeRecursive + " microsecondes");

        System.out.println("########################################################");
        System.out.println("################# Comparaison des méthodes  ################");
        if (dureeIterative < dureeRecursive) {
            System.out.println("La méthode itérative est plus rapide que la méthode récursive \nde "
                    + (dureeRecursive - dureeIterative) + " microsecondes pour "
                    + nombreDeTermes + " termes.");
        } else if (dureeIterative > dureeRecursive) {
            System.out.println("La méthode récursive est plus rapide que la méthode itérative \nde "
                    + (dureeIterative - dureeRecursive) + " microsecondes pour "
                    + nombreDeTermes + " termes.");
        } else {
            System.out.println("Les deux méthodes ont la même durée \nde "
                    + dureeIterative + " microsecondes pour "
                    + nombreDeTermes + " termes.");
        }
        System.out.println("########################################################");
    }
}