package com.projet.fibonacci.erreur;

/**
 * Exception personnalisée pour les erreurs d'entrée utilisateur.
 * <p>
 * Cette classe représente une exception spécifique pour les erreurs survenant lors de la lecture des entrées utilisateur.
 * </p>
 *
 * @author Evgenii Morgunov
 * @version 2.0
 * @since 2024-11-30
 */
public class InputException extends RuntimeException {

    /**
     * Constructeur de la classe InputException.
     *
     * @param message Le message d'erreur associé à l'exception.
     */
    public InputException(String message) {
        super(message);
    }
}