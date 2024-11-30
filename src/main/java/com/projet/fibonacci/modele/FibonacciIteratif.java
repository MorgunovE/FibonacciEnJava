package com.projet.fibonacci.modele;

/**
 * Classe pour calculer les termes de la suite de Fibonacci de manière itérative.
 */
public class FibonacciIteratif implements CalculateurFibonacci {

    @Override
    public long calculer(int terme) {
        if (terme < 0) {
            throw new IllegalArgumentException("Le terme de la suite de Fibonacci ne peut pas être négatif.");
        }
        if (terme == 0) {
            return 0;
        }
        if (terme == 1) {
            return 1;
        }
        long a = 0, b = 1;
        for (int i = 2; i <= terme; i++) {
            long temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    @Override
    public long[] calculerSuite(int nombreDeTermes) {
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