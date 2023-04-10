package com.startjava.lesson_2_3_4.finaly;

import java.util.Scanner;

public class GuessNumberTest1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String replay;
        do {
            Player1[] players = new Player1[3];
            int person = 1;
            for (int i = 0; i < players.length; i++) {
                System.out.println("Введите имя " + person + " игрока: ");
                players[i] = new Player1(scan.nextLine());
                person++;
            }
            GuessNumber1 game = new GuessNumber1(players[0], players[1], players[2]);
            game.play(scan);
            scan.nextLine();
            System.out.println("\nХотите продолжить вычисления? [yes/no] ");
            replay = scan.nextLine();
            if (!replay.equals("yes") && !replay.equals("no")) {
                System.out.println("Ответ введен неверно, введите [yes/no]");
                replay = scan.nextLine();
            }
        } while (!replay.equals("no"));
    }
}