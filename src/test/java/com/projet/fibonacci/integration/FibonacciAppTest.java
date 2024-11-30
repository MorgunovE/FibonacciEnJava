package com.projet.fibonacci.integration;

import com.projet.fibonacci.FibonacciApp;
import com.projet.fibonacci.service.InputReader;
import com.projet.fibonacci.service.FibonacciService;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class FibonacciAppTest {

    @Test
    public void testMain() {
        InputReader mockInputReader = mock(InputReader.class);
        when(mockInputReader.nextLine())
            .thenReturn("10")  // Valid input
            .thenReturn("exit");  // Exit command

        FibonacciService mockService = mock(FibonacciService.class);
        FibonacciApp app = new FibonacciApp(mockInputReader, mockService);
        app.run();

        verify(mockService, times(1)).comparerMethodes(10);
    }

    @Test
    public void testInvalidInputThenExit() {
        InputReader mockInputReader = mock(InputReader.class);
        when(mockInputReader.nextLine())
            .thenReturn("invalid")  // Invalid input
            .thenReturn("exit");  // Exit command

        FibonacciService mockService = mock(FibonacciService.class);
        FibonacciApp app = new FibonacciApp(mockInputReader, mockService);
        app.run();

        verify(mockService, never()).comparerMethodes(anyInt());
    }

    @Test
    public void testNegativeInputThenExit() {
        InputReader mockInputReader = mock(InputReader.class);
        when(mockInputReader.nextLine())
            .thenReturn("-5")  // Negative input
            .thenReturn("exit");  // Exit command

        FibonacciService mockService = mock(FibonacciService.class);
        FibonacciApp app = new FibonacciApp(mockInputReader, mockService);
        app.run();

        verify(mockService, never()).comparerMethodes(anyInt());
    }
}