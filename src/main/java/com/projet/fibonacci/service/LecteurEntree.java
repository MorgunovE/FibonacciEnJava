package com.projet.fibonacci.service;

/**
 * Interface pour la lecture des entrées utilisateur.
 * <p>
 * Cette interface définit les méthodes nécessaires pour lire des entrées de type entier et chaîne de caractères.
 * </p>
 *
 * @version 2.0
 * @since 2024-11-30
 */
public interface LecteurEntree {

    /**
     * Lit la prochaine entrée utilisateur sous forme d'entier.
     *
     * @return Le prochain entier entré par l'utilisateur.
     */
    int nextInt();

    /**
     * Lit la prochaine entrée utilisateur sous forme de chaîne de caractères.
     *
     * @return La prochaine ligne de texte entrée par l'utilisateur.
     */
    String nextLine();
}