package com.projet.fibonacci.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Classe pour calculer les termes de la suite de Fibonacci de manière récursive.
 */
public class FibonacciRecursif implements FibonacciCalculateur {

    /**
     * Mémoisation des résultats de la suite de Fibonacci.
     */
    private static Map<Integer, Long> memo = new HashMap<>();

    @Override
    public long calculer(int terme) {
        if (terme < 0) {
            throw new IllegalArgumentException("Le terme de la suite de Fibonacci ne peut pas être négatif.");
        }
        if (terme <= 1) {
            return terme;
        }
        if (memo.containsKey(terme)) {
            return memo.get(terme);
        }
        long resultat = calculer(terme - 1) + calculer(terme - 2);
        memo.put(terme, resultat);
        return resultat;
    }
}