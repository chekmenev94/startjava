public class CalculatorOld {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        char sign = '^';
        int result = 0;
        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            result = a / b;
        } else if (sign == '^') {
            result = 1;
            for(int i = 1; i <= b; i++) {
                result *= a;
            }
        } else if (sign == '%') {
            result = a % b;
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}