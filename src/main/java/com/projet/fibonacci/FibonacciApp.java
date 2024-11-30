package com.projet.fibonacci;

import com.projet.fibonacci.service.FibonacciService;
import com.projet.fibonacci.service.InputReader;
import com.projet.fibonacci.service.ScannerInputReader;

import java.util.InputMismatchException;

/**
 * Application principale pour exécuter le programme de calcul de la suite de Fibonacci.
 */
public class FibonacciApp {

    /**
     * InputReader pour lire les entrées de l'utilisateur.
     */
    private final InputReader inputReader;

    /**
     * Service pour gérer les opérations liées à la suite de Fibonacci.
     */
    private final FibonacciService service;

    public FibonacciApp() {
        this(new ScannerInputReader(new java.util.Scanner(System.in)), new FibonacciService());
    }

    public FibonacciApp(InputReader inputReader, FibonacciService service) {
        this.inputReader = inputReader;
        this.service = service;
    }

    public void run() {
        while (true) {
            try {
                System.out.println("#########################################################");
                System.out.println("############## Programme de calcul de Fibonacci  ###############");
                System.out.println("Entrez le nombre de termes de la suite de Fibonacci à afficher \n(ou tapez 'exit' pour quitter) : ");
                String input = inputReader.nextLine();
                if ("exit".equalsIgnoreCase(input)) {
                    System.out.println("Programme terminé.");
                    break;
                }
                int nombreDeTermes = Integer.parseInt(input);
                if (nombreDeTermes < 0) {
                    throw new IllegalArgumentException("Le nombre de termes doit être un nombre positif.");
                }
                if (nombreDeTermes == 0) {
                    System.out.println("La suite de Fibonacci pour 0 termes est vide.");
                } else {
                    service.comparerMethodes(nombreDeTermes);
                }
            } catch (InputMismatchException | NumberFormatException e) {
                System.err.println("Entrée invalide. Veuillez entrer un nombre entier.");
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        new FibonacciApp().run();
    }
}