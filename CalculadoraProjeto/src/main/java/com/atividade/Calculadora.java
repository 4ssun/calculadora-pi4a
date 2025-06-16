package com.atividade;

public class Calculadora {

    // Soma [negativos e positivos]
    public double somar(double a, double b) {
        return a + b;
    }

    // Subtrai
    public double subtrair(double a, double b) {
        return a - b;
    }

    // Multiplica
    public double multiplicar(double a, double b) {
        return a * b;
    }

    // Divide a por b, lança ArithmeticException caso o b for zero
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return a / b;
    }
}
