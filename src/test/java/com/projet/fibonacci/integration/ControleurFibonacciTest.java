package com.projet.fibonacci.integration;

import com.projet.fibonacci.controleur.ControleurFibonacci;
import com.projet.fibonacci.modele.FibonacciIteratif;
import com.projet.fibonacci.modele.FibonacciRecursif;
import org.junit.jupiter.api.Test;
import java.math.BigInteger;
import static org.junit.jupiter.api.Assertions.*;

public class ControleurFibonacciTest {

    @Test
    public void testAfficherSuiteIterative() {
        ControleurFibonacci controller = new ControleurFibonacci();
        controller.setCalculateur(new FibonacciIteratif());
        BigInteger[] expected = {
            BigInteger.ZERO, BigInteger.ONE, BigInteger.ONE, BigInteger.TWO, BigInteger.valueOf(3),
            BigInteger.valueOf(5), BigInteger.valueOf(8), BigInteger.valueOf(13), BigInteger.valueOf(21), BigInteger.valueOf(34)
        };
        BigInteger[] actual = controller.getSuite("itérative", 10);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testAfficherSuiteRecursive() {
        ControleurFibonacci controller = new ControleurFibonacci();
        controller.setCalculateur(new FibonacciRecursif());
        BigInteger[] expected = {
            BigInteger.ZERO, BigInteger.ONE, BigInteger.ONE, BigInteger.TWO, BigInteger.valueOf(3),
            BigInteger.valueOf(5), BigInteger.valueOf(8), BigInteger.valueOf(13), BigInteger.valueOf(21), BigInteger.valueOf(34)
        };
        BigInteger[] actual = controller.getSuite("récursive", 10);
        assertArrayEquals(expected, actual);
    }
}