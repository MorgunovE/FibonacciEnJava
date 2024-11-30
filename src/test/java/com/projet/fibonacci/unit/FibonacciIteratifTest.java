package com.projet.fibonacci.unit;

import com.projet.fibonacci.modele.FibonacciIteratif;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FibonacciIteratifTest {

    @Test
    public void testCalculer() {
        FibonacciIteratif fibonacci = new FibonacciIteratif();
        assertEquals(0, fibonacci.calculer(0));
        assertEquals(1, fibonacci.calculer(1));
        assertEquals(1, fibonacci.calculer(2));
        assertEquals(2, fibonacci.calculer(3));
        assertEquals(3, fibonacci.calculer(4));
        assertEquals(5, fibonacci.calculer(5));
        assertEquals(8, fibonacci.calculer(6));
        assertEquals(13, fibonacci.calculer(7));
        assertEquals(21, fibonacci.calculer(8));
        assertEquals(34, fibonacci.calculer(9));
    }
}