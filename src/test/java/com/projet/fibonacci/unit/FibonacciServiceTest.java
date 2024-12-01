package com.projet.fibonacci.unit;

import com.projet.fibonacci.controleur.ControleurFibonacci;
import com.projet.fibonacci.service.FibonacciService;
import com.projet.fibonacci.util.Chronometre;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.mockito.Mockito.*;

/**
 * Classe de test pour FibonacciService.
 * <p>
 * Cette classe teste les fonctionnalités de FibonacciService en utilisant des mocks pour les dépendances.
 * </p>
 *
 * @version 2.0
 * @since 2024-11-30
 * @author Evgenii Morgunov
 */
public class FibonacciServiceTest {

    private FibonacciService service;
    private ControleurFibonacci mockController;
    private Chronometre mockChronometre;

    /**
     * Configure les mocks et l'instance de FibonacciService avant chaque test.
     */
    @BeforeEach
    public void setUp() {
        mockController = mock(ControleurFibonacci.class);
        mockChronometre = mock(Chronometre.class);
        service = new FibonacciService(mockController, mockChronometre);
    }

    /**
     * Teste la méthode afficherSuite pour l'implémentation itérative.
     */
    @Test
    public void testAfficherSuiteIterative() {
        service.afficherSuite("itérative", BigInteger.TEN);
        verify(mockController, times(1)).afficherSuite("itérative", BigInteger.TEN);
    }

    /**
     * Teste la méthode afficherSuite pour l'implémentation récursive.
     */
    @Test
    public void testAfficherSuiteRecursive() {
        service.afficherSuite("récursive", BigInteger.TEN);
        verify(mockController, times(1)).afficherSuite("récursive", BigInteger.TEN);
    }

    /**
     * Teste la méthode comparerMethodes.
     */
    @Test
    public void testComparerMethodes() {
        when(mockChronometre.getDureeMicrosecondes()).thenReturn(100L, 200L);
        service.comparerMethodes(BigInteger.TEN);
        verify(mockController, times(1)).afficherSuite("itérative", BigInteger.TEN);
        verify(mockController, times(1)).afficherSuite("récursive", BigInteger.TEN);
    }
}