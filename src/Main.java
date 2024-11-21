import utils.FibonaciClassique;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nombre de termes de la suite de Fibonacci à afficher :");
        int nombreDeTermes = scanner.nextInt();
        scanner.close();

        // Methode classique (itérative) avec le temps d'exécution
        long startTimeClassique = System.nanoTime();
        int[] fibNombresClassique = FibonaciClassique.fibClassique(nombreDeTermes);
        long endTimeClassique = System.nanoTime();
        long durationClassique = (endTimeClassique - startTimeClassique) / 1000;

        // Methode recursive avec le temps
        long startTimeRecursive = System.nanoTime();
        int[] fibNombresRecursive = new int[nombreDeTermes];
        for (int i = 0; i < nombreDeTermes; i++) {
            fibNombresRecursive[i] = utils.FibonacciRecursive.fibonacci(i);
        }
        long endTimeRecursive = System.nanoTime();
        long durationRecursive = (endTimeRecursive - startTimeRecursive) / 1000;

        System.out.println("----------------------------------------");
        System.out.println("Suite de Fibonacci avec la méthode classique :");
        for (int i = 0; i < nombreDeTermes; i++) {
            System.out.print(fibNombresClassique[i] + " ");
        }
        System.out.println("\nDurée de la méthode classique : " + durationClassique + " microsecondes");
        System.out.println("----------------------------------------");

        System.out.println("----------------------------------------");
        System.out.println("Suite de Fibonacci avec la méthode récursive :");
        for (int i = 0; i < nombreDeTermes; i++) {
            System.out.print(fibNombresRecursive[i] + " ");
        }
        System.out.println("\nDurée de la méthode récursive : " + durationRecursive + " microsecondes");
        System.out.println("----------------------------------------");

        // Comparaison des deux méthodes
        System.out.println("----------------------------------------");
        if (durationClassique < durationRecursive) {
            System.out.println("La méthode classique pour calculer " + nombreDeTermes + " termes de la suite de Fibonacci est plus rapide que la méthode récursive.");
        } else if (durationClassique > durationRecursive) {
            System.out.println("La méthode récursive pour calculer " + nombreDeTermes + " termes de la suite de Fibonacci est plus rapide que la méthode classique.");
        }
        System.out.println("----------------------------------------");


    }
}