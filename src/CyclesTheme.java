public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int num = -10;
        long evenNumbersCount = 0;
        long oddNumbersCount = 0;
        do {
            if(num % 2 == 0) {
                evenNumbersCount = evenNumbersCount + num;
            } else {
            oddNumbersCount = oddNumbersCount + num;
            }
            num++;
        } while(num <= 21);
        System.out.print("В промежутке [-10; 21] сумма четных = " + evenNumbersCount);
        System.out.println("; сумма нечетных = " + oddNumbersCount);

        System.out.println("2. Вывод чисел в интервале (min и max) в порядке убывания");
        int a = 10;
        int b = 5;
        int c = -1;
        int max = 0;
        int mid = 0;
        int min = 0;
        for (int i = 10; i >= -1; i--) {
            if(a > b && a > c) {
                max = a;
                if(b > c) {
                    mid = b;
                    min = c;
                } else {
                    mid = c;
                    min = b;
                }
            } else if(b > a && b > c) {
                max = b;
                if(a > c) {
                    mid = a;
                    min = c;
                } else {
                    mid = c;
                    min = a;
                }
            } else if(c > a && c > b) {
                max = c;
                if(a > b) {
                    mid = a;
                    min = b;
                } else {
                    mid = b;
                    min = a;
                }
            }
        }
        System.out.println(max + " максимальное, " + mid + " среднее, " + min +" минимальное");

        System.out.println("3. Вывод реверсивного числа и суммы его цифр");
        long num1 = 1234;
        int i = 10;
        long thousands = 0;
        long hundreds = 0;
        long tens = 0;
        long ones = 0;
        while(i > 0) {
            ones = num1 % 10;
            if(i == ones) {
                System.out.print(ones);
            }
            tens = num1 % 100 / 10;
            if(i == tens) {
                System.out.print(tens);
            }
            hundreds = num1 % 1000 / 100;
            if(i == hundreds) {
                System.out.print(hundreds);
            }
            thousands = num1 / 1000;
            if(i == thousands) {
                System.out.println(thousands);
            }
            i--;
        }
        System.out.println(ones + tens + hundreds + thousands);

        System.out.println("4. Вывод чисел на консоль в несколько строк");

        for(int x = 2; x <= 24; x += 10) {

            for(int x1 = x; x1 < x + 10 && x1 <= 24; x1+=2 ) {
                System.out.printf("%3d", x1);
            }
            System.out.println();
        }
        
        System.out.println("\n5. Проверка количества двоек на четность/нечетность");
        long num2 = 3_242_592;
        long k = 100000;
        long result2 = 0;
        long sum = 0;
        long quantity = 0;
        while(k > 0) {
            result2 = num2 / k % 10;
            if(result2 == 2 ) {
                sum = sum + result2;
            }
            k = k / 10;
        }
        quantity = sum / 2;
        if(quantity / 2 == 0) {
            System.out.println("Число " + num2 + " содержит " + quantity + "четное количество 2");
        } else {
            System.out.println("Число " + num2 + " содержит " + quantity + " (нечетное) количество 2");
        }

        System.out.println("6. Отображение фигур в консоли");

        for( int i1 = 0; i1 < 5; i1++) {
            for (int j1 = 0; j1 < 10; j1++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int i2 = 0;
        while(i2 < 5) {
            int j2 = i2;
            while (j2 < 5) {
                System.out.print("#");
                j2++;
            }
            System.out.println();
            i2++;
        }
        int i3 = 3;
        int i4 = 3;
        do {
            for(int j = i3; j <=3; j++) {
                System.out.print("$");
            }
            System.out.println();
            i3--;
        }while(i3 > 0);
        do {
            for(int j1 = i4-1; j1 > 0; j1--) {
                System.out.print("$");
            }
            System.out.println();
            i4--;
        }while(i4 > 0);

        System.out.println("7. Отображение ASCII-символов");
        System.out.println("Dec" + "\t" + "Char");
        for(char ch3 = 98; ch3 <= 122; ch3+=2) {
            System.out.println((int) ch3 + "\t" + ch3);
        }
        for(char ch4 = 1; ch4 <= 47; ch4+=2) {
            System.out.println((int) ch4 + "\t" + ch4);
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int num3 = 1234321;
        int numCopy = num3;
        int reverseNumInt = 0;
        while(numCopy != 0) {
            reverseNumInt = reverseNumInt * 10 + numCopy % 10;
            numCopy /= 10;
        }
        System.out.println(reverseNumInt);
        if(reverseNumInt == num3) {
            System.out.println("Число " + num3 + " является палиндромом");
        }else {
            System.out.println("Число " + num3 + " не является палиндромом");
        }
        System.out.println("\n9. Определение, является ли число счастливым");
        int num4 = 123321;
        int sumRight = 0;
        int sumLeft = 0;

        int rightSideNum4 = num4 / 1000;
        System.out.print("Сумма левой части числа "  + rightSideNum4);
        while (rightSideNum4 !=0) {
            sumRight = sumRight + rightSideNum4 % 10;
            rightSideNum4 /=10;
        }
        System.out.println(" = " + sumRight);

        int leftSideNum4 = num4 % 1000;
        System.out.print("Сумма правой части числа "  + leftSideNum4);
        while (leftSideNum4 !=0) {
            sumLeft = sumLeft + leftSideNum4 % 10;
            leftSideNum4 /=10;
        }
        System.out.println(" = " +sumLeft);
        if(sumRight == sumLeft) {
            System.out.println("Число счастливое");
        } else {
            System.out.println("Число не счастливое");
        }
        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        for (int i6 = 1; i6 < 10; i6++) {
            for (int j6 = 1; j6 < 10; j6++) {
                System.out.printf("%3d", i6 * j6);
            }
            System.out.print("\n");
        }
    
    }
}

