package com.projet.fibonacci.modele;

import java.math.BigInteger;

/**
 * Interface pour le calcul de la suite de Fibonacci.
 * <p>
 * Cette interface définit les méthodes nécessaires pour calculer un terme de la suite de Fibonacci
 * et pour calculer une suite complète de termes de Fibonacci.
 * </p>
 *
 * @version 2.0
 * @since 2024-11-30
 */
public interface CalculateurFibonacci {

    /**
     * Calcule le terme de la suite de Fibonacci pour un indice donné.
     *
     * @param terme L'indice du terme à calculer.
     * @return Le terme de la suite de Fibonacci correspondant à l'indice donné.
     */
    BigInteger calculer(BigInteger terme);

    /**
     * Calcule une suite de termes de Fibonacci jusqu'à un nombre de termes spécifié.
     *
     * @param nombreDeTermes Le nombre de termes de la suite de Fibonacci à calculer.
     * @return Un tableau de BigInteger représentant la suite de Fibonacci.
     */
    default BigInteger[] calculerSuite(BigInteger nombreDeTermes) {
        BigInteger[] suite = new BigInteger[nombreDeTermes.intValue()];
        for (BigInteger i = BigInteger.ZERO; i.compareTo(nombreDeTermes) < 0; i = i.add(BigInteger.ONE)) {
            suite[i.intValue()] = calculer(i);
        }
        return suite;
    }
}