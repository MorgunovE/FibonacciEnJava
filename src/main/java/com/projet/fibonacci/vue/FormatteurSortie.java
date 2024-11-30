package com.projet.fibonacci.vue;

import java.math.BigInteger;

public class FormatteurSortie {

    public static void afficher(BigInteger[] suite) {
        for (int i = 0; i < suite.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(formatterNombre(suite[i]));
        }
        System.out.println();
    }

    private static String formatterNombre(BigInteger nombre) {
        return nombre.toString().replaceAll("(\\d)(?=(\\d{3})+$)", "$1 ");
    }
}