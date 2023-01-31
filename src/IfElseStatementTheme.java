public class IfElseStatementTheme {
    public static void main (String [] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 28;
        if(age > 20) {
            System.out.println("Мой возраст " + age + " больше 20");
        } else if(age < 20) {
            System.out.println("Мой возраст " + age + " меньше 20");
        }

        int sex = 1; // 1 - значение мужского пола, 0 - значение женского
        if(sex == 1) {
            System.out.println("Мужчина - защитник родины");
        } else {
            System.out.println("Женщина - хранительница домашнего очага");
        }

        float height = 1.72f; // мой рост 172 см
        if(height > 1.80) {
            System.out.println("Мой рост - " + height + " > 1.80");
        } else if(height < 1.80) {
            System.out.println("Мой рост - " + height + " < 1.80");
        }

        char firstLetter = "Ivan".charAt(0);
        if(firstLetter == 'M') {
            System.out.println("В Имени Mikhail - первая буква " + firstLetter);
        } else if(firstLetter == 'I') {
            System.out.println("В Имени Ivan - первая буква " + firstLetter);
        }

        System.out.println("\n2. Поиск max и min числа");
        int num1 = 120;
        int num2 = 15;
        if(num1 == num2) {
            System.out.println("Число " + num1 + " равно числу " + num2);
        } else if(num1 > num2) {
            System.out.println("Число " + num1 + " > числа " + num2);
            System.out.println("Max - " + num1 + " Min - " + num2);
        } else if(num1 < num2) {
            System.out.println("Число " + num1 + " < числа " + num2);
            System.out.println("Max - " + num2 + " Min - " + num1);
        }

        System.out.println("\n3. Проверка числа");
        int num3 = 88;
        System.out.println("Проверка числа - " + num3);
        if(num3 % 2 == 0) {
            System.out.println("Число " + num3 + " является четным");
        } else {
            System.out.println("Число " + num3 + " является нечетным");
        } if(num3 > 0) {
            System.out.println("Число " + num3 + " является положительным");
        } else {
            System.out.println("Число " + num3 + " является отрицательным");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int num4 = 101;
        int num5 = 121;
        System.out.println("Исходные числа: первое число - " + num4 + ", второе число - " + num5);
        int hundred = num4 / 100;
        int hundred1 = num5 / 100;
        if(hundred == hundred1) {
            System.out.println("Сотни исходных чисел: " + hundred + " = " + hundred1 + " равны");
        } else {
            System.out.println("Сотни исходных чисел: " + hundred + " и " + hundred1 + " не равны");
        }
        int ten = num4 % 100 / 10;
        int ten1 = num5 % 100 / 10;
        if(ten == ten1) {
            System.out.println("Десятки исходных чисел: " + ten + " = " + ten1 + " равны");
        } else {
            System.out.println("Десятки исходных чисел: " + ten + " и " + ten1 + " не равны");
        }
        int ones = num4 % 10;
        int ones1 = num5 % 10;
        if(ones == ones1) {
            System.out.println("Единицы исходных чисел: " + ones + " = " + ones1 + " равны");
        } else {
            System.out.println("Единицы исходных чисел: " + ones + " и " + ones1 + " не равны");
        }
        if(hundred != hundred1 && ten != ten1 && ones != ones1) {
            System.out.println("Равных цифр в числах нет");
        }

        System.out.println("\n5. Определение символа по его коду");
        char ch = '\u0057';
        System.out.println("Символ кода " + (int) ch + " = " + ch);
        if(ch == 'w') {
            System.out.println(ch + "- маленькая буква");
        } else if(ch == 'W') {
            System.out.println(ch + "- Большая буква");
        } else if(ch == '1') {
            System.out.println(ch + "- является числом");
        } else {
            System.out.println(ch + "- не буква, и не число");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        long deposit = 300_000;
        long income = 0;
        long totalDeposit = 0;
        System.out.println("Сумма вклада = " + deposit + " рублей");
        if(deposit <= 100_000) {
            income = deposit * 5 / 100;
        } else if(deposit >= 100_000 && deposit < 300_000) {
            income = deposit * 7 / 100;
        } else if(deposit >= 300_000) {
            income = deposit * 10 / 100;
        }
        totalDeposit = deposit + income;
        System.out.println("Начисленный процент: " + income + " руб");
        System.out.println("Итоговая сумма с %: " + totalDeposit + " руб");
        

        System.out.println("\n7. Определение оценки по предметам");
        int percentHistory = 59;
        int percentProg = 91;
        int scoreHistory = 0;
        int scoreProg = 0;

        if(percentHistory <= 60) {
            scoreHistory = 2;
        } else if(percentHistory >= 60 && percentHistory <= 73) {
            scoreHistory = 3;
        } else if(percentHistory >= 73 && percentHistory < 91) {
            scoreHistory = 4;
        } else if(percentHistory >= 91) {
            scoreHistory = 5;
        }
        System.out.println(scoreHistory + " - оценка по Истории");

        if(percentProg <= 60) {
            scoreProg = 2;
        } else if(percentProg >= 60 && percentProg <= 73) {
            scoreProg = 3;
        } else if(percentProg >= 73 && percentProg < 91) {
            scoreProg = 4;
        } else if(percentProg >= 91) {
            scoreProg = 5;
        }
        System.out.println(scoreProg + " - оценка по Программированию");
        float averageScore = (scoreHistory + scoreProg) / 2f;
        System.out.println("Средняя оценка " + averageScore);
        int averagePercent = (percentHistory + percentProg) / 2;
        System.out.println("Средний процент " + averagePercent);

        System.out.println("\n8. Расчет прибыли за год");
        long roomConsumption = 5_000;
        long revenue = 13_000;
        long costPrice = 9_000;
        long annualProfit = (revenue - costPrice - roomConsumption) * 12;
        if(annualProfit > 0) {
            System.out.println("Годовая прибыль = +" + annualProfit);
        } else {
            System.out.println("Годовая прибыль = " + annualProfit);
        }

        System.out.println("\n9. Подсчет количества банкнот");
        long sum = 567;
        System.out.println("Для выдачи " + sum + "$ необходимо:");
        int nominalHundred = 10;
        int nominalTen = 5;
        int nominalUnit = 50;

        long hundred2 = sum / 100;
        if(hundred2 <= nominalHundred) {
            System.out.println("Выдача банкнот номиналом 100 = " + hundred2 + " банкнот");
        } else {
            long supplement = (hundred2 - nominalHundred) * 10;
            System.out.print("Выдача банкнот номиналом 100 = " + nominalHundred + " банкнот");
            System.out.println("Выдача банкнот номиналом 10 = " + supplement + " банкнот");
        }
        long ten2 = sum % 100 / 10;
        if(ten2 <= nominalTen) {
            System.out.println("Выдача банкнот номиналом 10 = " + ten2 + " банкнот");
        } else {
            long supplement1 = (ten2 - nominalTen) * 10;
            System.out.print("Выдача банкнот номиналом 10 = " + nominalTen + " банкнот");
            System.out.println(" + выдача банкнот номиналом 1 = " + supplement1 + " банкнот");
        }
        long unit2 = sum % 10;
        if(unit2 <= nominalUnit) {
            System.out.println("Выдача банкнот номиналом 1 = " + unit2 + " банкнот");
        } else {
            System.out.print("Банкнот не хватает для выдачи нужной суммы: " + sum);
        }
    }
}
