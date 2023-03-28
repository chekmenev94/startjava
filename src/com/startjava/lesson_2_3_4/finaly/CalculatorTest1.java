package com.startjava.lesson_2_3_4.finaly;

import java.util.Scanner;

public class CalculatorTest1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String replay;
        do {
            Calculator1.input();
            double result = Calculator1.calculate();
            System.out.printf((result == Math.ceil(result)) ? "Результат вычислений: " +
                    Math.round(result): "Результат вычислений: %.3f", result);
            System.out.println("\nХотите продолжить вычисления? [yes/no] ");
            replay = scan.nextLine();
            if (replay.equals ("no")) {
                break;
            }
        } while(replay.equals ("yes"));
    }
}