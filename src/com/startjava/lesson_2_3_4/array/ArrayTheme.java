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
            len--;
            int tmp = intArr[i];
            intArr[i] = intArr[len];
            intArr[len] = tmp;
        }
        System.out.println("\nМассив после реверса: ");
        outputIntArr(intArr);

        System.out.println("\n\n2. Вывод произведения элементов массива");
        int[] multipliersArr = new int[10];
        len = multipliersArr.length;
        for(int i = 0; i < len; i++) {
            multipliersArr[i] = i;
        }
        int result = 1;
        for(int i = 1; i < len - 1; i++) {
            result *= multipliersArr[i];
            String operator = (i < len - 2) ? multipliersArr[i] + " * " : multipliersArr[i] + " = ";
            System.out.print(operator);
        }
        System.out.print(result);
        System.out.println("\nЗначение под индексом 0 = " + multipliersArr[0]
                    + ", 9 = " + multipliersArr[len - 1]);

        System.out.println("\n3. Удаление элементов массива");
        double[] numsArr1 = new double[15];
        len = numsArr1.length;
        for(int i = 0; i < len; i++) {
            numsArr1[i] = Math.random();
        }
        System.out.println("Исходный массив: ");
        outputArray(numsArr1);
        int middleIndex = len / 2;
        System.out.print("\nИндекс средней ячейки = " + middleIndex);
        int quantity = 0;
        for (int i = 0; i < len; i++) {
            if (numsArr1[i] > numsArr1[middleIndex]) {
                numsArr1[i] = 0;
                quantity++;
            }
        }
        System.out.println("\nИзмененный массив: ");
        outputArray(numsArr1);
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
        double[] uniqueNums = new double[30];
        len = uniqueNums.length;
        for(int i = 0; i < len; i++) {
            boolean test = true;
            while(test == true) {
                uniqueNums[i] = 60 + Math.random() * 40;
                uniqueNums[i] = (int)uniqueNums[i];
                test = check(uniqueNums, uniqueNums[i], i);
            }
        }
        Arrays.sort(uniqueNums);
        int cycle = 0;
        for (double num : uniqueNums) {
            System.out.print(num + " ");
            cycle++;
            if (cycle == 10) {
                System.out.println();
                cycle = 0;
            }
        }

        System.out.println("\n6. Копирование не пустых строк");
        String[] array = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        len = 0;
        String blank;
        for (int i = 0; i < array.length; i++) {
            blank = array[i];
            if (blank.isBlank() == false) {
                len++;
            }
        }
        String[] copyArray = new String[len];
        int indexArr = 0;
        for(int i = 0; i < len; i++) {
            while (indexArr < array.length) {
                if (array[indexArr].isBlank() == false) {
                    copyArray[i] = array[indexArr];
                    indexArr++;
                    break;
                } else {
                    indexArr++;
                }
            }
        }
        System.out.println("Исходный массив: ");
        System.out.println(Arrays.toString(array));
        System.out.println("Скопированный массив: ");
        System.out.println(Arrays.toString(copyArray));
    }

    public static void outputIntArr(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void outputArray(double[] arr) {
        double[] numArr = arr;
        for(int i = 0; i < numArr.length; i++) {
            System.out.printf(" %.3f", numArr[i]);
            if(i == 7) {
                System.out.println();
            }
        }
    }
    
    public static boolean check(double[] arr, double toCheckValue, int index) {
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