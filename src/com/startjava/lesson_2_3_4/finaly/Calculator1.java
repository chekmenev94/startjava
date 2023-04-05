package com.startjava.lesson_2_3_4.finaly;

import java.util.Scanner;

public class Calculator1 {
    static double num1;
    static String operation;
    static double num2;

    public static void input(String input) {
        String[] expression = input.split(" ");
        num1 = Integer.parseInt(expression[0]);
        operation = expression[1];
        num2 = Integer.parseInt(expression[2]);
        if (num1 < 0 || num2 < 0) {
            throw new RuntimeException();
        } else if (num1 % 1 != 0 || num2 % 1 != 0) {
            throw new RuntimeException();
        }
    }

    public static double calculate() {
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
