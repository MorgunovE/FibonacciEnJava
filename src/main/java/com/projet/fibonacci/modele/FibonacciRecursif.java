package com.projet.fibonacci.modele;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * Classe pour calculer la suite de Fibonacci de manière récursive.
 */
public class FibonacciRecursif implements CalculateurFibonacci {

    /**
     * Mémoisation pour stocker les résultats intermédiaires des calculs.
     */
    private static Map<Integer, BigInteger> memo = new HashMap<>();

    @Override
    public BigInteger calculer(int terme) {
        if (terme < 0) {
            throw new IllegalArgumentException("Le terme de la suite de Fibonacci ne peut pas être négatif.");
        }
        if (terme <= 1) {
            return BigInteger.valueOf(terme);
        }
        if (memo.containsKey(terme)) {
            return memo.get(terme);
        }
        BigInteger resultat = calculer(terme - 1).add(calculer(terme - 2));
        memo.put(terme, resultat);
        return resultat;
    }
}