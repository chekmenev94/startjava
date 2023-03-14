import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        System.out.println("Введите имя первого игрока: ");
        Player playerOne = new Player(scan.nextLine());
        System.out.println("Введите имя второго игрока: ");
        Player playerTwo = new Player(scan.nextLine());

        GuessNumber gameOne = new GuessNumber(playerOne, playerTwo);
        String replay;
        do {
            gameOne.setSecretNum(generator.nextInt(100) + 1);
            gameOne.gamePlayer(scan);
            do {
                scan.nextLine();
                System.out.println("Хотите продолжить вычисления? [yes/no] ");
                replay = scan.nextLine();
            } while (!replay.equals ("yes") && !replay.equals ("no"));
        } while (replay.equals ("yes"));
    }
}

