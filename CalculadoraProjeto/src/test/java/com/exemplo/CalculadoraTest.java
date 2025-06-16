package com.exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    Calculadora calc = new Calculadora();

    @Test
    void testSomar() {
        assertEquals(5, calc.somar(2, 3));
        assertEquals(-1, calc.somar(2, -3));
        assertEquals(-5, calc.somar(-2, -3));
        assertEquals(0, calc.somar(0, 0)); // teste adicional
    }

    @Test
    void testSubtrair() {
        assertEquals(-1, calc.subtrair(2, 3));
        assertEquals(5, calc.subtrair(2, -3));
        assertEquals(1, calc.subtrair(-2, -3));
        assertEquals(0, calc.subtrair(0, 0)); // teste adicional
    }

    @Test
    void testMultiplicar() {
        assertEquals(6, calc.multiplicar(2, 3));
        assertEquals(-6, calc.multiplicar(2, -3));
        assertEquals(6, calc.multiplicar(-2, -3));
        assertEquals(0, calc.multiplicar(0, 3)); // teste adicional
    }

    @Test
    void testDividir() {
        assertEquals(2, calc.dividir(6, 3));
        assertEquals(-2, calc.dividir(6, -3));
        assertEquals(2, calc.dividir(-6, -3));
        assertEquals(0, calc.dividir(0, 3)); // teste adicional
    }

    @Test
    void testDividirPorZero() {
        assertThrows(ArithmeticException.class, () -> calc.dividir(6, 0));
    }
}
