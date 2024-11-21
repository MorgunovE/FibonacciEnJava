package utils;

/**
 * La classe FibonaciClassique fournit une méthode pour calculer la suite de Fibonacci
 * en utilisant une approche itérative.
 */
public class FibonaciClassique {

    /**
     * Calcule la suite de Fibonacci jusqu'au nombre de termes spécifié.
     *
     * @param n le nombre de termes de la suite de Fibonacci à calculer
     * @return un tableau contenant la suite de Fibonacci jusqu'au nombre de termes spécifié
     */
    public static int[] fibClassique(int n) {
        int[] fibNombres = new int[n];
        if (n > 0) fibNombres[0] = 0;
        if (n > 1) fibNombres[1] = 1;
        for (int i = 2; i < n; i++) {
            fibNombres[i] = fibNombres[i - 1] + fibNombres[i - 2];
        }
        return fibNombres;
    }
}