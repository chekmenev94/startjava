package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private int num1;
    private int num2;
    private char operation;

    public void setNum1(int num) {
        this.num1 = num;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public void setNum2(int num) {
        this.num2 = num;
    }

    public int calc() {
        int result = 1;
        switch (operation) {
            case '+' :
                return num1 + num2;
            case '-' :
                return num1 - num2;
            case '*' :
                return num1 * num2;
            case '/' :
                return num1 / num2;
            case '%' :
                return num1 % num2;
            case '^' :
                for (int i = 0; i < num2; i++) {
                    result *= num1;
                }
                return result;
            default:
                System.out.println("Некорректно ввели арифметический знак");
                return 0;
        }
    }
}