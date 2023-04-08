package com.startjava.lesson_2_3_4.finaly;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class GuessNumber1 {
    private int secretNum;
    private Player1[] players;
    Random generator = new Random();

    public GuessNumber1(Player1... args) {
        this.players = args;
        fisherYatesShuffle();
    }

    private void fisherYatesShuffle() {
        System.out.println("Жеребьевка очередности");
        Player1 temp;
        for (int i = players.length - 1; i >= 1; i--) {
            int j = generator.nextInt(i + 1);
            temp = players[i];
            players[i] = players[j];
            players[j] = temp;
        }
        System.out.println("Порядок очередности игроков ");
        System.out.println(players[0].getName());
        System.out.println(players[1].getName());
        System.out.println(players[2].getName());
    }

    public void play(Scanner scan) {
        secretNum = generator.nextInt(100) + 1;
        int attempts = 1;
        int i = 0;
        System.out.println("Отгадайте число, от 0 до 100, которое загадал компьютер ");
        System.out.println("У каждого игрока по 10 попыток");
        int numPlayer = 0;
        while (attempts <= 10) {
            try {
                System.out.println("\nИгрок " + players[numPlayer].getName() + " ваше число ");
                players[numPlayer].addNum(scan.nextInt(), i);
            } catch (RuntimeException e) {
                continue;
            }
            System.out.println("Число " + (players[numPlayer].getNum() > secretNum ? "больше " : "меньше ") +
                    "того, что загадал компьютер");
            if (players[numPlayer].getNum() == secretNum) {
                System.out.println("Игрок " + players[numPlayer].getName() + " угадал число "
                        + players[numPlayer].getNum() + " c " + attempts + " попытки");
                break;
            }
            if (numPlayer < 2) {
                numPlayer++;
            } else {
                numPlayer = 0;
                i++;
                attempts++;
            }
        }

        int[] numArr = Arrays.copyOf(players[0].getNums(), attempts);
        System.out.println("Введенные числа "+ players[0].getName() + " = " + Arrays.toString(numArr));
        int[] numArr1 = Arrays.copyOf(players[1].getNums(), attempts);
        System.out.println("Введенные числа "+ players[1].getName() + " = " + Arrays.toString(numArr1));
        int[] numArr2 = Arrays.copyOf(players[2].getNums(), attempts);
        System.out.println("Введенные числа "+ players[2].getName() + " = " + Arrays.toString(numArr2));

        Arrays.fill(players[0].getNums(), 0);
        Arrays.fill(players[1].getNums(), 0);
        Arrays.fill(players[2].getNums(), 0);
        players[0].setNumsArr(players[0].getNums());
        players[1].setNumsArr(players[1].getNums());
        players[2].setNumsArr(players[2].getNums());
    }
}