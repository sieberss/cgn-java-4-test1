package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void add_shouldReturn5_whenCalledWith1and4(){
        int a = 1;
        int b = 4;
        int expected = 5;

        int actual = Main.add(a, b);
        assertEquals(expected, actual);
    }

    @Test
    void isEven_shouldReturnTrue_whenCalledWithEvenNumbers_False_whenCalledWithOddNumbers(){
        assertTrue(Main.isEven(2));
        assertTrue(Main.isEven(56));
        assertFalse(Main.isEven(33));
        assertFalse(Main.isEven(1));
    }

    @Test
    void mul_testResultsForSeveralExamples(){
        assertEquals(6, Main.mult(2,3));
        assertEquals(7, Main.mult(1,7));
        assertEquals(120, Main.mult(10,12));
        assertEquals(15, Main.mult(3, 5));
        assertEquals(24, Main.mult(4, 6));
    }

    @Test
    void toUppercase_testResultsForSeveralExamples(){
        String s = "Otto";
        String expected = "OTTO";
        assertEquals(expected, Main.toUpperCase(s));
        s = "Donaudampfschifffahrt";
        expected = "DONAUDAMPFSCHIFFFAHRT";
        assertEquals(expected, Main.toUpperCase(s));
    }

    @Test
    void containsHello_testResultsForSeveralExamples(){
        assertTrue(Main.containsHello("hello world"));
        assertTrue(Main.containsHello("Hallo Peter"));
        assertTrue(Main.containsHello("ciao bello"));
        assertTrue(Main.containsHello("bonjour et salut"));
        assertTrue(Main.containsHello("Schiff ahoj"));
        assertFalse(Main.containsHello("Schiff ahoi"));
        assertFalse(Main.containsHello("guten Tag"));
        assertTrue(Main.containsHello("Guten Tag Herr Czesc"));
    }
}