package com.projet.fibonacci.integration;

import com.projet.fibonacci.controleur.ControleurFibonacci;
import com.projet.fibonacci.modele.FibonacciIteratif;
import com.projet.fibonacci.modele.FibonacciRecursif;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ControleurFibonacciTest {

    @Test
    public void testAfficherSuiteIterative() {
        ControleurFibonacci controller = new ControleurFibonacci();
        controller.setCalculateur(new FibonacciIteratif());
        long[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        long[] actual = controller.getSuite("itérative", 10);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testAfficherSuiteRecursive() {
        ControleurFibonacci controller = new ControleurFibonacci();
        controller.setCalculateur(new FibonacciRecursif());
        long[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        long[] actual = controller.getSuite("récursive", 10);
        assertArrayEquals(expected, actual);
    }
}