package com.projet.fibonacci.app;

import com.projet.fibonacci.controleur.ControleurFibonacci;
import com.projet.fibonacci.service.FibonacciService;
import com.projet.fibonacci.service.LecteurEntree;
import com.projet.fibonacci.service.LecteurScanner;
import com.projet.fibonacci.util.Chronometre;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FibonacciApp {

    private static final Logger logger = LogManager.getLogger(FibonacciApp.class);
    private final LecteurEntree lecteurEntree;
    private final FibonacciService service;

    public FibonacciApp(LecteurEntree lecteurEntree, FibonacciService service) {
        this.lecteurEntree = lecteurEntree;
        this.service = service;
    }

    public static void main(String[] args) {
        LecteurEntree lecteurEntree = new LecteurScanner(new java.util.Scanner(System.in));
        Chronometre chronometre = new Chronometre();
        ControleurFibonacci controleur = new ControleurFibonacci(lecteurEntree, null);
        FibonacciService service = new FibonacciService(controleur, chronometre);
        FibonacciApp app = new FibonacciApp(lecteurEntree, service);
        app.run();
    }

    public void run() {
        ControleurFibonacci controleur = new ControleurFibonacci(lecteurEntree, service);
        controleur.demarrer();
    }
}