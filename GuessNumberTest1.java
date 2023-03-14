import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        int secretNum = generator.nextInt(100) + 1;
        System.out.println("Введите имя первого игрока: ");
        String nameOne = scan.nextLine();
        System.out.println("Введите имя второго игрока: ");
        String nameTwo = scan.nextLine();
        Player playerOne = new Player(nameOne);
        Player playerTwo = new Player(nameTwo);
        GuessNumber playOne = new GuessNumber();
        playOne.Player(playerOne, playerTwo);
        playOne.secretNum(secretNum);
        int playerNum;
        int attempts = 1;
        String replay;
        System.out.println("Компьютер загадал число от 0 до 100 ");
        while(true) {
            System.out.println("\nИгрок " + playOne.getPlayer1() + " ваше число: ");
            playerNum = scan.nextInt();
            playerOne.setNum(playerNum);
            playOne.num1(playerOne);
            playOne.gamePlayer();
            if (playerNum == secretNum) {
                System.out.println("Игрок "+ playOne.getPlayer1() +" Вы отгадали число: " + secretNum + " c " + attempts + " попытки");
                System.out.println("Хотите продолжить вычисления? [yes/no] ");
                do {
                    replay = scan.nextLine();
                } while (!(replay.equals ("yes") || replay.equals ("no")));
                if (replay.equals ("no")) {
                    break;
                } else if (replay.equals ("yes")) {
                    secretNum = generator.nextInt(100) + 1;
                    playOne.secretNum(secretNum);
                    continue;
                }
            } else {
                System.out.println("\nИгрок " + playOne.getPlayer2() + " ваше число: ");
                playerNum = scan.nextInt();
                playerTwo.setNum(playerNum);
                playOne.num2(playerTwo);
                playOne.gamePlayer();
            }
            if (playerNum == secretNum) {
                System.out.println("Игрок "+ playOne.getPlayer2() +" Вы отгадали число: " + secretNum + " c " + attempts + " попытки");
                System.out.println("\nХотите продолжить вычисления? [yes/no] ");
                do {
                    replay = scan.nextLine();
                } while (!(replay.equals ("yes") || replay.equals ("no")));
                if (replay.equals ("no")) {
                    break;
                } else if (replay.equals ("yes")) {
                    secretNum = generator.nextInt(100) + 1;
                    playOne.secretNum(secretNum);
                    continue;
                }
            }
            attempts++;
        }
    }
}