package com.projet.fibonacci;

import com.projet.fibonacci.service.FibonacciService;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Application principale pour exécuter le programme de calcul de la suite de Fibonacci.
 */
public class FibonacciApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nombreDeTermes = 0;

        try {
            System.out.println("Entrez le nombre de termes de la suite de Fibonacci à afficher :");
            nombreDeTermes = scanner.nextInt();
            if (nombreDeTermes < 0) {
                throw new IllegalArgumentException("Le nombre de termes doit être un nombre positif.");
            }
        } catch (InputMismatchException e) {
            System.err.println("Entrée invalide. Veuillez entrer un nombre entier.");
            return;
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            return;
        } finally {
            scanner.close();
        }

        FibonacciService service = new FibonacciService();
        service.comparerMethodes(nombreDeTermes);
    }
}