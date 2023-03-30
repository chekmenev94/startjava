package com.startjava.lesson_2_3_4.finaly;

import java.util.Scanner;

public class GuessNumberTest1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String replay;
        do {
            System.out.println("Введите имя первого игрока: ");
            Player1 player1 = new Player1(scan.nextLine());
            System.out.println("Введите имя второго игрока: ");
            Player1 player2 = new Player1(scan.nextLine());
            System.out.println("Введите имя третьего игрока: ");
            Player1 player3 = new Player1(scan.nextLine());

            GuessNumber1 game = new GuessNumber1(player1, player2, player3);
            game.play(scan);
            replay = scan.nextLine();
            System.out.println("Хотите продолжить вычисления? [yes/no] ");
            replay = scan.nextLine();
            if (replay.equals("no")) {
                break;
            }
        } while (replay.equals("yes"));
    }
}