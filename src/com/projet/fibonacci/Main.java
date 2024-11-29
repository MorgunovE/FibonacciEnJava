package com.projet.fibonacci;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * La classe principale qui exécute le programme, compare le temps d'exécution des deux méthodes et affiche les résultats.
 */
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

        try {
            afficherSuiteFibonacci("itérative", nombreDeTermes, FibonacciIteratif::calculerSuiteFibonacci);
            afficherSuiteFibonacci("récursive", nombreDeTermes, n -> {
                int[] fibNombres = new int[n];
                for (int i = 0; i < n; i++) {
                    fibNombres[i] = FibonacciRecursif.calculerFibonacci(i);
                }
                return fibNombres;
            });
        } catch (Exception e) {
            System.err.println("Une erreur s'est produite lors du calcul de la suite de Fibonacci.");
        }
    }

    private static void afficherSuiteFibonacci(String methode, int nombreDeTermes, CalculateurFibonacci calculateur) {
        Chronometre chronometre = new Chronometre();
        chronometre.demarrer();
        int[] fibNombres = calculateur.calculer(nombreDeTermes);
        chronometre.arreter();
        long duree = chronometre.getDureeMicrosecondes();

        System.out.println("----------------------------------------");
        System.out.println("Suite de Fibonacci avec la méthode " + methode + " :");
        for (int i = 0; i < nombreDeTermes; i++) {
            System.out.print(fibNombres[i] + " ");
        }
        System.out.println("\nDurée de la méthode " + methode + " : " + duree + " microsecondes");
        System.out.println("----------------------------------------");
    }

    @FunctionalInterface
    interface CalculateurFibonacci {
        int[] calculer(int n);
    }
}