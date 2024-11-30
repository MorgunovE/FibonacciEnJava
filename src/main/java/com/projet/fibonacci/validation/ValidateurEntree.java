package com.projet.fibonacci.validation;

/**
 * Classe pour valider les entrées utilisateur.
 */
public class ValidateurEntree {

    /**
     * Valide si une chaîne de caractères est un entier positif.
     *
     * @param input la chaîne de caractères à valider
     * @return true si la chaîne est un entier positif, false sinon
     */
    public static boolean estEntierPositif(String input) {
        try {
            int nombre = Integer.parseInt(input);
            if (nombre < 0) {
                throw new IllegalArgumentException("Le nombre de termes doit être un nombre positif.");
            }
            if (nombre == 0) {
                System.out.println("La suite de Fibonacci pour 0 termes est vide.");
                return false;
            }
            return nombre > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}