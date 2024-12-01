package com.projet.fibonacci.unit;

import com.projet.fibonacci.validation.ValidateurEntree;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de test pour ValidateurEntree.
 * <p>
 * Cette classe teste les fonctionnalités de ValidateurEntree.
 * </p>
 *
 * @version 2.0
 * @since 2024-11-30
 * @author Evgenii Morgunov
 */
public class ValidateurEntreeTest {

    /**
     * Teste la méthode estEntierPositif avec des entrées valides et invalides.
     */
    @Test
    public void testEstEntierPositif() {
        assertTrue(ValidateurEntree.estEntierPositif("5"));
        assertFalse(ValidateurEntree.estEntierPositif("0"));
        assertFalse(ValidateurEntree.estEntierPositif("invalid"));
    }

    /**
     * Teste la méthode estEntierPositif avec un nombre négatif.
     */
    @Test
    public void testEstEntierPositifNegativeNumber() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            ValidateurEntree.estEntierPositif("-5");
        });
        assertEquals("Le nombre de termes doit être un nombre positif.", exception.getMessage());
    }
}