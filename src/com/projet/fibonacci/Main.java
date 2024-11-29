package com.projet.fibonacci;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
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

        afficherFibonacciIteratif(nombreDeTermes);
        afficherFibonacciRecursif(nombreDeTermes);
    }

    private static void afficherFibonacciIteratif(int nombreDeTermes) {
        Chronometre chronometre = new Chronometre();
        chronometre.demarrer();
        int[] fibNombres = FibonacciIteratif.calculer(nombreDeTermes);
        chronometre.arreter();
        long duree = chronometre.getDureeMicrosecondes();

        System.out.println("----------------------------------------");
        System.out.println("Suite de Fibonacci avec la méthode itérative :");
        for (int i = 0; i < nombreDeTermes; i++) {
            System.out.print(fibNombres[i] + " ");
        }
        System.out.println("\nDurée de la méthode itérative : " + duree + " microsecondes");
        System.out.println("----------------------------------------");
    }

    private static void afficherFibonacciRecursif(int nombreDeTermes) {
        Chronometre chronometre = new Chronometre();
        chronometre.demarrer();
        int[] fibNombres = new int[nombreDeTermes];
        for (int i = 0; i < nombreDeTermes; i++) {
            fibNombres[i] = FibonacciRecursif.calculer(i);
        }
        chronometre.arreter();
        long duree = chronometre.getDureeMicrosecondes();

        System.out.println("----------------------------------------");
        System.out.println("Suite de Fibonacci avec la méthode récursive :");
        for (int i = 0; i < nombreDeTermes; i++) {
            System.out.print(fibNombres[i] + " ");
        }
        System.out.println("\nDurée de la méthode récursive : " + duree + " microsecondes");
        System.out.println("----------------------------------------");
    }
}