package com.exemplo;

public class Calculadora {

    // Soma dois números (podem ser positivos ou negativos)
    public double somar(double a, double b) {
        return a + b;
    }

    // Subtrai b de a
    public double subtrair(double a, double b) {
        return a - b;
    }

    // Multiplica dois números
    public double multiplicar(double a, double b) {
        return a * b;
    }

    // Divide a por b, lança ArithmeticException se b for zero
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return a / b;
    }
}
