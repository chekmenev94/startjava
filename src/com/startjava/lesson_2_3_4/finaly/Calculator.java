package com.startjava.lesson_2_3_4.finaly;


public class Calculator {
    private double num1;
    private double num2;
    private String operation;

    public Calculator(String[] arr) {
        this.num1 = Integer.parseInt(arr[0]);
        this.operation = arr[1];
        this.num2 = Integer.parseInt(arr[2]);
    }

    public double calculate() {
        int result = 1;
        switch (operation) {
            case "+" :
                return num1 + num2;
            case "-" :
                return num1 - num2;
            case "*" :
                return num1 * num2;
            case "/" :
                return num1 / num2;
            case "%" :
                return num1 % num2;
            case "^" :
                return Math.pow(num1, num2);
            default:
                System.out.println("Некорректно ввели арифметический знак");
                return 0;
        }
    }
}