package com.projet.fibonacci.erreur;

/**
 * Exception personnalisée pour les erreurs d'entrée utilisateur.
 */
public class InputException extends RuntimeException {
    public InputException(String message) {
        super(message);
    }
}