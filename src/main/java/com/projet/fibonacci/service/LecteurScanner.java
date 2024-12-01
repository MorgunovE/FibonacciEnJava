package com.projet.fibonacci.service;

import java.util.Scanner;

/**
 * Implémentation de LecteurEntree utilisant un Scanner pour lire les entrées.
 * <p>
 * Cette classe utilise un Scanner pour lire les entrées de l'utilisateur.
 * </p>
 *
 * @version 2.0
 * @since 2024-11-30
 */
public class LecteurScanner implements LecteurEntree {

    /**
     * Scanner pour lire les entrées de l'utilisateur.
     */
    private final Scanner scanner;

    /**
     * Construit un LecteurScanner avec le Scanner spécifié.
     *
     * @param scanner le Scanner à utiliser pour lire les entrées
     */
    public LecteurScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    /**
     * Lit la prochaine entrée utilisateur sous forme d'entier.
     *
     * @return Le prochain entier entré par l'utilisateur.
     */
    @Override
    public int nextInt() {
        return scanner.nextInt();
    }

    /**
     * Lit la prochaine entrée utilisateur sous forme de chaîne de caractères.
     *
     * @return La prochaine ligne de texte entrée par l'utilisateur.
     */
    @Override
    public String nextLine() {
        return scanner.nextLine();
    }
}