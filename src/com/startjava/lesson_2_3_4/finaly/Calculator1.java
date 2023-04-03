package com.startjava.lesson_2_3_4.finaly;

import java.util.Scanner;
public class Calculator1 {
    static double num1;
    static String operation1;
    static double num2;

    public static double calculate(String[] operation) {
        num1 = Double.parseDouble(operation[0]);
        operation1 = operation[1];
        num2 = Double.parseDouble(operation[2]);
        if (num1 < 0 || num2 < 0) {
            System.err.println("Значения не могут быть отрицательными ");
            throw new RuntimeException();
        } else if (num1 % 1 != 0 || num2 % 1 != 0) {
            System.err.println("Значения должны быть целыми числами ");
            throw new RuntimeException();
        } else {
            return switch (operation1) {
                case "+" -> num1 + num2;
                case "-" -> num1 - num2;
                case "*" -> num1 * num2;
                case "/" -> num1 / num2;
                case "%" -> num1 % num2;
                case "^" -> Math.pow(num1, num2);
                default -> 0;
            };
        }
    }
}
