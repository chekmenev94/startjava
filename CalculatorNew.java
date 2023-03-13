import java.util.Scanner;

public class CalculatorNew {
    static Scanner scanner = new Scanner(System.in);

    public static int getInt(){
        System.out.println("Введите число:");
        int num;
        num = scanner.nextInt();
        return num;
    }

    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int num1, int num2, char operation){
        int result = 1;
        switch (operation){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%' :
                result = num1 % num2;
                break;
            case '^':
                for(int i = 0; i < num2; i++) {
                    result *= num1;
                }
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }

    public static String getReplay(){
            System.out.println("Хотите продолжить вычисления?  да / нет");
            String replay;
            if(scanner.hasNext()){
                replay = scanner.nextLine();
            } else {
                System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
                scanner.next();
                replay = getReplay();
            }
            return replay;
        }

    // public static String getReplay() {
    //     System.out.println("Хотите продолжить вычисления?  да / нет");
    //     String replay;
    //     replay = scanner.nextLine();
    //     replay = getReplay();
    //     return replay;
    // }
}