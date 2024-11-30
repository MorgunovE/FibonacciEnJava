package com.projet.fibonacci.unit;

import com.projet.fibonacci.validation.ValidateurEntree;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidateurEntreeTest {

    @Test
    public void testEstEntierPositif() {
        assertTrue(ValidateurEntree.estEntierPositif("5"));
        assertFalse(ValidateurEntree.estEntierPositif("0"));
        assertFalse(ValidateurEntree.estEntierPositif("invalid"));
    }

    @Test
    public void testEstEntierPositifNegativeNumber() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            ValidateurEntree.estEntierPositif("-5");
        });
        assertEquals("Le nombre de termes doit être un nombre positif.", exception.getMessage());
    }
}