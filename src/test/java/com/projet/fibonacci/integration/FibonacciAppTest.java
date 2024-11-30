package com.projet.fibonacci.integration;

import com.projet.fibonacci.FibonacciApp;
import com.projet.fibonacci.service.FibonacciService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Scanner;

import static org.mockito.Mockito.*;

public class FibonacciAppTest {

    @Test
    public void testMain() {
        Scanner mockScanner = mock(Scanner.class);
        when(mockScanner.nextInt()).thenReturn(10);

        FibonacciService mockService = mock(FibonacciService.class);
        FibonacciApp app = new FibonacciApp(mockScanner, mockService);
        app.run();

        verify(mockService, times(1)).comparerMethodes(10);
    }
}