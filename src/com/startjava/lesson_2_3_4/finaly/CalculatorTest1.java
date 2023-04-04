package com.startjava.lesson_2_3_4.finaly;

import java.util.Scanner;
public class CalculatorTest1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String replay;
        do {
            try {
                System.out.println("Введите операцию: ");
                String input = scan.nextLine();
                String[] operation = input.split(" ");
                double result = Calculator1.calculate(operation);
                System.out.printf((result % 1 == 0) ? "Результат вычислений: " +
                    Math.round(result): "Результат вычислений: %.3f", result);
            } catch(RuntimeException e) {
                continue;
            }
            do {
                System.out.println("\nХотите продолжить вычисления? [yes/no] ");
                replay = scan.nextLine();
                if (!replay.equals ("yes") && !replay.equals ("no")) {
                    System.out.println("Ответ введен неверно, введите [yes/no]");
                    replay = scan.nextLine();
                }
            } while (!replay.equals ("yes") && !replay.equals ("no"));
            if (replay.equals("no")) {
                break;
            }
        } while (true);
    }
}