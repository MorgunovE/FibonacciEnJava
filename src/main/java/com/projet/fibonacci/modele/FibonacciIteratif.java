package com.projet.fibonacci.modele;

import java.math.BigInteger;

/**
 * Classe pour le calcul itératif de la suite de Fibonacci.
 * <p>
 * Cette classe implémente l'interface CalculateurFibonacci pour fournir une méthode itérative
 * de calcul des termes de la suite de Fibonacci.
 * </p>
 *
 * @version 2.0
 * @since 2024-11-30
 */
public class FibonacciIteratif implements CalculateurFibonacci {

    /**
     * Calcule le terme de la suite de Fibonacci pour un indice donné de manière itérative.
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
        BigInteger a = BigInteger.ZERO, b = BigInteger.ONE;
        for (BigInteger i = BigInteger.valueOf(2); i.compareTo(terme) <= 0; i = i.add(BigInteger.ONE)) {
            BigInteger temp = a.add(b);
            a = b;
            b = temp;
        }
        return b;
    }

    /**
     * Calcule une suite de termes de Fibonacci jusqu'à un nombre de termes spécifié de manière itérative.
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
        if (nombreDeTermes.compareTo(BigInteger.ZERO) > 0) suite[0] = BigInteger.ZERO;
        if (nombreDeTermes.compareTo(BigInteger.ONE) > 0) suite[1] = BigInteger.ONE;
        for (BigInteger i = BigInteger.valueOf(2); i.compareTo(nombreDeTermes) < 0; i = i.add(BigInteger.ONE)) {
            suite[i.intValue()] = suite[i.intValue() - 1].add(suite[i.intValue() - 2]);
        }
        return suite;
    }
}