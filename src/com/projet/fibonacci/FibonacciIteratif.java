package com.projet.fibonacci;

/**
 * La classe FibonacciIteratif fournit une méthode pour calculer la suite de Fibonacci
 * en utilisant une approche itérative.
 */
public class FibonacciIteratif {

    /**
     * Calcule la suite de Fibonacci jusqu'au nombre de termes spécifié.
     *
     * @param n le nombre de termes de la suite de Fibonacci à calculer
     * @return un tableau contenant la suite de Fibonacci jusqu'au nombre de termes spécifié
     * @throws IllegalArgumentException si n est négatif
     */
    public static int[] calculer(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Le nombre de termes de la suite de Fibonacci ne peut pas être négatif.");
        }
        int[] fibNombres = new int[n];
        if (n > 0) fibNombres[0] = 0;
        if (n > 1) fibNombres[1] = 1;
        for (int i = 2; i < n; i++) {
            fibNombres[i] = fibNombres[i - 1] + fibNombres[i - 2];
        }
        return fibNombres;
    }
}