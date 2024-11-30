package com.projet.fibonacci.modele;

import java.math.BigInteger;

public class FibonacciIteratif implements CalculateurFibonacci {

    @Override
    public BigInteger calculer(int terme) {
        if (terme < 0) {
            throw new IllegalArgumentException("Le terme de la suite de Fibonacci ne peut pas être négatif.");
        }
        if (terme == 0) {
            return BigInteger.ZERO;
        }
        if (terme == 1) {
            return BigInteger.ONE;
        }
        BigInteger a = BigInteger.ZERO, b = BigInteger.ONE;
        for (int i = 2; i <= terme; i++) {
            BigInteger temp = a.add(b);
            a = b;
            b = temp;
        }
        return b;
    }

    @Override
    public BigInteger[] calculerSuite(int nombreDeTermes) {
        if (nombreDeTermes < 0) {
            throw new IllegalArgumentException("Le nombre de termes de la suite de Fibonacci ne peut pas être négatif.");
        }
        BigInteger[] suite = new BigInteger[nombreDeTermes];
        if (nombreDeTermes > 0) suite[0] = BigInteger.ZERO;
        if (nombreDeTermes > 1) suite[1] = BigInteger.ONE;
        for (int i = 2; i < nombreDeTermes; i++) {
            suite[i] = suite[i - 1].add(suite[i - 2]);
        }
        return suite;
    }
}