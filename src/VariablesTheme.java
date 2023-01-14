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
        System.out.println("Я смогу стать разработчиком = " + can + '\n');

        // TODO 2. Расчет стоимости товара со скидкой

        int pen = 100;
        int book = 200; 
        int sum = pen + book;
        int sale = sum * 11 /100;
        int price = sum - sale;

        System.out.println("Сумма скидки = " + sale);
        System.out.println("Общая стоимость товара = " + price + '\n');

        // TODO 3. Отобразить сло Java 

        System.out.println("   J    a  v     v  a   ");
        System.out.println("   J   a a  v   v  a a  ");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a" + '\n');

        // TODO 4. Вывод min и max значений целых числовых типов

        byte b = 127, b1 = 127, b2 = 127;
        b1++;
        b2--;
        short s = 32_767, s1 = 32_767, s2 = 32_767;
        s1++;
        s2--;
        int i = 2_147_483_647, i1 = 2_147_483_647, i2 = 2_147_483_647;
        i1++;
        i2--;
        long l = 9_223_372_036_854_775_807l, l1 = 9_223_372_036_854_775_807l,
        l2 = 9_223_372_036_854_775_807l; 
        l1++;
        l2--;

        System.out.println("Самое большое значение типа byte = " + b);
        System.out.println("Инкременирую byte +1 = " + b1);
        System.out.println("Дескременирую  byte -1 = " + b2);
        System.out.println("Самое большое значение типа short = " + s);
        System.out.println("Инкременирую short +1 = " + s1);
        System.out.println("Дескременирую  short -1 = " + s2);
        System.out.println("Самое большое значение типа int = " + i);
        System.out.println("Инкременирую int +1 = " + i1);
        System.out.println("Дескременирую  int -1 = " + i2);
        System.out.println("Самое большое значение типа long = " + l);
        System.out.println("Инкременирую long +1 = " + l1);
        System.out.println("Дескременирую  long -1 = " + l2 + '\n');

        // TODO 5. Перестановка значений 

        int a = 2, c = 5;
        int tmp;
        tmp = a;
        a = c;
        c = tmp;
        a = a + c;
        c = a - c;
        a = a - c;
        a ^= c;
        c ^=a;
        a ^=c;

        System.out.println("Способ перестановки переменных 1.С помощью ввода новой");
        System.out.println("a = " + a + "; c = " + c);
        System.out.println("Способ перестановки переменных 2.Арифметических операций");
        System.out.println("a = " + a + "; c = " + c);
        System.out.println("Способ перестановки переменных 3.Побитовой операции");
        System.out.println("a = " + a + "; c = " + c);
    }
 }
