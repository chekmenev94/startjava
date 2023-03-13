import java.util.Scanner;
import java.util.Random;

public class MyFirstGame1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        int secretNum = generator.nextInt(100) + 1;
        System.out.println("Компьютер загадал число от 0 до 100? ");
        int guess1;
        int guess2;
        int attempts = 1;
        String replay;
        while(true) {
            System.out.println("\nИгрок Дарья ваше число: ");
            guess1 = scan.nextInt();
            while (guess1 != secretNum) {
                if (guess1 > secretNum) {
                System.out.println("Число больше того, что загадал компьютер ");
                break;
                } else if (guess1 < secretNum) {
                System.out.println("Число меньше того, что загадал компьютер ");
                break;
                }
            }
            if (guess1 == secretNum) {
                System.out.println("Игрок Дарья. Вы отгадали число: " + secretNum + " c " + attempts + " попытки");
                System.out.println("Хотите продолжить вычисления? [yes/no] ");
                do {
                    replay = scan.nextLine();
                    if(replay.equals ("yes")) {
                        continue;
                    } else if (replay.equals ("no")) {
                        break;
                    }
                } while (!(replay.equals ("yes") || replay.equals ("no")));
                if (replay.equals ("no")) {
                    break;
                } else {
                    continue;
                }
            } else {
                System.out.println("\nИгрок Андрей ваше число: ");
                guess2 = scan.nextInt();
                while (guess2 != secretNum) {
                    if (guess2 > secretNum) {
                    System.out.println("Число больше того, что загадал компьютер ");
                    break;
                    } else if (guess2 < secretNum) {
                    System.out.println("Число меньше того, что загадал компьютер ");
                    break;
                    }
                }
            }
            if (guess2 == secretNum) {
                System.out.println("Игрок Андрей. Вы отгадали число: " + secretNum + " c " + attempts + " попытки");
                System.out.println("\nХотите продолжить вычисления? [yes/no] ");
                do {
                    replay = scan.nextLine();
                    if(replay.equals ("yes")) {
                        continue;
                    } else if (replay.equals ("no")) {
                        break;
                    }
                } while (!(replay.equals ("yes") || replay.equals ("no")));
                if (replay.equals ("no")) {
                    break;
                } else {
                    continue;
                }
            }
            attempts++;
        }
    }
}





