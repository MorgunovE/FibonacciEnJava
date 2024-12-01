package com.projet.fibonacci.validation;

import java.math.BigInteger;

public class ValidateurEntree {

    public static boolean estEntierPositif(String input) {
        try {
            BigInteger nombre = new BigInteger(input);
            if (nombre.compareTo(BigInteger.ZERO) < 0) {
                throw new IllegalArgumentException("Le nombre de termes doit être un nombre positif.");
            }
            if (nombre.equals(BigInteger.ZERO)) {
                System.out.println("La suite de Fibonacci pour 0 termes est vide.");
                return false;
            }
            return nombre.compareTo(BigInteger.ZERO) > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}