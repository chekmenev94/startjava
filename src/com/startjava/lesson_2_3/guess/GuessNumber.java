package com.startjava.lesson_2_3.guess;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private int secretNum;
    private int attempts = 1;
    private String player1;
    private String player2;
    // private int numPlayer;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1.getName();
        this.player2 = player2.getName();
    }

    public void play(Scanner scan) {
        Random generator = new Random();
        secretNum = generator.nextInt(100) + 1;
        do {
            System.out.println("\nИгрок " + player1 + " ваше число ");
            player1.setNum(scan.nextInt());
            if (player1.getNum() > secretNum) {
                System.out.println("Число больше того, что загадал компьютер ");
            } else if (player1.getNum() < secretNum) {
                System.out.println("Число меньше того, что загадал компьютер ");
            } else if (player1.getNum() == secretNum) {
                break;
            }
            System.out.println("\nИгрок " + player2 + " ваше число ");
            player2.setNum(scan.nextInt());;
            if (player2.getNum() > secretNum) {
                System.out.println("Число больше того, что загадал компьютер ");
            } else if (player2.getNum() < secretNum) {
                System.out.println("Число меньше того, что загадал компьютер ");
            }
            attempts++;
        } while (player2.getNum() != secretNum);
        System.out.println("Вы победили!! c " + attempts + " попытки");
    }
}