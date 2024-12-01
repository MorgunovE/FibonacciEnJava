package com.projet.fibonacci.integration;

import com.projet.fibonacci.app.FibonacciApp;
import com.projet.fibonacci.service.LecteurEntree;
import com.projet.fibonacci.service.FibonacciService;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.mockito.Mockito.*;

/**
 * Classe de test pour FibonacciApp.
 * <p>
 * Cette classe teste les fonctionnalités de FibonacciApp en utilisant des mocks pour les dépendances.
 * </p>
 *
 * @version 2.0
 * @since 2024-11-30
 */
public class FibonacciAppTest {

    /**
     * Teste la méthode main avec une entrée valide.
     */
    @Test
    public void testMain() {
        LecteurEntree mockLecteurEntree = mock(LecteurEntree.class);
        when(mockLecteurEntree.nextLine())
            .thenReturn("10")  // Entrée valide
            .thenReturn("exit");  // Commande de sortie

        FibonacciService mockService = mock(FibonacciService.class);

        // Crée une instance de FibonacciApp avec des dépendances mockées
        FibonacciApp app = new FibonacciApp(mockLecteurEntree, mockService);
        app.run();

        verify(mockService, times(1)).comparerMethodes(BigInteger.TEN);
    }

    /**
     * Teste la méthode main avec une entrée invalide puis sortie.
     */
    @Test
    public void testInvalidInputThenExit() {
        LecteurEntree mockLecteurEntree = mock(LecteurEntree.class);
        when(mockLecteurEntree.nextLine())
            .thenReturn("invalid")  // Entrée invalide
            .thenReturn("exit");  // Commande de sortie

        FibonacciService mockService = mock(FibonacciService.class);

        // Crée une instance de FibonacciApp avec des dépendances mockées
        FibonacciApp app = new FibonacciApp(mockLecteurEntree, mockService);
        app.run();

        verify(mockService, never()).comparerMethodes(any(BigInteger.class));
    }

    /**
     * Teste la méthode main avec une entrée négative puis sortie.
     */
    @Test
    public void testNegativeInputThenExit() {
        LecteurEntree mockLecteurEntree = mock(LecteurEntree.class);
        when(mockLecteurEntree.nextLine())
            .thenReturn("-5")  // Entrée négative
            .thenReturn("exit");  // Commande de sortie

        FibonacciService mockService = mock(FibonacciService.class);

        // Crée une instance de FibonacciApp avec des dépendances mockées
        FibonacciApp app = new FibonacciApp(mockLecteurEntree, mockService);
        app.run();

        verify(mockService, never()).comparerMethodes(any(BigInteger.class));
    }

    /**
     * Teste la méthode main avec une entrée zéro puis sortie.
     */
    @Test
    public void testZeroInputThenExit() {
        LecteurEntree mockLecteurEntree = mock(LecteurEntree.class);
        when(mockLecteurEntree.nextLine())
            .thenReturn("0")  // Entrée zéro
            .thenReturn("exit");  // Commande de sortie

        FibonacciService mockService = mock(FibonacciService.class);

        // Crée une instance de FibonacciApp avec des dépendances mockées
        FibonacciApp app = new FibonacciApp(mockLecteurEntree, mockService);
        app.run();

        verify(mockService, never()).comparerMethodes(any(BigInteger.class));
    }
}