package utils;

/**
 * La classe FibonacciRecursive fournit une méthode pour calculer la suite de Fibonacci
 * en utilisant une approche récursive.
 */
public class FibonacciRecursive {

    /**
     * Calcule le n-ième terme de la suite de Fibonacci de manière récursive.
     *
     * @param n le terme de la suite de Fibonacci à calculer
     * @return le n-ième terme de la suite de Fibonacci
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}