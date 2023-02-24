public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int counter = -10;
        long sumEvenNumbers = 0;
        long sumOddNumbers = 0;
        do {
            if (counter % 2 == 0) {
                sumEvenNumbers += counter;
            } else {
            sumOddNumbers += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.print("В промежутке [-10; 21] сумма четных = " + sumEvenNumbers);
        System.out.println("; сумма нечетных = " + sumOddNumbers);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int a = 10;
        int b = 5;
        int c = -1;
        int maxNum = 0;
        int minNum = 0;
        if (a > b && a > c) {
            maxNum = a;
        } else if (a < b && a < c) {
            minNum = a;
        }
        if (b > a && b > c) {
            maxNum = b;
        } else if (b < a && b < c) {
            minNum = b;
        }
        if (c > a && c > b) {
            maxNum = c;
        } else if (c < a && c < b) {
            minNum = c;
        }
        for (int i = maxNum; i >= minNum; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        long num1 = 1234;
        long i1 = 1;
        long numRewers = 0;
        long numSum = 0;
        while (i1 <= 1000) {
            numRewers = num1 / i1 % 10;
            numSum += numRewers;
            System.out.print(numRewers);
            i1 *=10;
        }
        System.out.println("\nСумма цифр " + numSum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        for (int j = 1; j <= 31; j+=10) {
            for (int i2 = j; i2 < 10; i2+=2) {
                System.out.printf("%3d", i2);
            }
            for (int i2 = j; i2 > 10 && i2 < 20; i2+=2) {
                System.out.printf("%3d", i2);
            }
            for (int i2 = j; i2 > 20 && i2 < 24; i2+=2) {
                System.out.printf("%3d", i2);
            }
            System.out.println();
        }

        System.out.println("5. Проверка количества двоек на четность/нечетность");
        long num2 = 3_242_592;
        long num3 = num2;
        int k = 0;
        long result = 0;
        long countTwos = 0;
        while (k < 7) {
            result = num3 % 10;
            num3 /= 10;
            if (result == 2) {
                countTwos += result / 2;
            }
            k++;
        }
        if (countTwos % 2 == 0) {
            System.out.println("Число " + num2 + " содержит " + countTwos + " четное количество 2");
        } else {
            System.out.println("Число " + num2 + " содержит " + countTwos + " не четное количество 2");
        }

        System.out.println("\n6. Отображение фигур в консоли");
        for ( int i3 = 0; i3 < 5; i3++) {
            for (int j1 = 0; j1 < 10; j1++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        int i4 = 0;
        while (i4 < 5) {
            int j2 = i4;
            while (j2 < 5) {
                System.out.print("#");
                j2++;
            }
            System.out.println();
            i4++;
        }
        System.out.println();
        int i5 = 3;
        int i6 = 2;
        do {
            for (int j3 = i5; j3 <=3; j3++) {
                System.out.print("$");
            }
            System.out.println();
            i5--;
        }while (i5 > 0);
        do {
            for (int j4 = i6; j4 > 0; j4--) {
                System.out.print("$");
            }
            System.out.println();
            i6--;
        }while (i6 > 0);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.println("Dec" + "\t" + "Char");
        for (char ch4 = 1; ch4 <= '/'; ch4+=2) {
            System.out.println((int) ch4 + "\t" + ch4);
        }
        for (char ch3 = 'b'; ch3 <= 'z'; ch3+=2) {
            System.out.println((int) ch3 + "\t" + ch3);
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int num4 = 1234321;
        int numCopy = num4;
        int reverseNumInt = 0;
        while (numCopy != 0) {
            reverseNumInt = reverseNumInt * 10 + numCopy % 10;
            numCopy /= 10;
        }
        System.out.println(reverseNumInt);
        if (reverseNumInt == num4) {
            System.out.println("Число " + num4 + " является палиндромом");
        } else {
            System.out.println("Число " + num4 + " не является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        int num5 = 123321;
        int sumRight = 0;
        int sumLeft = 0;

        int leftSideNum5 = num5 / 1000;
        System.out.print("Сумма левой части числа "  + leftSideNum5);
        while (leftSideNum5 !=0) {
            sumLeft = sumLeft + leftSideNum5 % 10;
            leftSideNum5 /=10;
        }
        System.out.println(" = " + sumLeft);

        int rightSideNum5 = num5 % 1000;
        System.out.print("Сумма правой части числа "  + rightSideNum5);
        while (rightSideNum5 !=0) {
            sumRight = sumRight + rightSideNum5 % 10;
            rightSideNum5 /=10;
        }
        System.out.println(" = " + sumRight);
        if (sumRight == sumLeft) {
            System.out.println("Число счастливое");
        } else {
            System.out.println("Число не счастливое");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        for (int i7 = 1; i7 < 10; i7++) {
            for (int j5 = 1; j5 < 10; j5++) {
                System.out.printf("%3d", i7 * j5);
            }
            System.out.print("\n");
        }
    }
}

