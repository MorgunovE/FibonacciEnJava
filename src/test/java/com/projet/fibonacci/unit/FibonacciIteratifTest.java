package com.projet.fibonacci.unit;

import com.projet.fibonacci.modele.FibonacciIteratif;
import org.junit.jupiter.api.Test;
import java.math.BigInteger;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de test pour FibonacciIteratif.
 * <p>
 * Cette classe teste les fonctionnalités de FibonacciIteratif.
 * </p>
 *
 * @version 2.0
 * @since 2024-11-30
 */
public class FibonacciIteratifTest {

    /**
     * Teste la méthode calculer de FibonacciIteratif.
     */
    @Test
    public void testCalculer() {
        FibonacciIteratif fibonacci = new FibonacciIteratif();
        assertEquals(BigInteger.ZERO, fibonacci.calculer(BigInteger.ZERO));
        assertEquals(BigInteger.ONE, fibonacci.calculer(BigInteger.ONE));
        assertEquals(BigInteger.ONE, fibonacci.calculer(BigInteger.valueOf(2)));
        assertEquals(BigInteger.TWO, fibonacci.calculer(BigInteger.valueOf(3)));
        assertEquals(BigInteger.valueOf(3), fibonacci.calculer(BigInteger.valueOf(4)));
        assertEquals(BigInteger.valueOf(5), fibonacci.calculer(BigInteger.valueOf(5)));
        assertEquals(BigInteger.valueOf(8), fibonacci.calculer(BigInteger.valueOf(6)));
        assertEquals(BigInteger.valueOf(13), fibonacci.calculer(BigInteger.valueOf(7)));
        assertEquals(BigInteger.valueOf(21), fibonacci.calculer(BigInteger.valueOf(8)));
        assertEquals(BigInteger.valueOf(34), fibonacci.calculer(BigInteger.valueOf(9)));
    }
}