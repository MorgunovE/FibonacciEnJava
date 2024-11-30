package com.projet.fibonacci.model;

public class FibonacciIteratif {

    public static long[] calculerSuite(int nombreDeTermes) {
        if (nombreDeTermes < 0) {
            throw new IllegalArgumentException("Le nombre de termes de la suite de Fibonacci ne peut pas être négatif.");
        }
        long[] suite = new long[nombreDeTermes];
        if (nombreDeTermes > 0) suite[0] = 0;
        if (nombreDeTermes > 1) suite[1] = 1;
        for (int i = 2; i < nombreDeTermes; i++) {
            suite[i] = suite[i - 1] + suite[i - 2];
        }
        return suite;
    }
}