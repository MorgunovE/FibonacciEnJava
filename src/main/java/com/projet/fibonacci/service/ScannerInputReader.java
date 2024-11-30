package com.projet.fibonacci.service;

import java.util.Scanner;

/**
 * Implementation of InputReader that uses a Scanner to read input.
 */
public class ScannerInputReader implements InputReader {

    /**
     * Scanner to read input from the user.
     */
    private final Scanner scanner;

    /**
     * Constructs a ScannerInputReader with the specified Scanner.
     *
     * @param scanner the Scanner to use for reading input
     */
    public ScannerInputReader(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public int nextInt() {
        return scanner.nextInt();
    }
}