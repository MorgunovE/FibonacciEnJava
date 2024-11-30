package com.projet.fibonacci.performance;

import com.projet.fibonacci.model.Chronometre;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ChronometreTest {

    private static final int OPERATION_COUNT = 20;

    @Test
    public void testPerformance() {
        Chronometre chronometre = new Chronometre();
        chronometre.demarrer();

        // Perform some operations
        for (int i = 0; i < OPERATION_COUNT; i++) {
            Math.sqrt(i);
        }

        chronometre.arreter();
        long duree = chronometre.getDureeMicrosecondes();
        assertTrue(duree > 0);
    }
}