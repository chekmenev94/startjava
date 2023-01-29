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

        for(int x = 1; x <= 24; x += 2) {
            if (x >1 && x <= 11) {
                System.out.printf("%d", x);
            } else if (x > 11 && x <= 21) {
                System.out.printf("%d", x);
            }
            System.out.println();
        }
        
        System.out.println("\n5. Проверка количества двоек на четность/нечетность");
        long num2 = 3_242_592;
        long k = 100000;
        long result2 = 0;
        long sum = 0;
        long quantity;
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

        int r = 5;
        for( int i2 = 0; i2 < r; i2++) {
            for (int j2 = i2; j2 < r; j2++) {
                System.out.print("#");
            }
            System.out.println();
        }
        for( int i1 = 0; i1 < r; i1++) {
            for (int j1 = -4; j1 < r; j1++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
        
        
    }
}

