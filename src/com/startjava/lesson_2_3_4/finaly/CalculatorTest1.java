package com.startjava.lesson_2_3_4.finaly;

import java.util.Scanner;

public class CalculatorTest1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String replay = "";
        do {
            System.out.println("Введите выражение: ");
            String expression = scan.nextLine();
            try {
                double result = Calculator1.calculate(expression);
                 System.out.printf("Результат вычислений: " + ((result % 1 == 0) ?
                    "%.0f" : "%.3f"), result);
            } catch(RuntimeException e) {
                System.out.println("Значения должны быть положительными и целыми числами");
                continue;
            }
            System.out.println("\nХотите продолжить вычисления? [yes/no] ");
            replay = scan.nextLine();
            if (!replay.equals("yes") && !replay.equals("no")) {
                System.out.println("Ответ введен неверно, введите [yes/no]");
                replay = scan.nextLine();
            }
        } while (!replay.equals("no"));
    }
}