package com.projet.fibonacci.erreur;

/**
 * Exception personnalisée pour les erreurs liées à la suite de Fibonacci.
 */
public class FibonacciException extends RuntimeException {
    public FibonacciException(String message) {
        super(message);
    }
}