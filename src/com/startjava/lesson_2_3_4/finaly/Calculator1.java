package com.startjava.lesson_2_3_4.finaly;

import java.util.Scanner;

public class Calculator1 {
    private static double num1;
    private static String operation;
    private static double num2;

    public static void checkExpression() {
        if (num1 < 0 || num2 < 0) {
            throw new RuntimeException();
        } else if (num1 % 1 != 0 || num2 % 1 != 0) {
            throw new RuntimeException();
        }
    }

    public static double calculate(String string) {
        String[] expression = string.split(" ");
        num1 = Integer.parseInt(expression[0]);
        operation = expression[1];
        num2 = Integer.parseInt(expression[2]);
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
}
