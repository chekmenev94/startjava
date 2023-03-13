import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int result = 0;
        System.out.println("Введите первое число ");
        int num1 = sc.nextInt();
        System.out.println("Введите второе число ");
        int num2 = sc.nextInt();
        System.out.println("Введите арифметический знак ");
        char sign = sc.next().charAt(0);
        switch (sign) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            default:
                System.out.println("Вы ввели неправильный знак");
                sc.next();//рекурсия
                sign = sc.next().charAt(0);
        }
        System.out.println("Результат вычислений равен " + result);
   }
}