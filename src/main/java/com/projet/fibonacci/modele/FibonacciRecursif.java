package com.projet.fibonacci.modele;

import java.math.BigInteger;

/**
 * Classe pour le calcul récursif de la suite de Fibonacci.
 * <p>
 * Cette classe implémente l'interface CalculateurFibonacci pour fournir une méthode récursive
 * de calcul des termes de la suite de Fibonacci.
 * </p>
 *
 * @version 2.0
 * @since 2024-11-30
 * @author Evgenii Morgunov
 */
public class FibonacciRecursif implements CalculateurFibonacci {

    /**
     * Calcule le terme de la suite de Fibonacci pour un indice donné de manière récursive.
     *
     * @param terme L'indice du terme à calculer.
     * @return Le terme de la suite de Fibonacci correspondant à l'indice donné.
     */
    @Override
    public BigInteger calculer(BigInteger terme) {
        if (terme.compareTo(BigInteger.ZERO) < 0) {
            throw new IllegalArgumentException("Le terme de la suite de Fibonacci ne peut pas être négatif.");
        }
        if (terme.equals(BigInteger.ZERO)) {
            return BigInteger.ZERO;
        }
        if (terme.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        }
        return calculer(terme.subtract(BigInteger.ONE)).add(calculer(terme.subtract(BigInteger.TWO)));
    }

    /**
     * Calcule une suite de termes de Fibonacci jusqu'à un nombre de termes spécifié de manière récursive.
     *
     * @param nombreDeTermes Le nombre de termes de la suite de Fibonacci à calculer.
     * @return Un tableau de BigInteger représentant la suite de Fibonacci.
     */
    @Override
    public BigInteger[] calculerSuite(BigInteger nombreDeTermes) {
        if (nombreDeTermes.compareTo(BigInteger.ZERO) < 0) {
            throw new IllegalArgumentException("Le nombre de termes de la suite de Fibonacci ne peut pas être négatif.");
        }
        BigInteger[] suite = new BigInteger[nombreDeTermes.intValue()];
        for (BigInteger i = BigInteger.ZERO; i.compareTo(nombreDeTermes) < 0; i = i.add(BigInteger.ONE)) {
            suite[i.intValue()] = calculer(i);
        }
        return suite;
    }
}