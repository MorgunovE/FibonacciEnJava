package com.projet.fibonacci.view;

/**
 * La classe FormatteurSortie fournit des méthodes pour formater et afficher les nombres de la suite de Fibonacci.
 */
public class FormatteurSortie {

    /**
     * Formate et affiche les nombres de la suite de Fibonacci.
     *
     * @param fibNombres le tableau contenant les nombres de la suite de Fibonacci
     */
    public static void afficher(long[] fibNombres) {
        for (int i = 0; i < fibNombres.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(formatterNombre(fibNombres[i]));
        }
        System.out.println();
    }

    /**
     * Formate un nombre en séparant les chiffres par des espaces.
     *
     * @param nombre le nombre à formater
     * @return le nombre formaté en tant que chaîne de caractères
     */
    private static String formatterNombre(long nombre) {
        return String.valueOf(nombre).replaceAll("(\\d)(?=(\\d{3})+$)", "$1 ");
    }
}