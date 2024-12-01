package com.projet.fibonacci.vue;

import java.math.BigInteger;

/**
 * Classe pour formater et afficher la suite de Fibonacci.
 * <p>
 * Cette classe fournit des méthodes pour afficher la suite de Fibonacci et formater les nombres.
 * </p>
 *
 * @version 2.0
 * @since 2024-11-30
 */
public class FormatteurSortie {

    /**
     * Affiche la suite de Fibonacci.
     *
     * @param suite La suite de Fibonacci à afficher.
     */
    public static void afficher(BigInteger[] suite) {
        for (int i = 0; i < suite.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(formatterNombre(suite[i]));
        }
        System.out.println();
    }

    /**
     * Formate un nombre avec des espaces pour les milliers.
     *
     * @param nombre Le nombre à formater.
     * @return Le nombre formaté en chaîne de caractères.
     */
    private static String formatterNombre(BigInteger nombre) {
        return nombre.toString().replaceAll("(\\d)(?=(\\d{3})+$)", "$1 ");
    }
}