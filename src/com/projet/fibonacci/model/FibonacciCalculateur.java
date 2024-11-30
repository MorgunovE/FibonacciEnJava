package com.projet.fibonacci.model;

public interface FibonacciCalculateur {
    long calculer(int terme);
    default long[] calculerSuite(int nombreDeTermes) {
        long[] suite = new long[nombreDeTermes];
        for (int i = 0; i < nombreDeTermes; i++) {
            suite[i] = calculer(i);
        }
        return suite;
    }
}