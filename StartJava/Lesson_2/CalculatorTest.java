import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calculationOne = new Calculator();
        String replay;
        do {
            System.out.println("Введите значение первой переменной ");
            calculationOne.setNum1(scan.nextInt());
            System.out.println("Введите арифметический знак ");
            calculationOne.setOperation(scan.next().charAt(0));
            System.out.println("Введите значение второй переменной ");
            calculationOne.setNum2(scan.nextInt());
            int result = calculationOne.calc();
            System.out.println("Результат вычислений: " + result);
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no] ");
                replay = scan.nextLine();
            } while (!replay.equals ("yes") && !replay.equals ("no"));
        } while(replay.equals ("yes"));
    }
}