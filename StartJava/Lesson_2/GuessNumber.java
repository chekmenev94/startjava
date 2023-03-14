import java.util.Scanner;

public class GuessNumber {
    private int secretNum = 10;
    private int attempts = 1;
    private String player1;
    private String player2;
    private int numPlayer;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.player1 = playerOne.getName();
        this.player2 = playerTwo.getName();
    }

    public void setSecretNum(int secretNum) {
        this.secretNum = secretNum;
    }

    public void gamePlayer(Scanner scan) {
        do {
            System.out.println("Игрок " + player1 + " ваше число ");
            numPlayer = scan.nextInt();
            if (numPlayer > secretNum) {
                System.out.println("Число больше того, что загадал компьютер ");
            } else if (numPlayer < secretNum) {
                System.out.println("Число меньше того, что загадал компьютер ");
            } else if (numPlayer == secretNum) {
                break;
            }
            System.out.println("Игрок " + player2 + " ваше число ");
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