package com.startjava.lesson_2_3.guess;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private int secretNum = 10;
    private int attempts = 1;
    private String player1;
    private String player2;
    private int numPlayer;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1.getName();
        this.player2 = player2.getName();
    }

    public void setSecretNum(int secretNum) {
        this.secretNum = secretNum;
    }

    public void playGame(Scanner scan) {
        Random generator = new Random();
        setSecretNum(generator.nextInt(100) + 1);
        do {
            System.out.println("\nИгрок " + player1 + " ваше число ");
            numPlayer = scan.nextInt();
            if (numPlayer > secretNum) {
                System.out.println("Число больше того, что загадал компьютер ");
            } else if (numPlayer < secretNum) {
                System.out.println("Число меньше того, что загадал компьютер ");
            } else if (numPlayer == secretNum) {
                break;
            }
            System.out.println("\nИгрок " + player2 + " ваше число ");
            numPlayer = scan.nextInt();
            if (numPlayer > secretNum) {
                System.out.println("Число больше того, что загадал компьютер ");
            } else if (numPlayer < secretNum) {
                System.out.println("Число меньше того, что загадал компьютер ");
            }
            attempts++;
        } while (numPlayer != secretNum);
        System.out.println("Вы победили!! c " + attempts + " попытки");
    }
}