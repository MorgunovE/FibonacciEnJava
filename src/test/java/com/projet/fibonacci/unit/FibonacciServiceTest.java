package com.projet.fibonacci.unit;

import com.projet.fibonacci.controleur.ControleurFibonacci;
import com.projet.fibonacci.service.FibonacciService;
import com.projet.fibonacci.util.Chronometre;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.mockito.Mockito.*;

public class FibonacciServiceTest {

    private FibonacciService service;
    private ControleurFibonacci mockController;
    private Chronometre mockChronometre;

    @BeforeEach
    public void setUp() {
        mockController = mock(ControleurFibonacci.class);
        mockChronometre = mock(Chronometre.class);
        service = new FibonacciService(mockController, mockChronometre);
    }

    @Test
    public void testAfficherSuiteIterative() {
        service.afficherSuite("itérative", BigInteger.TEN);
        verify(mockController, times(1)).afficherSuite("itérative", BigInteger.TEN);
    }

    @Test
    public void testAfficherSuiteRecursive() {
        service.afficherSuite("récursive", BigInteger.TEN);
        verify(mockController, times(1)).afficherSuite("récursive", BigInteger.TEN);
    }

    @Test
    public void testComparerMethodes() {
        when(mockChronometre.getDureeMicrosecondes()).thenReturn(100L, 200L);
        service.comparerMethodes(BigInteger.TEN);
        verify(mockController, times(1)).afficherSuite("itérative", BigInteger.TEN);
        verify(mockController, times(1)).afficherSuite("récursive", BigInteger.TEN);
    }
}