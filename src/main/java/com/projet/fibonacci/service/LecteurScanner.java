package com.projet.fibonacci.service;

import java.util.Scanner;

/**
 * Implementation of LecteurEntree that uses a Scanner to read input.
 */
public class LecteurScanner implements LecteurEntree {

    /**
     * Scanner to read input from the user.
     */
    private final Scanner scanner;

    /**
     * Constructs a LecteurScanner with the specified Scanner.
     *
     * @param scanner the Scanner to use for reading input
     */
    public LecteurScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public int nextInt() {
        return scanner.nextInt();
    }

    @Override
    public String nextLine() {
        return scanner.nextLine();
    }
}