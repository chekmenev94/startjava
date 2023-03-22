package com.startjava.lesson_2_3_4.finaly;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String replay;
        do {
            System.out.println("Введите операцию: ");
            String input = scan.nextLine();
            String[] operation = input.split(" ");
            Calculator calculator = new Calculator(operation);
            double result = calculator.calculate();
            if (result * 1000 % 1000 == 0) {
                System.out.println("Результат вычислений: " + Math.round(result));
            } else {
                System.out.printf("Результат вычислений: %.3f", result);
            }
            System.out.println("\nХотите продолжить вычисления? [yes/no] ");
                replay = scan.nextLine();
            if (replay.equals ("no")) {
                break;
            }
        } while(replay.equals ("yes"));
    }
}