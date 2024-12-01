package com.projet.fibonacci.validation;

import java.math.BigInteger;

/**
 * Classe pour valider les entrées utilisateur.
 * <p>
 * Cette classe fournit des méthodes pour vérifier si une entrée est un entier positif.
 * </p>
 *
 * @version 2.0
 * @since 2024-11-30
 */
public class ValidateurEntree {

    /**
     * Vérifie si l'entrée est un entier positif.
     *
     * @param input La chaîne de caractères à vérifier.
     * @return true si l'entrée est un entier positif, false sinon.
     */
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