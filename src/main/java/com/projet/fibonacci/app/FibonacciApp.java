package com.projet.fibonacci.app;

import com.projet.fibonacci.controleur.ControleurFibonacci;
import com.projet.fibonacci.service.FibonacciService;
import com.projet.fibonacci.service.LecteurEntree;
import com.projet.fibonacci.service.LecteurScanner;
import com.projet.fibonacci.util.Chronometre;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Classe principale pour l'application de calcul de la suite de Fibonacci.
 * <p>
 * Cette classe initialise les composants nécessaires et démarre l'application.
 * </p>
 *
 * @author Evgenii Morgunov
 * @version 2.0
 * @since 2024-11-30
 */
public class FibonacciApp {

    private static final Logger logger = LogManager.getLogger(FibonacciApp.class);
    private final LecteurEntree lecteurEntree;
    private final FibonacciService service;

    /**
     * Constructeur de la classe FibonacciApp.
     *
     * @param lecteurEntree Le lecteur d'entrée pour lire les données de l'utilisateur.
     * @param service Le service de calcul de Fibonacci.
     */
    public FibonacciApp(LecteurEntree lecteurEntree, FibonacciService service) {
        this.lecteurEntree = lecteurEntree;
        this.service = service;
    }

    /**
     * Méthode principale pour démarrer l'application.
     *
     * @param args Les arguments de la ligne de commande.
     */
    public static void main(String[] args) {
        LecteurEntree lecteurEntree = new LecteurScanner(new java.util.Scanner(System.in));
        Chronometre chronometre = new Chronometre();
        ControleurFibonacci controleur = new ControleurFibonacci(lecteurEntree, null);
        FibonacciService service = new FibonacciService(controleur, chronometre);
        FibonacciApp app = new FibonacciApp(lecteurEntree, service);
        app.run();
    }

    /**
     * Méthode pour exécuter l'application.
     */
    public void run() {
        ControleurFibonacci controleur = new ControleurFibonacci(lecteurEntree, service);
        controleur.demarrer();
    }
}