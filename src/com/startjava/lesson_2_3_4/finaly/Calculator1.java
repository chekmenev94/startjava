package com.startjava.lesson_2_3_4.finaly;

import java.util.Scanner;


public class Calculator1 {
    static double num1;
    static double num2;
    static String operation1;
    static Scanner scan = new Scanner(System.in);

    public static void input() {
        System.out.println("Введите операцию: ");
        String input = scan.nextLine();
        String[] operation = input.split(" ");
        num1 = Double.parseDouble(operation[0]);
        operation1 = operation[1];
        num2 = Double.parseDouble(operation[2]);
        check();
    }

    public static void check() {
        try {
            if (num1 < 0 || num2 < 0) {
                System.err.println("Значения не могут быть отрицательными ");
                throw new Error();
            } else if (num1 % 1 != 0 || num2 % 1 != 0) {
                System.err.println("Значения должны быть целыми числами ");
                throw new Error();
            } else {
                calculate();
            }
        } catch (Error e) {
            input();
        }
    }
    
    public static double calculate() {
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
