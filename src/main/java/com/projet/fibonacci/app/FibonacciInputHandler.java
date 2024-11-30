package com.projet.fibonacci.app;

import com.projet.fibonacci.service.FibonacciService;
import com.projet.fibonacci.service.LecteurEntree;
import com.projet.fibonacci.validation.ValidateurEntree;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FibonacciInputHandler {

    private static final Logger logger = LogManager.getLogger(FibonacciInputHandler.class);
    private final LecteurEntree lecteurEntree;
    private final FibonacciService fibonacciService;

    public FibonacciInputHandler(LecteurEntree lecteurEntree, FibonacciService fibonacciService) {
        this.lecteurEntree = lecteurEntree;
        this.fibonacciService = fibonacciService;
    }

    public void handleInput() {
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
}