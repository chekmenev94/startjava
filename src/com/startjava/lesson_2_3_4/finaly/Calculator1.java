package com.startjava.lesson_2_3_4.finaly;

import java.util.Scanner;

public class Calculator1 {
    private static double num1;
    private static String operation;
    private static double num2;

    public static double calculate(String expression) {
        splitExpression(expression);
        checkExpression();
        return switch (operation) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            case "%" -> num1 % num2;
            case "^" -> Math.pow(num1, num2);
            default -> 0;
        };
    }

    private static void splitExpression(String expression) {
        String[] elements = expression.split(" ");
        num1 = Integer.parseInt(elements[0]);
        operation = elements[1];
        num2 = Integer.parseInt(elements[2]);
    }

    private static void checkExpression() {
        if (num1 <= 0 || num2 <= 0) {
            throw new RuntimeException();
        }
        if (num1 % 1 != 0 || num2 % 1 != 0) {
            throw new RuntimeException();
        }
    }
}
