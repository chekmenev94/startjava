public class GuessNumber {

    private int secretNum;
    private int attempts = 1;
    private String player1;
    private String player2;
    private int numPlayer = 50;

    public void Player(Player playerOne, Player playerTwo) {
        this.player1 = playerOne.getName();
        this.player2 = playerTwo.getName();
    }

    public String getPlayer1() {
        return player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public void secretNum(int secretNum) {
        this.secretNum = secretNum;
    }

    public void num1(Player playerOne) {
        this.numPlayer = playerOne.getNum();
    }
    public int getNum1() {
        return numPlayer;
    }

    public void num2(Player playerTwo) {
        this.numPlayer = playerTwo.getNum();
    }
    public int getNum2() {
        return numPlayer;
    }

    public void gamePlayer() {
        while (true) {
            if (numPlayer > secretNum) {
                System.out.println("Число больше того, что загадал компьютер ");
                break;
            } else if (numPlayer < secretNum) {
                System.out.println("Число меньше того, что загадал компьютер ");
                break;
            }
            System.out.println("Вы победили");
            break;
        }
    }
}