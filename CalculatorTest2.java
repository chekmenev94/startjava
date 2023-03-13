public class CalculatorTest {

    public static void main(String[] args) {
        big();
        String replay = calculator1.getReplay();
        System.out.println("Вы хотите продолжить вычисления?");
        if (replay.equals("Y")) {
            big();
        }
    }

        public static void big() {
            CalculatorNew calculator1 = new CalculatorNew();
            int num1 = calculator1.getInt();
            int num2 = calculator1.getInt();
            char operation = calculator1.getOperation();
            int result = calculator1.calc(num1,num2,operation);
            System.out.println("Результат операции: "+ result);
        }
}







        // CalculatorNew calculator1 = new CalculatorNew();
        // int num1 = calculator1.getInt();
        // int num2 = calculator1.getInt();
        // char operation = calculator1.getOperation();
        // int result = calculator1.calc(num1,num2,operation);
        // System.out.println("Результат операции: "+ result);

        // String replay = calculator1.getReplay();
        // while(replay == "yes") {
        //     num1 = calculator1.getInt();
        //     operation = calculator1.getOperation();
        //     num2 = calculator1.getInt();
        //     result = calculator1.calc(num1,num2,operation);
        //     System.out.println("Результат операции: "+ result);
        // }
        // if (replay == "no") {
        //     System.out.println("Поздравляем вы закончили вычисления!");
        // }
