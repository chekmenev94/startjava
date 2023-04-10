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
        System.out.println("Отгадайте число, от 0 до 100, которое загадал компьютер ");
        System.out.println("У каждого игрока по 10 попыток");
        System.out.println(secretNum);
        result:
        while (attempts <= 10) {
            for (Player1 person : players) {
                System.out.println("\nИгрок " + person.getName() + " ваше число ");
                if (!person.addNum(scan.nextInt())) {
                    continue;
                } else {
                    if (person.getNum() == secretNum) {
                        System.out.println("Игрок " + person.getName() + " угадал число "
                                + person.getNum() + " c " + attempts + " попытки");
                        break result;
                    } else {
                        System.out.println("Число " + (person.getNum() > secretNum ? 
                            "больше " : "меньше ") + "того, что загадал компьютер");
                    }
                }
            }
            attempts++;
        }
        result();
    }
    
    private void result() {
        for (Player1 person : players) {
            System.out.println("\nВведенные числа "+ person.getName());
            for(int num : person.getNums()) {
                System.out.print(num + " ");
            }
        }
    }
}