package com.projet.fibonacci.modele;

import java.math.BigInteger;

public interface CalculateurFibonacci {
    BigInteger calculer(int terme);
    default BigInteger[] calculerSuite(int nombreDeTermes) {
        BigInteger[] suite = new BigInteger[nombreDeTermes];
        for (int i = 0; i < nombreDeTermes; i++) {
            suite[i] = calculer(i);
        }
        return suite;
    }
}