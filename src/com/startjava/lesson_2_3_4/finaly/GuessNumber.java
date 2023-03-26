package com.startjava.lesson_2_3_4.finaly;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class GuessNumber {
    private int secretNum;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play(Scanner scan) {
        Random generator = new Random();
        secretNum = generator.nextInt(100) + 1;
        int attempts = 1;
        int i = 0;
        System.out.println("Отгадайте число, от 0 до 100, которое загадал компьютер ");
        System.out.println("У каждого игрока по 10 попыток");
        while (attempts <= 10) {
            System.out.println("\nИгрок " + player1.getName() + " ваше число ");
            player1.setNum(scan.nextInt(), i);
            if (player1.getNum() > secretNum) {
                System.out.println("Число больше того, что загадал компьютер ");
            } else if (player1.getNum() < secretNum) {
                System.out.println("Число меньше того, что загадал компьютер ");
            } else {
                System.out.println("Игрок " + player1.getName() + " угадал число "
                         + player1.getNum() + " c " + attempts + " попытки");
                break;
            }

            System.out.println("\nИгрок " + player2.getName() + " ваше число ");
            player2.setNum(scan.nextInt(), i);
            if (player2.getNum() > secretNum) {
                System.out.println("Число больше того, что загадал компьютер ");
            } else if (player2.getNum() < secretNum) {
                System.out.println("Число меньше того, что загадал компьютер ");
            } else {
                System.out.println("Игрок " + player2.getName() + " угадал число "
                         + player2.getNum() + " c " + attempts + " попытки");
                break;
            }
            attempts++;
            i++;
        }

        int[] numArr = Arrays.copyOf(player1.getNumArr(), attempts);
        System.out.println("Введенные числа "+ player1.getName() + " = " + Arrays.toString(numArr));
        int[] numArr2 = Arrays.copyOf(player2.getNumArr(), attempts);
        System.out.println("Введенные числа "+ player2.getName() + " = " + Arrays.toString(numArr2));

        Arrays.fill(player1.getNumArr(), 0);
        Arrays.fill(player2.getNumArr(), 1);
        player1.setNumArr(player1.getNumArr());
        player2.setNumArr(player2.getNumArr());
    }
}