public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод значений переменных на консоль");
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

        System.out.println("2. Расчет стоимости товара со скидкой");
        int pricePen = 100;
        int priceBook = 200; 
        int sum = pricePen + priceBook;
        int discountSum = sum * 11 / 100;
        int discountPrice = sum - discountSum;

        System.out.println("Сумма скидки = " + discountSum);
        System.out.println("Общая стоимость товара = " + discountPrice + '\n');

        System.out.println("3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a   ");
        System.out.println("   J   a a  v   v  a a  ");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a\n");


        System.out.println("4. Вывод min и max значений целых числовых типов");
        byte maxByte = 127;
        System.out.println("Самое большое значение типа byte = " + maxByte);
        maxByte++;
        System.out.println("Дескременирую  byte +1 = " + maxByte);
        maxByte--;
        System.out.println("Инкременирую byte -1 = " + maxByte);

        short maxShort = 32_767;
        System.out.println("Самое большое значение типа short = " + maxShort);
        maxShort++;
        System.out.println("Инкременирую short +1 = " + maxShort);
        maxShort--;
        System.out.println("Дескременирую  short -1 = " + maxShort);

        int maxInt = 2_147_483_647;
        System.out.println("Самое большое значение типа int = " + maxInt);
        maxInt++;
        System.out.println("Инкременирую int +1 = " + maxInt);
        maxInt--;
        System.out.println("Дескременирую  int -1 = " + maxInt);

        long maxlong = 9_223_372_036_854_775_807l;
        System.out.println("Самое большое значение типа long = " + maxlong);
        maxlong++;
        System.out.println("Инкременирую long +1 = " + maxlong);
        maxlong--;
        System.out.println("Дескременирую  long -1 = " + maxlong + '\n');

        System.out.println("5. Перестановка значений");
        int a = 2, b = 5;
        System.out.println("Исходные значения a = " + a + "; b = " + b);
        int tmp;
        tmp = a;
        a = b;
        b = tmp;
        System.out.println("Способ перестановки переменных 1.С помощью ввода новой");
        System.out.println("a = " + a + "; b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Способ перестановки переменных 2.Арифметических операций");
        System.out.println("a = " + a + "; b = " + b);

        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("Способ перестановки переменных 3.Побитовой операции");
        System.out.println("a = " + a + "; b = " + b);

        System.out.println("\n6. Вывод символов и их кодов");
        char code = 35;
        char code1 = 38;
        char code2 = 64;
        char code3 = 94;
        char code4= 95;

        System.out.println("Код символа = " + (int)code + " соответствующий символ = " + code);
        System.out.println("Код символа = " + (int)code1 + ", соответствующий символ = " + code1);
        System.out.println("Код символа = " + (int)code2 + ", соответствующий символ = " + code2);
        System.out.println("Код символа = " + (int)code3 + ", соответствующий символ = " + code3);
        System.out.println("Код символа = " + (int)code4 + ", соответствующий символ = " + code4);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char code5 = 47;
        char code6 = 92;
        char code7 = 95;
        char code8 = 40;
        char code9 = 41;

        System.out.println("    " + code5 + code6 + "    ");
        System.out.println("   " + code5 + "  " + code6 + "   ");
        System.out.println("  " + code5 + code7 + code8 + " " + code9 + code6 + "  ");
        System.out.print(" " + code5 + "      " + code6 + " \n" + code5 + code7 + code7 + code7);
        System.out.println(code7 + "" + code5  + code6 + code7 + code7 + code6 + " \n");

        System.out.println("8. Вывод количества сотен, десятков и единиц числа");
        int num = 123;
        int x = num % 1000 / 100; 
        int y = num % 100 / 10;
        int z = num % 10;
        int sum1 = x + y+ z;
        int composition = x * y* z;

        System.out.println("Число 123 содержит: \n" + x + " - сотен");
        System.out.println(y + " - десятков");
        System.out.println(z + " - единиц");
        System.out.println("Сумма его чисел = " + sum1);
        System.out.println("Произведение = " + composition + '\n');

        System.out.println("9. Вывод времени");
        int secs = 86399; // количество секунд
        int hour = secs / 3600;
        int min = secs % 3600 / 60;
        int sec =  secs % 60;

        System.out.println( "Вывод времени 86399 секунд: " + hour + ":" + min + ":" + sec);
    }
 }
