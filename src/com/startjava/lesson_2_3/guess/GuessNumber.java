package com.startjava.lesson_2_3.guess;

import java.util.Scanner;
import java.util.Random;

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
        while (true) {
            System.out.println("\nИгрок " + player1.getName() + " ваше число ");
            player1.setNum(scan.nextInt());
            if (player1.getNum() > secretNum) {
                System.out.println("Число больше того, что загадал компьютер ");
            } else if (player1.getNum() < secretNum) {
                System.out.println("Число меньше того, что загадал компьютер ");
            } else {
                System.out.println(player1.getName() + " вы победили!! c " + attempts + " попытки");
                break;
            }

            System.out.println("\nИгрок " + player2.getName() + " ваше число ");
            player2.setNum(scan.nextInt());
            if (player2.getNum() > secretNum) {
                System.out.println("Число больше того, что загадал компьютер ");
            } else if (player2.getNum() < secretNum) {
                System.out.println("Число меньше того, что загадал компьютер ");
            } else {
                System.out.println(player2.getName() + " вы победили!! c " + attempts + " попытки");
                break;
            }
            attempts++;
        }
    }
}