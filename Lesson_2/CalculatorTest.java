import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calculate = new Calculator();
        while (true) {
            System.out.println("Введите значение первой переменной ");
            calculate.getNum1(scan.nextInt());
            System.out.println("Введите арифметический знак ");
            calculate.getOperation(scan.next().charAt(0));
            System.out.println("Введите значение второй переменной ");
            calculate.getNum2(scan.nextInt());
            int result = calculate.calc();
            System.out.println("Результат вычислений: " + result);
            System.out.println("Хотите продолжить вычисления? [yes/no] ");
            String replay;
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
            }
        }
    }
}