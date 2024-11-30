package com.projet.fibonacci.app;

import com.projet.fibonacci.service.FibonacciService;
import com.projet.fibonacci.service.LecteurEntree;
import com.projet.fibonacci.service.LecteurScanner;
import com.projet.fibonacci.validation.ValidateurEntree;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;

public class FibonacciApp {

    /**
     * Logger for the FibonacciApp class.
     */
    private static final Logger logger = LogManager.getLogger(FibonacciApp.class);

    /**
     * LecteurEntree to read input from the user.
     */
    private final LecteurEntree lecteurEntree;

    /**
     * FibonacciService to handle Fibonacci calculations.
     */
    private final FibonacciService service;

    public FibonacciApp() {
        this(new LecteurScanner(new java.util.Scanner(System.in)), new FibonacciService());
    }

    public FibonacciApp(LecteurEntree lecteurEntree, FibonacciService service) {
        this.lecteurEntree = lecteurEntree;
        this.service = service;
    }

    public void run() {
        FibonacciInputHandler inputHandler = new FibonacciInputHandler(lecteurEntree, service);
        inputHandler.handleInput();
    }

    public static void main(String[] args) {
        new FibonacciApp().run();
    }
}