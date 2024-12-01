package com.projet.fibonacci.integration;

import com.projet.fibonacci.app.FibonacciApp;
import com.projet.fibonacci.service.LecteurEntree;
import com.projet.fibonacci.service.FibonacciService;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.mockito.Mockito.*;

public class FibonacciAppTest {

    @Test
    public void testMain() {
        LecteurEntree mockLecteurEntree = mock(LecteurEntree.class);
        when(mockLecteurEntree.nextLine())
            .thenReturn("10")  // Valid input
            .thenReturn("exit");  // Exit command

        FibonacciService mockService = mock(FibonacciService.class);

        // Create an instance of FibonacciApp with mocked dependencies
        FibonacciApp app = new FibonacciApp(mockLecteurEntree, mockService);
        app.run();

        verify(mockService, times(1)).comparerMethodes(BigInteger.TEN);
    }

    @Test
    public void testInvalidInputThenExit() {
        LecteurEntree mockLecteurEntree = mock(LecteurEntree.class);
        when(mockLecteurEntree.nextLine())
            .thenReturn("invalid")  // Invalid input
            .thenReturn("exit");  // Exit command

        FibonacciService mockService = mock(FibonacciService.class);

        // Create an instance of FibonacciApp with mocked dependencies
        FibonacciApp app = new FibonacciApp(mockLecteurEntree, mockService);
        app.run();

        verify(mockService, never()).comparerMethodes(any(BigInteger.class));
    }

    @Test
    public void testNegativeInputThenExit() {
        LecteurEntree mockLecteurEntree = mock(LecteurEntree.class);
        when(mockLecteurEntree.nextLine())
            .thenReturn("-5")  // Negative input
            .thenReturn("exit");  // Exit command

        FibonacciService mockService = mock(FibonacciService.class);

        // Create an instance of FibonacciApp with mocked dependencies
        FibonacciApp app = new FibonacciApp(mockLecteurEntree, mockService);
        app.run();

        verify(mockService, never()).comparerMethodes(any(BigInteger.class));
    }

    @Test
    public void testZeroInputThenExit() {
        LecteurEntree mockLecteurEntree = mock(LecteurEntree.class);
        when(mockLecteurEntree.nextLine())
            .thenReturn("0")  // Zero input
            .thenReturn("exit");  // Exit command

        FibonacciService mockService = mock(FibonacciService.class);

        // Create an instance of FibonacciApp with mocked dependencies
        FibonacciApp app = new FibonacciApp(mockLecteurEntree, mockService);
        app.run();

        verify(mockService, never()).comparerMethodes(any(BigInteger.class));
    }
}