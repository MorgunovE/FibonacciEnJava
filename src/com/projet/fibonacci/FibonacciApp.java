package com.projet.fibonacci;

import com.projet.fibonacci.controller.FibonacciController;
import com.projet.fibonacci.model.Chronometre;

import java.util.InputMismatchException;
import java.util.Scanner;

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

        FibonacciController controller = new FibonacciController();
        Chronometre chronometre = new Chronometre();

        chronometre.demarrer();
        controller.afficherSuiteFibonacci("itérative", nombreDeTermes);
        chronometre.arreter();
        long dureeIterative = chronometre.getDureeMicrosecondes();
        System.out.println("Durée de la méthode itérative : " + dureeIterative + " microsecondes");

        chronometre.demarrer();
        controller.afficherSuiteFibonacci("récursive", nombreDeTermes);
        chronometre.arreter();
        long dureeRecursive = chronometre.getDureeMicrosecondes();
        System.out.println("Durée de la méthode récursive : " + dureeRecursive + " microsecondes");

        System.out.println("Comparaison des durées : ");
        if (dureeIterative < dureeRecursive) {
            System.out.println("La méthode itérative est plus rapide que la méthode récursive de "
                    + (dureeRecursive - dureeIterative) + " microsecondes pour "
                    + nombreDeTermes + " termes.");
        } else {
            System.out.println("La méthode récursive est plus rapide que la méthode itérative de "
                    + (dureeIterative - dureeRecursive) + " microsecondes pour "
                    + nombreDeTermes + " termes.");
        }
    }
}