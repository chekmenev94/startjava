public class Calculator {

    private int num1;
    private int num2;
    private char operation;
    int result = 1;

    public int getNum1(int num) {
        num1 = num;
        return num1;
    }

    public char getOperation(char operation) {
        this.operation = operation;
        return operation;
    }

    public int getNum2(int num) {
        num2 = num;
        return num2;
    }

    public int calc() {
        switch (operation) {
            case '+' :
                result = num1 + num2;
                    break;
            case '-' :
                result = num1 - num2;
                    break;
            case '*' :
                result = num1 * num2;
                    break;
            case '/' :
                result = num1 /num2;
                    break;
            case '%' :
                result = num1 % num2;
                    break;
            case '^' :
                for (int i = 0; i < num2; i++) {
                    result *= num1;
                }
                break;
            default:
                System.out.println("Некорректно ввели арифметический знак");
                result = 0;
                break;
        }
        return result;
    }
}