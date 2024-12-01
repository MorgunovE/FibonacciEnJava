package com.projet.fibonacci.performance;

import com.projet.fibonacci.util.Chronometre;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de test pour Chronometre.
 * <p>
 * Cette classe teste les fonctionnalités de Chronometre en mesurant la durée d'exécution d'une opération.
 * </p>
 *
 * @version 2.0
 * @since 2024-11-30
 */
public class ChronometreTest {

    private static final int OPERATION_COUNT = 20;

    /**
     * Teste la performance du chronomètre en mesurant la durée d'exécution d'une opération.
     */
    @Test
    public void testPerformance() {
        Chronometre chronometre = new Chronometre();
        chronometre.demarrer();

        for (int i = 0; i < OPERATION_COUNT; i++) {
            Math.sqrt(i);
        }

        chronometre.arreter();
        long duree = chronometre.getDureeMicrosecondes();
        assertTrue(duree > 0);
    }
}