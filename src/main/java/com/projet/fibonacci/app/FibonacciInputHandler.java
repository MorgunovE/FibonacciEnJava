package com.projet.fibonacci.app;

import com.projet.fibonacci.service.FibonacciService;
import com.projet.fibonacci.service.LecteurEntree;
import com.projet.fibonacci.validation.ValidateurEntree;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;

public class FibonacciInputHandler {

    /**
     * Logger for the FibonacciInputHandler class.
     */
    private static final Logger logger = LogManager.getLogger(FibonacciInputHandler.class);

    /**
     * LecteurEntree to read input from the user.
     */
    private final LecteurEntree lecteurEntree;

    /**
     * FibonacciService to handle Fibonacci calculations.
     */
    private final FibonacciService service;

    public FibonacciInputHandler(LecteurEntree lecteurEntree, FibonacciService service) {
        this.lecteurEntree = lecteurEntree;
        this.service = service;
    }

    public void handleInput() {
        while (true) {
            try {
                System.out.println("#########################################################");
                System.out.println("############## Programme de calcul de Fibonacci  ###############");
                System.out.println("Entrez le nombre de termes de la suite de Fibonacci à afficher \n(ou tapez 'exit' pour quitter) : ");
                String input = lecteurEntree.nextLine();
                if ("exit".equalsIgnoreCase(input)) {
                    System.out.println("Programme terminé.");
                    break;
                }
                if (!ValidateurEntree.estEntierPositif(input)) {
                    throw new IllegalArgumentException("Le nombre de termes doit être un entier positif.");
                }
                int nombreDeTermes = Integer.parseInt(input);
                service.comparerMethodes(nombreDeTermes);
            } catch (InputMismatchException | NumberFormatException e) {
                logger.error("Entrée invalide: ", e);
                System.err.println("Entrée invalide. Veuillez entrer un nombre entier.");
            } catch (IllegalArgumentException e) {
                logger.error("Erreur: ", e);
                System.err.println(e.getMessage());
            } catch (Exception e) {
                logger.error("Erreur inattendue: ", e);
                System.err.println("Erreur inattendue: " + e.getMessage());
            }
        }
    }
}