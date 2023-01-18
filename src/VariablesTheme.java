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
        int sumPrice = pricePen + priceBook;
        int discountSum = sumPrice * 11 / 100;
        int discountPrice = sumPrice - discountSum;

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
        System.out.println("Декременирую  byte +1 = " + maxByte);
        maxByte--;
        System.out.println("Инкременирую byte -1 = " + maxByte);

        short maxShort = 32_767;
        System.out.println("Самое большое значение типа short = " + maxShort);
        maxShort++;
        System.out.println("Инкременирую short +1 = " + maxShort);
        maxShort--;
        System.out.println("Декременирую  short -1 = " + maxShort);

        int maxInt = 2_147_483_647;
        System.out.println("Самое большое значение типа int = " + maxInt);
        maxInt++;
        System.out.println("Инкременирую int +1 = " + maxInt);
        maxInt--;
        System.out.println("Декременирую  int -1 = " + maxInt);

        long maxlong = 9_223_372_036_854_775_807l;
        System.out.println("Самое большое значение типа long = " + maxlong);
        maxlong++;
        System.out.println("Инкременирую long +1 = " + maxlong);
        maxlong--;
        System.out.println("Декременирую  long -1 = " + maxlong + '\n');

        System.out.println("5. Перестановка значений");
        int a = 2, b = 5;
        System.out.println("Исходные значения a = " + a + "; b = " + b);
        int tmp = a;
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
        char octothorpe = '#';
        char i = '&';
        char dog = '@';
        char caret = '^';
        char minus = '_';

        System.out.print("Код символа = " + (int) octothorpe);
        System.out.println(" соответствующий символ = " + octothorpe);
        System.out.println("Код символа = " + (int) i + ", соответствующий символ = " + i);
        System.out.println("Код символа = " + (int) dog + ", соответствующий символ = " + dog);
        System.out.println("Код символа = " + (int) caret + ", соответствующий символ = " + caret);
        System.out.println("Код символа = " + (int) minus + ", соответствующий символ = " + minus);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backSlash = '\\';
        char minus1 = '_';
        char lBracket = '(';
        char rBracket = ')';

        System.out.println("    " + slash + backSlash + "    ");
        System.out.println("   " + slash + "  " + backSlash + "   ");
        System.out.println("  " + slash + minus1 + lBracket + " " + rBracket + backSlash + "  ");
        System.out.println(" " + slash + "      " + backSlash + " ");
        System.out.print(slash + "" + minus1 + minus1 + minus1);
        System.out.println(minus1 + "" + slash  + backSlash + minus1 + minus1 + backSlash + " \n");

        System.out.println("8. Вывод количества сотен, десятков и единиц числа");
        int num = 123;
        int hundred = num / 100; 
        int ten = num % 100 / 10;
        int unit = num % 10;
        int sum = hundred + ten + unit;
        int multiplication = hundred * ten * unit;

        System.out.println("Число 123 содержит: \n" + hundred + " - сотен");
        System.out.println(ten + " - десятков");
        System.out.println(unit + " - единиц");
        System.out.println("Сумма его чисел = " + sum);
        System.out.println("Произведение = " + multiplication + '\n');

        System.out.println("9. Вывод времени");
        int totalSeconds = 86399; // исходное количество секунд
        int hour = totalSeconds / 3600;
        int min = totalSeconds % 3600 / 60;
        int sec = totalSeconds % 60;

        System.out.println( "Вывод времени 86399 секунд: " + hour + ":" + min + ":" + sec);
    }
 }
