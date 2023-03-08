public class CalculatorTest {

    public static void main(String[] args) {
        CalculatorNew calculator1 = new CalculatorNew();
        int num1 = calculator1.getInt();
        char operation = calculator1.getOperation();
        int num2 = calculator1.getInt();
        int result = calculator1.calc(num1,num2,operation);
        System.out.println("Результат операции: "+ result);

        String replay = calculator1.getReplay();
        while(replay == "yes") {
            num1 = calculator1.getInt();
            operation = calculator1.getOperation();
            num2 = calculator1.getInt();
            result = calculator1.calc(num1,num2,operation);
            System.out.println("Результат операции: "+ result);
            continue;
        }
        if (replay == "no") {
            System.out.println("Поздравляем вы закончили вычисления!");
        }
    }
}