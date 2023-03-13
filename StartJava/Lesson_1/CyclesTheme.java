public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int counter = -10;
        int sumEvenNums = 0;
        int sumOddNums = 0;
        do {
            if (counter % 2 == 0) {
                sumEvenNums += counter;
            } else {
                sumOddNums += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.print("В промежутке [-10; 21] сумма четных = " + sumEvenNums);
        System.out.println("; сумма нечетных = " + sumOddNums);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int a = 10;
        int b = 5;
        int c = -1;
        int max = b;
        int min = a;
        if (a > max) {
            max = a;
        }
        if (c > max) {
            max = c;
        } else if (c < min) {
            min = c;
        }
        if (b < min) {
            min = b;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int sumDigits = 0;
        while (num > 0) {
            int digit = num % 10;
            sumDigits += digit;
            System.out.print(digit);
            num /= 10;
        }
        System.out.println("\nСумма цифр " + sumDigits);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int counter1 = 1;
        for (int i = 1; i < 30; i += 2) {
            System.out.printf("%3d", i);
            if (counter1++ == 5) {
                System.out.println();
                counter1 = 1;
            }
        }
        if (counter1 > 1) {
            for (int i = counter1; i <= 5; i++) {
                System.out.printf("%3d", 0);
            }
        }

        System.out.println("\n5. Проверка количества двоек на четность/нечетность");
        int num2 = 3_242_592;
        int copyNum2 = num2;
        int countTwos = 0;
        while (copyNum2 > 0) {
            if (copyNum2 % 10 == 2) {
                countTwos++;
            }
            copyNum2 /= 10;
        }
        if (countTwos % 2 == 0) {
            System.out.println("Число " + num2 + " содержит " + countTwos + " четное количество 2");
        } else {
            System.out.println("Число " + num2 + " содержит " + countTwos + " 'нечетное' количество 2");
        }

        System.out.println("\n6. Отображение фигур в консоли");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        int countRows = 1;
        while (countRows < 6) {
            int countColumns = countRows;
            while (countColumns < 6) {
                System.out.print("#");
                countColumns++;
            }
            System.out.println();
            countRows++;
        }
        System.out.println();

        countRows = 1;
        do {
            int countColumns = 1;
            do {
                System.out.print("$");
                countColumns++;
            } while (countColumns <= countRows && countColumns + countRows <= 6);
            System.out.println();
            countRows++;
         } while (countRows < 6);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.println("Dec" + "\t" + "Char");
        for (int i = 1; i <= 47; i += 2) {
            System.out.printf("%3d %8s%n", i, (char) i);
        }
        for (int i = 98; i <= 122; i += 2) {
            System.out.printf("%3d %8s%n", i, (char) i);
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int num3 = 1234321;
        int copyNum3 = num3;
        int reverseNum3 = 0;
        while (copyNum3 > 0) {
            reverseNum3 = reverseNum3 * 10 + copyNum3 % 10;
            copyNum3 /= 10;
        }
        System.out.println(reverseNum3);
        if (reverseNum3 == num3) {
            System.out.println("Число " + num3 + " является палиндромом");
        } else {
            System.out.println("Число " + num3 + " не является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        int num4 = 123321;
        int sumRight = 0;
        int sumLeft = 0;
        int counter2 = 0;
        int leftHalfNum4 = num4 / 1000;
        int rightHalfNum4 = num4 % 1000;
        while (num4 > 0) {
            if (counter2++ < 3) {
                sumRight += num4 % 10;
            } else {
                sumLeft += num4 % 10;
            }
            num4 /= 10;
        }
        System.out.println("Сумма левой части числа "  + leftHalfNum4 + " = " + sumLeft);
        System.out.println("Сумма правой части числа "  + rightHalfNum4 + " = " + sumRight);
        if (sumRight == sumLeft) {
            System.out.println("Число счастливое");
        } else {
            System.out.println("Число не счастливое");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (j == 2) {
                    System.out.printf( "|" +  "%3d", i * j);
                } else {
                    System.out.printf("%3d", i * j);
                }
            }
            System.out.println();
            if (i == 1) {
                for (int j = 1; j < 10; j++) {
                    if (j == 2) {
                        System.out.printf( "|" +  "%3s", "-");
                    } else {
                        System.out.printf("%3s", "-");
                    }
                }
                System.out.println();
            }
        }
    }
}

