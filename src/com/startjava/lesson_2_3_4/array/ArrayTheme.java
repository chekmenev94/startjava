package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArr = {6, 4, 2, 7, 3, 5, 1};
        int len = intArr.length;
        System.out.println("Массив: ");
        outputIntArr(intArr);

        for(int i = 0; i < len / 2; i++) {
            int tmp = intArr[i];
            intArr[i] = intArr[--len];
            intArr[len] = tmp;
        }
        System.out.println("\nМассив после реверса: ");
        outputIntArr(intArr);

        System.out.println("\n\n2. Вывод произведения элементов массива");
        int[] multipliers = new int[10];
        len = multipliers.length;
        for(int i = 0; i < len; i++) {
            multipliers[i] = i;
        }
        int result = 1;
        for(int i = 1; i < len - 1; i++) {
            result *= multipliers[i];
            System.out.print(multipliers[i] + ((i < len - 2) ? " * " : " = "));
        }
        System.out.print(result);
        System.out.println("\nЗначение под индексом 0 = " + multipliers[0]
                + ", 9 = " + multipliers[len - 1]);

        System.out.println("\n3. Удаление элементов массива");
        double[] doubleArr = new double[15];
        len = doubleArr.length;
        for(int i = 0; i < len; i++) {
            doubleArr[i] = Math.random();
        }
        System.out.println("Исходный массив: ");
        outputArray(doubleArr);
        int middleIndex = len / 2;
        System.out.print("\nИндекс средней ячейки = " + middleIndex);
        int quantity = 0;
        for (int i = 0; i < len; i++) {
            if (doubleArr[i] > doubleArr[middleIndex]) {
                doubleArr[i] = 0;
                quantity++;
            }
        }
        System.out.println("\nИзмененный массив: ");
        outputArray(doubleArr);
        System.out.println("\nКоличество обнуленных ячеек = " + quantity);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] alphabet = new char[26];
        len = alphabet.length;
        for(int i = 0; i < len; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        for(int i = len - 1; i >= 0; i--) {
            for(int j = len - 1; j >= i; j--) {
                System.out.print( alphabet[j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        int[] uniqueNums = new int[30];
        len = uniqueNums.length;
        for(int i = 0; i < len; i++) {
            do {
                uniqueNums[i] = (int) (60 + Math.random() * 40);
            } while (check(uniqueNums, uniqueNums[i], i));
        }
        Arrays.sort(uniqueNums);
        int numElement = 0;
        for (int num : uniqueNums) {
            System.out.print(num + " ");
            numElement++;
            if (numElement == 10) {
                System.out.println();
                numElement = 0;
            }
        }

        System.out.println("\n6. Копирование не пустых строк");
        String[] srcStrings = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        len = 0;
        for (String srcString : srcStrings) {
            if (!srcString.isBlank()) len++;
        }
        String[] destStrings = new String[len];
        int indexCopy = 0;
        int indexStart = 0;
        while (indexCopy < srcStrings.length) {
            int indexSum = 0;
            if (srcStrings[indexCopy].isBlank()) {
                indexCopy++;
            } else {
                while (!srcStrings[indexCopy].isBlank()) {
                    indexSum++;
                    indexCopy++;
                }
                indexCopy -= indexSum;
                System.arraycopy(srcStrings, indexCopy, destStrings, indexStart, indexSum);
                indexStart += indexSum;
                indexCopy += indexSum;
            }
        }
        System.out.println("Исходный массив: ");
        System.out.println(Arrays.toString(srcStrings));
        System.out.println("Скопированный массив: ");
        System.out.println(Arrays.toString(destStrings));
    }

    public static void outputIntArr(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void outputArray(double[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.printf(" %.3f", arr[i]);
            if(i == 7) {
                System.out.println();
            }
        }
    }
    
    public static boolean check(int[] arr, int toCheckValue, int index) {
        boolean test = false;
        for (int i = 0; i < index; i++) {
            if (arr[i] == toCheckValue) {
                test = true;
                break;
            }
        }
        return test;
    }
}