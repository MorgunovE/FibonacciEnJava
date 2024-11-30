package com.projet.fibonacci.service;

import com.projet.fibonacci.controleur.ControleurFibonacci;
import com.projet.fibonacci.util.Chronometre;

/**
 * Service pour gérer les opérations liées à la suite de Fibonacci.
 */
public class FibonacciService {

    /**
     * Contrôleur pour gérer l'affichage de la suite de Fibonacci.
     */
    private final ControleurFibonacci controller;

    /**
     * Chronomètre pour mesurer la durée d'exécution.
     */
    private final Chronometre chronometre;

    public FibonacciService() {
        this(new ControleurFibonacci(), new Chronometre());
    }

    public FibonacciService(ControleurFibonacci controller, Chronometre chronometre) {
        this.controller = controller;
        this.chronometre = chronometre;
    }

    public void afficherSuite(String methode, int nombreDeTermes) {
        chronometre.demarrer();
        controller.afficherSuite(methode, nombreDeTermes);
        chronometre.arreter();
        long duree = chronometre.getDureeMicrosecondes();
        System.out.println("#### Durée de la méthode " + methode + " : " + duree + " microsecondes");
    }

    public void comparerMethodes(int nombreDeTermes) {
        System.out.println("#########################################################");
        System.out.println("####### La calculation de la suite de Fibonacci pour " + nombreDeTermes + " termes ########");

        System.out.println("###################### Méthode itérative ####################");
        chronometre.demarrer();
        controller.afficherSuite("itérative", nombreDeTermes);
        chronometre.arreter();
        long dureeIterative = chronometre.getDureeMicrosecondes();
        System.out.println("Durée de la méthode itérative : " + dureeIterative + " microsecondes");

        System.out.println("##################### Méthode récursive ####################");
        chronometre.demarrer();
        controller.afficherSuite("récursive", nombreDeTermes);
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