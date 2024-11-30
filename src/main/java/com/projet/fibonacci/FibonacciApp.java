package com.projet.fibonacci;

import com.projet.fibonacci.service.FibonacciService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FibonacciApp {

    private final Scanner scanner;
    private final FibonacciService service;

    public FibonacciApp() {
        this(new Scanner(System.in), new FibonacciService());
    }

    public FibonacciApp(Scanner scanner, FibonacciService service) {
        this.scanner = scanner;
        this.service = service;
    }

    public void run() {
        int nombreDeTermes = 0;

        try {
            System.out.println("#########################################################");
            System.out.println("############## Programme de calcul de Fibonacci  ###############");
            System.out.println("Entrez le nombre de termes de la suite de Fibonacci à afficher : ");
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

        service.comparerMethodes(nombreDeTermes);
    }

    public static void main(String[] args) {
        new FibonacciApp().run();
    }
}