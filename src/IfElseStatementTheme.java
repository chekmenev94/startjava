public class IfElseStatementTheme {
    public static void main (String [] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 28;
        boolean isAgeMore = age - 20 != 0;
        if(isAgeMore == true) {
            System.out.println("Мой возраст " + age + " больше 20");
        } else if(isAgeMore == false) {
            System.out.println("Мой возраст " + age + " меньше 20");
        }

        int sex = 1; // 1 - значение мужского пола, 0 - значение женского
        boolean isSexDetermination = sex == 1;
        if(isSexDetermination == true) {
            System.out.println("Мужчина - защитник родины");
        } else if(isSexDetermination == false) {
            System.out.println("Женщина - хранительница домашнего очага");
        }

        float height = 1.72f; // мой рост 172 см
        boolean isMyHeight = height >= 1.80;
        if(isMyHeight == true) {
            System.out.println("Мой рост - " + height + " > 1.80");
        } else if(isMyHeight == false) {
            System.out.println("Мой рост - " + height + " < 1.80");
        }

        char firstLetter = "Ivan".charAt(0);
        boolean isFirstLetterName = firstLetter == 'M';
        if(isFirstLetterName == true) {
            System.out.println("В Имени Mikhail - первая буква " + firstLetter);
        } else if(isFirstLetterName == false) {
            System.out.println("В Имени Ivan - первая буква " + firstLetter);
        }

        System.out.println("\n2. Поиск max и min числа");
        int num1 = 120;
        int num2 = 15;
        System.out.println("Max - " + num1 + " Min - " + num2);
        boolean comparison = num1 == num2;
        if(comparison == true) {
            System.out.println("Число " + num1 + " равно числу " + num2);
        } else if(comparison == false) {
            System.out.println("Число " + num1 + " > числа " + num2);
        }

        System.out.println("\n3. Проверка числа");
        int num3 = 88;
        System.out.println("Проверка числа - " + num3);
        boolean b = num3 != 0;
        boolean isEvenNumber = num3 % 2 == 0;
        if(isEvenNumber == true) {
            System.out.println("Число " + num3 + " является четным");
        } else if(isEvenNumber == false) {
            System.out.println("Число " + num3 + " является нечетным");
        }
        boolean isPositiveNumber = num3 >= 0;
        if(isPositiveNumber == true) {
            System.out.println("Число " + num3 + " является положительным");
        } else if(isPositiveNumber == false) {
            System.out.println("Число " + num3 + " является отрицательным");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int num4 = 101;
        int num5 = 121;
        System.out.println("Исходные числа: первое число - " + num4 + ", второе число - " + num5);
        int hundred = num4 / 100;
        int hundred1 = num5 / 100;
        boolean digitMatch = hundred - hundred1 == 0;
        if(digitMatch == true) {
            System.out.println("Сотни исходных чисел: " + hundred + " = " + hundred1 + " равны");
        } else if(digitMatch == false) {
            System.out.println("Сотни исходных чисел: " + hundred + " и " + hundred1 + " не равны");
        }
        int ten = num4 % 100 / 10;
        int ten1 = num5 % 100 / 10;
        boolean digitMatch1 = ten - ten1 == 0;
        if(digitMatch1 == true) {
            System.out.println("Десятки исходных чисел: " + ten + " = " + ten1 + " равны");
        } else if(digitMatch1 == false) {
            System.out.println("Десятки исходных чисел: " + ten + " и " + ten1 + " не равны");
        }
        int unit = num4 % 10;
        int unit1 = num5 % 10;
        boolean digitMatch2 = unit - unit1 == 0;
        if(digitMatch2 == true) {
            System.out.println("Единицы исходных чисел: " + unit + " = " + unit1 + " равны");
        } else if(digitMatch2 == false) {
            System.out.println("Единицы исходных чисел: " + unit + " и " + unit1 + " не равны");
        }

        System.out.println("\n5. Определение символа по его коду");
        char ch = '\u0057';
        System.out.println("Символ кода " + (int) ch + " = " + ch);
        boolean isSmallLetter = ch =='w';
        if(isSmallLetter == true) {
            System.out.println(ch + "- маленькая буква");
        } else if(isSmallLetter == false) {
            System.out.println(ch + "- Большая буква");
        }
        boolean isNumber = ch =='1';
        if(isNumber == true) {
            System.out.println(ch + "- является числом");
        } else if(isNumber == false) {
            System.out.println(ch + "- не является числом");
        }
        boolean isDefinition = ch =='W';
        if(isDefinition == true) {
            System.out.println(ch + "- буква, а не число");
        } else if(isDefinition == false) {
            System.out.println(ch + "- число, а не буква");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        long deposit = 300_000;
        System.out.println("Сумма вклада = " + deposit + " рублей");
        if(deposit <= 100_000) {
            long income = deposit * 5 / 100;
            long totalDeposit = deposit + income;
            System.out.println("Начисленный процент 5%: " + income + " руб");
            System.out.println("Итоговая сумма с 5%: " + totalDeposit + " руб");
        } else if(deposit >= 100_000 && deposit <= 299_999) {
            long income1 = deposit * 7 / 100;
            long totalDeposit1 = deposit + income1;
            System.out.println("Начисленный процент 7%: " + income1 + " руб");
            System.out.println("Итоговая сумма с 7%: " + totalDeposit1 + " руб");
        } else if(deposit >= 300_000) {
            long income2 = deposit * 10 / 100;
            long totalDeposit2 = deposit + income2;
            System.out.println("Начисленный процент 10%: " + income2 + " руб");
            System.out.println("Итоговая сумма с 10%: " + totalDeposit2 + " руб");
        }

        System.out.println("\n7. Определение оценки по предметам");
        int history = 59;
        int scoreTwo = 2;
        int scoreThree = 3;
        int scoreFour = 4;
        int scoreFive = 5;
        if(history <= 60) {
            System.out.println("Балл по истории: " + history + " - Оценка " + scoreTwo);
        } else if(history >= 60 && history <= 73) {
            System.out.println("Балл по истории: " + history + " - Оценка " + scoreThree);
        } else if(history >= 73 && history <= 90) {
            System.out.println("Балл по истории: " + history + " - Оценка " + scoreFour);
        } else if(history >= 91) {
            System.out.println("Балл по истории: " + history + " - Оценка " + scoreFive);
        }
        int prog = 91;
        if(prog <= 60) {
            System.out.println("Балл по программированию: " + prog + " - Оценка " + scoreTwo);
        } else if(prog >= 60 && prog <= 73) {
            System.out.println("Балл по программированию: " + prog + " - Оценка "+ scoreThree);
        } else if(prog >= 73 && prog <= 90) {
            System.out.println("Балл по программированию: " + prog + " - Оценка " + scoreFour);
        } else if(prog >= 91) {
            System.out.println("Балл по программированию: " + prog + " - Оценка " + scoreFive);
        }
        float averageScore = (2 + 5) / 2f;
        System.out.println("Средняя оценка " + averageScore);
        int averagePercent = (history + prog) / 2;
        System.out.println("Средняя процент " + averagePercent);

        System.out.println("\n8. Расчет прибыли за год");
        long roomConsumption = 5_000;
        long revenue = 13_000;
        long costPrice = 9_000;
        long annualProfit = (revenue - costPrice - roomConsumption) * 12;
        System.out.println("Годовая прибыль = " + annualProfit);

        System.out.println("\n9. Подсчет количества банкнот");
        long sum = 567;
        System.out.println("Для выдачи " + sum + "$ необходимо:");
        int nominalHundred = 10;
        int nominalTen = 5;
        int nominalUnit = 50;

        long hundred2 = sum / 100;
        if(hundred2 <= nominalHundred) {
            System.out.println("Выдача банкнот номиналом 100 = " + hundred2 + " банкнот");
        } else if(hundred2 >= nominalHundred) {
            long supplement = (hundred2 - nominalHundred) * 10;
            System.out.print("Выдача банкнот номиналом 100 = " + nominalHundred + " банкнот");
            System.out.println("Выдача банкнот номиналом 10 = " + supplement + " банкнот");
        }
        long ten2 = sum % 100 / 10;
        if(ten2 <= nominalTen) {
            System.out.println("Выдача банкнот номиналом 10 = " + ten2 + " банкнот");
        } else if(ten2 >= nominalTen) {
            long supplement1 = (ten2 - nominalTen) * 10;
            System.out.print("Выдача банкнот номиналом 10 = " + nominalTen + " банкнот");
            System.out.println(" + выдача банкнот номиналом 1 = " + supplement1 + " банкнот");
        }
        long unit2 = sum % 10;
        if(unit2 <= nominalUnit) {
            System.out.println("Выдача банкнот номиналом 1 = " + unit2 + " банкнот");
        } else if(unit2 >= nominalUnit) {
            System.out.print("Банкнот не хватает для выдачи нужной суммы: " + sum);
        }
    }
}
