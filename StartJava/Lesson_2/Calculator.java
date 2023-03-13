public class Calculator {

    private int num1;
    private int num2;
    private char operation;


    public int getNum1() {
        return num1;
    }
    public void setNum1(int num) {
        num1 = num;
    }

    public char getOperation() {
        return operation;
    }
    public void setOperation(char operation) {
        this.operation = operation;
    }

    public int getNum2() {
        return num2;
    }
        public void setNum2(int num) {
        num2 = num;
    }

    public int calc() {
        int result = 1;
        switch (operation) {
            case '+' :
                return result = num1 + num2;
            case '-' :
                return result = num1 - num2;
            case '*' :
                return result = num1 * num2;
            case '/' :
                return result = num1 / num2;
            case '%' :
                return result = num1 % num2;
            case '^' :
                for (int i = 0; i < num2; i++) {
                    result *= num1;
                }
                return result;
            default:
                System.out.println("Некорректно ввели арифметический знак");
                return 0;
        }
    }
}