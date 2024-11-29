package com.projet.fibonacci;

/**
 * La classe FibonacciRecursif fournit une méthode pour calculer la suite de Fibonacci
 * en utilisant une approche récursive.
 */
public class FibonacciRecursif {

    /**
     * Calcule le n-ième terme de la suite de Fibonacci de manière récursive.
     *
     * @param n le terme de la suite de Fibonacci à calculer
     * @return le n-ième terme de la suite de Fibonacci
     * @throws IllegalArgumentException si n est négatif
     */
    public static int calculer(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Le terme de la suite de Fibonacci ne peut pas être négatif.");
        }
        if (n <= 1) {
            return n;
        }
        return calculer(n - 1) + calculer(n - 2);
    }
}