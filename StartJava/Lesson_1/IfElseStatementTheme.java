public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 28;
        if (age > 20) {
            System.out.println("Мой возраст " + age + " больше 20");
        } else if (age < 20) {
            System.out.println("Мой возраст " + age + " меньше 20");
        }
        boolean maleGender = true;
        if (maleGender) {
            System.out.println("Мужчина - защитник родины");
        } else {
            System.out.println("Женщина - хранительница домашнего очага");
        }
        float height = 1.72f; // мой рост 172 см
        if (height > 1.80) {
            System.out.println("Мой рост - " + height + " > 1.80");
        } else if (height < 1.80) {
            System.out.println("Мой рост - " + height + " < 1.80");
        }

        char firstLetter = "Ivan".charAt(0);
        if (firstLetter == 'M') {
            System.out.println("В Имени Mikhail - первая буква " + firstLetter);
        } else if (firstLetter == 'I') {
            System.out.println("В Имени Ivan - первая буква " + firstLetter);
        }

        System.out.println("\n2. Поиск max и min числа");
        int num1 = 120;
        int num2 = 15;
        if (num1 == num2) {
            System.out.println("Число " + num1 + " равно числу " + num2);
        } else if (num1 > num2) {
            System.out.println("Max - " + num1 + " Min - " + num2);
        } else {
            System.out.println("Max - " + num2 + " Min - " + num1);
        }

        System.out.println("\n3. Проверка числа");
        int num3 = 88;
        System.out.print("Число = " + num3);
        if (num3 == 0) {
            System.out.println();
        } else {
            if (num3 % 2 == 0) {
                System.out.print(", является четным");
            } else {
                System.out.print(", является нечетным");
            }
            if (num3 > 0) {
                System.out.println(", положительным");
            } else {
                System.out.println(", отрицательным");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int num4 = 121;
        int num5 = 101;
        System.out.println("Исходные числа: первое число - " + num4 + ", второе число - " + num5);
        int hundreds = num4 / 100;
        int hundreds1 = num5 / 100;
        int tens = num4 / 10 % 10;
        int tens1 = num5 / 10 % 10;
        int ones = num4 % 10;
        int ones1 = num5 % 10;
        if (tens != tens1 && ones != ones1) {
            System.out.println("Равных цифр в числах нет");
        } else {
            if (hundreds == hundreds1) {
                System.out.println("Сотни исходных чисел: " + hundreds + " = " + hundreds1 + " равны");
            }
            if (tens == tens1) {
                System.out.println("Десятки исходных чисел: " + tens + " = " + tens1 + " равны");
            }
            if (ones == ones1) {
                System.out.println("Единицы исходных чисел: " + ones + " = " + ones1 + " равны");
            }
        }

        System.out.println("\n5. Определение символа по его коду");
        char ch = '\u0057';
        System.out.print("Символ кода " + (int) ch + " = " + ch);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println(" - маленькая буква");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println(" - Большая буква");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(" - является числом");
        } else {
            System.out.println(" - не буква, и не число");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        long deposit = 300_000;
        int percent = 5;
        System.out.println("Сумма вклада = " + deposit + " рублей");
        if (deposit >= 100_000 && deposit < 300_000) {
            percent = 7;
        } else if (deposit >= 300_000) {
            percent = 10;
        }
        long income = deposit * percent / 100;
        long totalDeposit = deposit + income;
        System.out.println("Начисленный процент: " + income + " руб");
        System.out.println("Итоговая сумма с %: " + totalDeposit + " руб");

        System.out.println("\n7. Определение оценки по предметам");
        int percentHistory = 59;
        int percentProgramming = 91;
        int scoreHistory = 2;
        int scoreProgramming = 2;

        if (percentHistory >= 60 && percentHistory <= 73) {
            scoreHistory = 3;
        } else if (percentHistory >= 73 && percentHistory < 91) {
            scoreHistory = 4;
        } else if (percentHistory >= 91) {
            scoreHistory = 5;
        }
        System.out.println(scoreHistory + " - оценка по Истории");

        if (percentProgramming >= 60 && percentProgramming <= 73) {
            scoreProgramming = 3;
        } else if (percentProgramming >= 73 && percentProgramming < 91) {
            scoreProgramming = 4;
        } else if (percentProgramming >= 91) {
            scoreProgramming = 5;
        }
        System.out.println(scoreProgramming + " - оценка по Программированию");
        float averageScore = (scoreHistory + scoreProgramming) / 2f;
        System.out.println("Средняя оценка " + averageScore);
        int averagePercent = (percentHistory + percentProgramming) / 2;
        System.out.println("Средний процент " + averagePercent);

        System.out.println("\n8. Расчет прибыли за год");
        long roomConsumption = 5_000;
        long revenue = 13_000;
        long costPrice = 9_000;
        long annualProfit = (revenue - costPrice - roomConsumption) * 12;
        if (annualProfit > 0) {
            System.out.println("Годовая прибыль = +" + annualProfit);
        } else {
            System.out.println("Годовая прибыль = " + annualProfit);
        }

        System.out.println("\n9. Подсчет количества банкнот");
        long sum = 567;
        int nominalHundreds = 10;
        int nominalTens = 5;
        int nominalOnes = 50;
        long hundreds2 = sum / 100;
        long tens2 = sum % 100 / 10;
        long ones2 = sum % 10;
        long sumBank = nominalHundreds * 100 + nominalTens * 10 + nominalOnes;
        long balanceOnes = nominalOnes - (tens2 * 10 - nominalTens * 10);

        if (sumBank <= sum || balanceOnes < ones2) {
            System.out.println("Банкнот не хватает для выдачи нужной суммы: " + sum);
        } else {
            System.out.println("Для выдачи " + sum  + "$ необходимо:");
            long giveHundreds = 0;
            long giveTens = 0;
            long giveOnes = 0;
            if (nominalHundreds >= hundreds2) {
                giveHundreds = hundreds2;
            } else {
                giveHundreds = nominalHundreds;
                giveTens = tens2 + (hundreds2 * 10 - nominalHundreds * 10);
            }
            if (nominalTens >= tens2) {
                giveTens = tens2;
                giveOnes = ones2;
            } else {
                giveTens = nominalTens;
                giveOnes = ones2 + (tens2 * 10 - nominalTens * 10);
            }
            System.out.println("Выдача банкнот номиналом 100 = " + giveHundreds + " банкнот");
            System.out.println("Выдача банкнот номиналом 10 = " + giveTens + " банкнот");
            System.out.println("Выдача банкнот номиналом 1 = " + giveOnes + " банкнот");
        }
    }
}
