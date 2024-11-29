package com.projet.fibonacci;

import java.util.HashMap;
import java.util.Map;

/**
 * La classe FibonacciRecursif fournit une méthode pour calculer la suite de Fibonacci
 * en utilisant une approche récursive avec mémoïsation.
 */
public class FibonacciRecursif {

    private static Map<Integer, Long> memo = new HashMap<>();

    /**
     * Calcule le n-ième terme de la suite de Fibonacci de manière récursive avec mémoïsation.
     *
     * @param n le terme de la suite de Fibonacci à calculer
     * @return le n-ième terme de la suite de Fibonacci
     * @throws IllegalArgumentException si n est négatif
     */
    public static long calculerFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Le terme de la suite de Fibonacci ne peut pas être négatif.");
        }
        if (n <= 1) {
            return n;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        long result = calculerFibonacci(n - 1) + calculerFibonacci(n - 2);
        memo.put(n, result);
        return result;
    }
}