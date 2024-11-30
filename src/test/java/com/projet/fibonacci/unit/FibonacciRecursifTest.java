package com.projet.fibonacci.unit;

import com.projet.fibonacci.modele.FibonacciRecursif;
import org.junit.jupiter.api.Test;
import java.math.BigInteger;
import static org.junit.jupiter.api.Assertions.*;

public class FibonacciRecursifTest {

    @Test
    public void testCalculer() {
        FibonacciRecursif fibonacci = new FibonacciRecursif();
        assertEquals(BigInteger.ZERO, fibonacci.calculer(0));
        assertEquals(BigInteger.ONE, fibonacci.calculer(1));
        assertEquals(BigInteger.ONE, fibonacci.calculer(2));
        assertEquals(BigInteger.TWO, fibonacci.calculer(3));
        assertEquals(BigInteger.valueOf(3), fibonacci.calculer(4));
        assertEquals(BigInteger.valueOf(5), fibonacci.calculer(5));
        assertEquals(BigInteger.valueOf(8), fibonacci.calculer(6));
        assertEquals(BigInteger.valueOf(13), fibonacci.calculer(7));
        assertEquals(BigInteger.valueOf(21), fibonacci.calculer(8));
        assertEquals(BigInteger.valueOf(34), fibonacci.calculer(9));
    }
}