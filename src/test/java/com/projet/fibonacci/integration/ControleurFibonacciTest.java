package com.projet.fibonacci.integration;

import com.projet.fibonacci.controleur.ControleurFibonacci;
import com.projet.fibonacci.modele.FibonacciIteratif;
import com.projet.fibonacci.modele.FibonacciRecursif;
import com.projet.fibonacci.service.FibonacciService;
import com.projet.fibonacci.service.LecteurEntree;
import org.junit.jupiter.api.Test;
import java.math.BigInteger;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * Classe de test pour ControleurFibonacci.
 * <p>
 * Cette classe teste les fonctionnalités de ControleurFibonacci en utilisant des mocks pour les dépendances.
 * </p>
 *
 * @version 2.0
 * @since 2024-11-30
 */
public class ControleurFibonacciTest {

    /**
     * Teste la méthode afficherSuite pour l'implémentation itérative.
     */
    @Test
    public void testAfficherSuiteIterative() {
        LecteurEntree mockLecteurEntree = mock(LecteurEntree.class);
        FibonacciService mockService = mock(FibonacciService.class);
        ControleurFibonacci controller = new ControleurFibonacci(mockLecteurEntree, mockService);
        controller.setCalculateur(new FibonacciIteratif());
        BigInteger[] expected = {
            BigInteger.ZERO, BigInteger.ONE, BigInteger.ONE, BigInteger.TWO, BigInteger.valueOf(3),
            BigInteger.valueOf(5), BigInteger.valueOf(8), BigInteger.valueOf(13), BigInteger.valueOf(21), BigInteger.valueOf(34)
        };
        BigInteger[] actual = controller.getSuite("itérative", BigInteger.TEN);
        assertArrayEquals(expected, actual);
    }

    /**
     * Teste la méthode afficherSuite pour l'implémentation récursive.
     */
    @Test
    public void testAfficherSuiteRecursive() {
        LecteurEntree mockLecteurEntree = mock(LecteurEntree.class);
        FibonacciService mockService = mock(FibonacciService.class);
        ControleurFibonacci controller = new ControleurFibonacci(mockLecteurEntree, mockService);
        controller.setCalculateur(new FibonacciRecursif());
        BigInteger[] expected = {
            BigInteger.ZERO, BigInteger.ONE, BigInteger.ONE, BigInteger.TWO, BigInteger.valueOf(3),
            BigInteger.valueOf(5), BigInteger.valueOf(8), BigInteger.valueOf(13), BigInteger.valueOf(21), BigInteger.valueOf(34)
        };
        BigInteger[] actual = controller.getSuite("récursive", BigInteger.TEN);
        assertArrayEquals(expected, actual);
    }
}