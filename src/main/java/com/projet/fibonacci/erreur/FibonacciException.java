package com.projet.fibonacci.erreur;

/**
 * Exception personnalisée pour les erreurs liées à la suite de Fibonacci.
 * <p>
 * Cette classe représente une exception spécifique pour les erreurs survenant lors du calcul de la suite de Fibonacci.
 * </p>
 *
 * @version 2.0
 * @since 2024-11-30
 */
public class FibonacciException extends RuntimeException {

    /**
     * Constructeur de la classe FibonacciException.
     *
     * @param message Le message d'erreur associé à l'exception.
     */
    public FibonacciException(String message) {
        super(message);
    }
}