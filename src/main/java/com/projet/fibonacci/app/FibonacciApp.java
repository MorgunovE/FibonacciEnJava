package com.projet.fibonacci.app;

import com.projet.fibonacci.service.FibonacciService;
import com.projet.fibonacci.service.LecteurEntree;
import com.projet.fibonacci.service.LecteurScanner;
import com.projet.fibonacci.validation.ValidateurEntree;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;

/**
 * Application principale pour exécuter le programme de calcul de la suite de Fibonacci.
 */
public class FibonacciApp {

    /**
     * Logger pour enregistrer les messages.
     */
    private static final Logger logger = LogManager.getLogger(FibonacciApp.class);

    /**
     * LecteurEntree pour lire les entrées de l'utilisateur.
     */
    private final LecteurEntree lecteurEntree;

    /**
     * Service pour gérer les opérations liées à la suite de Fibonacci.
     */
    private final FibonacciService service;

    public FibonacciApp() {
        this(new LecteurScanner(new java.util.Scanner(System.in)), new FibonacciService());
    }

    public FibonacciApp(LecteurEntree lecteurEntree, FibonacciService service) {
        this.lecteurEntree = lecteurEntree;
        this.service = service;
    }

    public void run() {
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

    public static void main(String[] args) {
        new FibonacciApp().run();
    }
}