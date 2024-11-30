package com.projet.fibonacci.view;

public class FormatteurSortie {

    public static void afficher(long[] suite) {
        for (int i = 0; i < suite.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(formatterNombre(suite[i]));
        }
        System.out.println();
    }

    private static String formatterNombre(long nombre) {
        return String.valueOf(nombre).replaceAll("(\\d)(?=(\\d{3})+$)", "$1 ");
    }
}