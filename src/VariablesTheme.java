public class VariablesTheme {
    public static void main(String[] args) {

        // TODO Вывод значений переменных на консоль

        byte core = 8;
        short windows = 10;
        int system = 64;
        long memory = 8192;
        float processor = 1.6F;
        double freeSrc = 113664.547D;
        char myComputer = 72; // ввод названия ноутбука через ASCII-таблицу
        char myComputer1 = 80;
        boolean can = true;

        System.out.println("Количество ядер = " + core);
        System.out.println("Номер операционной системы Видовс = " + windows);
        System.out.println("Тип операционной системы = " + system);
        System.out.println("Объем оперативной памяти в мегабайтах = " + memory);
        System.out.println("Частота процессора = " + processor);
        System.out.println("Свободное место на жестком диске = " + freeSrc);
        System.out.print("Модель моего ноутбука = " + myComputer);
        System.out.println(myComputer1);
        System.out.println("Я смогу стать разработчиком = " + can);
    }
 }
