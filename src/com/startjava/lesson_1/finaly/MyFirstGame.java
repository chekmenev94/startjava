package com.startjava.lesson_1.finaly;

import java.util.Scanner;
import java.util.Random;

public class MyFirstGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        int secretNum = generator.nextInt(100) + 1;
        System.out.print("Компьютер загадал число от 0 до 100? ");
        int guess = scan.nextInt();
        int attempts = 1;
        while (guess != secretNum && attempts < 20) {
            if (guess > secretNum) {
                System.out.print("Число больше того, что загадал компьютер ");
                attempts++;
            } else {
                System.out.print("Число меньше того, что загадал компьютер ");
                attempts++;
            }
            guess = scan.nextInt();
        }
        System.out.print("Число " + secretNum + " вы угадали с " + attempts + " попытки!");
    }
}