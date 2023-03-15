package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String replay;
        do {
            System.out.println("Введите значение первой переменной ");
            calculator.setNum1(scan.nextInt());
            System.out.println("Введите арифметический знак ");
            calculator.setOperation(scan.next().charAt(0));
            System.out.println("Введите значение второй переменной ");
            calculator.setNum2(scan.nextInt());
            int result = calculator.calc();
            System.out.println("Результат вычислений: " + result);
            do {
                scan.nextLine();
                System.out.println("Хотите продолжить вычисления? [yes/no] ");
                replay = scan.nextLine();
            } while (!replay.equals ("yes") && !replay.equals ("no"));
        } while(replay.equals ("yes"));
    }
}