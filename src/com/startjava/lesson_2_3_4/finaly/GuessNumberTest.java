package com.startjava.lesson_2_3_4.finaly;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String replay;
        do {
            System.out.println("Введите имя первого игрока: ");
            Player player1 = new Player(scan.nextLine());
            System.out.println("Введите имя второго игрока: ");
            Player player2 = new Player(scan.nextLine());
            GuessNumber game = new GuessNumber(player1, player2);
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