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
        int max = b;
        int min = a;
        if (a > max && a > c) {
            max = a;
        }
        if (b < min && b < c) {
            min = b;
        }
        if (c > max && c > a) {
            max = c;
        } else if (c < min && c < b) {
            min = c;
        }
        for (int i = max-1; i > min; i--) {
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
        for (int i1 = 1; i1 < 24; i1+=2) {
            System.out.printf("%3d", i1);
            if (counter1++ == 5) {
            System.out.println();
            counter1 -= 5;
            }
        }    
        for (int j = counter1; j <= 5; j++) {
            System.out.print("  " + 0);
        }
        

        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность");
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
            leftSideNum5 /= 10;
        }
        System.out.println(" = " + sumLeft);

        int rightSideNum5 = num5 % 1000;
        System.out.print("Сумма правой части числа "  + rightSideNum5);
        while (rightSideNum5 !=0) {
            sumRight = sumRight + rightSideNum5 % 10;
            rightSideNum5 /= 10;
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
            System.out.println();
        }
    }
}

