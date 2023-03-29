package com.startjava.lesson_2_3_4.finaly;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class GuessNumber1 {
    private int secretNum;
    private Player1[] player;
    Random generator = new Random();


    public GuessNumber1(Player1... args) {
        this.player = args;
        fisherYatesShuffle();
    }

    public void fisherYatesShuffle() {
        System.out.println("Жеребьевка очередности");
        String temp;
        for (int i = player.length - 1; i >= 1; i--) {
            int j = generator.nextInt(i + 1);
            temp = player[i].getName();
            player[i].setName(player[j].getName());
            player[j].setName(temp);
        }
        System.out.println("Порядок очередности игроков ");
        System.out.println(player[0].getName());
        System.out.println(player[1].getName());
        System.out.println(player[2].getName());
    }


    public void play(Scanner scan) {
        secretNum = generator.nextInt(100) + 1;
        int attempts = 1;
        int i = 0;
        System.out.println("Отгадайте число, от 0 до 100, которое загадал компьютер ");
        System.out.println("У каждого игрока по 10 попыток");
        System.out.println(secretNum);
        while (attempts <= 10) {
            System.out.println("\nИгрок " + player[0].getName() + " ваше число ");
            player[0].setNum(scan.nextInt(), i);
            
            if (player[0].getNum() > secretNum) {
                System.out.println("Число больше того, что загадал компьютер ");
            } else if (player[0].getNum() < secretNum) {
                System.out.println("Число меньше того, что загадал компьютер ");
            } else {
                System.out.println("Игрок " + player[0].getName() + " угадал число "
                         + player[0].getNum() + " c " + attempts + " попытки");
                break;
            }

            System.out.println("\nИгрок " + player[1].getName() + " ваше число ");
            player[1].setNum(scan.nextInt(), i);
            if (player[1].getNum() > secretNum) {
                System.out.println("Число больше того, что загадал компьютер ");
            } else if (player[1].getNum() < secretNum) {
                System.out.println("Число меньше того, что загадал компьютер ");
            } else {
                System.out.println("Игрок " + player[1].getName() + " угадал число "
                         + player[1].getNum() + " c " + attempts + " попытки");
                break;
            }

            System.out.println("\nИгрок " + player[2].getName() + " ваше число ");
            player[2].setNum(scan.nextInt(), i);
            if (player[2].getNum() > secretNum) {
                System.out.println("Число больше того, что загадал компьютер ");
            } else if (player[2].getNum() < secretNum) {
                System.out.println("Число меньше того, что загадал компьютер ");
            } else {
                System.out.println("Игрок " + player[2].getName() + " угадал число "
                         + player[2].getNum() + " c " + attempts + " попытки");
                break;
            }
            attempts++;
            i++;
        }

        int[] numArr = Arrays.copyOf(player[0].getNumArr(), attempts);
        System.out.println("Введенные числа "+ player[0].getName() + " = " + Arrays.toString(numArr));
        int[] numArr1 = Arrays.copyOf(player[1].getNumArr(), attempts);
        System.out.println("Введенные числа "+ player[1].getName() + " = " + Arrays.toString(numArr1));
        int[] numArr2 = Arrays.copyOf(player[2].getNumArr(), attempts);
        System.out.println("Введенные числа "+ player[2].getName() + " = " + Arrays.toString(numArr2));

        Arrays.fill(player[0].getNumArr(), 0);
        Arrays.fill(player[1].getNumArr(), 0);
        Arrays.fill(player[2].getNumArr(), 0);
        player[0].setNumArr(player[0].getNumArr());
        player[1].setNumArr(player[1].getNumArr());
        player[2].setNumArr(player[2].getNumArr());
    }
}