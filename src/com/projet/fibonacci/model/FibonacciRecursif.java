package com.projet.fibonacci.model;

import java.util.HashMap;
import java.util.Map;

public class FibonacciRecursif implements FibonacciCalculateur {

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