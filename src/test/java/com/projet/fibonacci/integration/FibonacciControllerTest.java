package com.projet.fibonacci.integration;

import com.projet.fibonacci.controller.FibonacciController;
import com.projet.fibonacci.model.FibonacciIteratif;
import com.projet.fibonacci.model.FibonacciRecursif;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FibonacciControllerTest {

    @Test
    public void testAfficherSuiteIterative() {
        FibonacciController controller = new FibonacciController();
        controller.setCalculateur(new FibonacciIteratif());
        long[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        long[] actual = controller.getSuite("itérative", 10);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testAfficherSuiteRecursive() {
        FibonacciController controller = new FibonacciController();
        controller.setCalculateur(new FibonacciRecursif());
        long[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        long[] actual = controller.getSuite("récursive", 10);
        assertArrayEquals(expected, actual);
    }
}