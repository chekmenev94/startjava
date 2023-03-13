import java.util.Scanner;

public class Calculator2 {

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("Введите значение первой переменной ");
            int a = scan.nextInt();
            System.out.println("Введите арифметический знак ");
            char operation = scan.next().charAt(0);
            System.out.println("Введите значение второй переменной ");
            int b = scan.nextInt();
            int result = 1;
            switch (operation) {
                case '+' :
                    result = a + b;
                    break;
                case '-' :
                    result = a - b;
                    break;
                case '*' :
                    result = a * b;
                    break;
                case '/' :
                    result = a / b;
                    break;
                case '%' :
                    result = a % b;
                    break;
                case '^' :
                    for (int i = 0; i < b; i++) {
                        result *= a;
                    }
                    break;
                default:
                    System.out.println("Некорректно ввели арифметический знак");
                    continue;
            }
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