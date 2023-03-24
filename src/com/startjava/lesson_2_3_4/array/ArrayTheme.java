package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArr = {6, 4, 2, 7, 3, 5, 1};
        int len = intArr.length;
        System.out.println("Массив: ");
        for (int num : intArr) {
            System.out.print(num + " ");
        }
        for(int i = 0; i < len / 2; i++) {
            int tmp = intArr[i];
            intArr[i] = intArr[len - 1 - i];
            intArr[len - 1 - i] = tmp;
        }
        System.out.println("\nМассив после реверса: ");
        for (int num : intArr) {
            System.out.print(num + " ");
        }

        System.out.println("\n\n2. Вывод произведения элементов массива");
        int[] numsArr = new int[10];
        len = numsArr.length;
        for(int i = 0; i < len; i++) {
            numsArr[i] = i;
        }
        int result1 = 1;
        for(int i = 1; i < len - 1; i++) {
            result1 *= numsArr[i];
            String operator = (i < 8) ? " * " : " = ";
            System.out.print(numsArr[i] + operator);
        }
        System.out.print(result1);
        System.out.println("\nЗначение под индексом 0 = " + numsArr[0] + ", 9 = " + numsArr[9]);

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
        char[]  alphabet = new char[26];
        int index = 0;
        len = alphabet.length;
        for(char ch = 'A'; ch <= 'Z'; ch++) {
             alphabet[index++] = ch;
        }
        for(int i = len - 1; i >= 0; i--) {
            for(int j = len - 1; j >= i; j--) {
                System.out.print( alphabet[j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        double[] uniqueNumsArr = new double[30];
        len = uniqueNumsArr.length;
        for(int i = 0; i < len; i++) {
            uniqueNumsArr[i] = 60 + Math.random() * 40;
        }
        Arrays.sort(uniqueNumsArr);
        int cycle = 0;
        for (double num : uniqueNumsArr) {
            System.out.printf(" %.3f", num);
            cycle++;
            if (cycle == 10) {
                System.out.println();
                cycle = 0;
            }
        }

        System.out.println("\n6. Копирование не пустых строк");
        String[] array = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        String[] copyArray1 = Arrays.copyOfRange(array, 1, 2);
        String[] copyArray2 = Arrays.copyOfRange(array, 3, 6);
        String[] copyArray3 = Arrays.copyOfRange(array, 7, 10);

        String[] copyArray4 = concatArray(copyArray1, copyArray2);
        String[] copyArray5 = concatArray(copyArray4, copyArray3);

        System.out.println("Исходный массив: ");
        System.out.println(Arrays.toString(array));
        System.out.println("Скопированный массив: ");
        System.out.println(Arrays.toString(copyArray5));
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
    
    public static String[] concatArray(String[] a, String[] b) {
        String[] r = new String[a.length + b.length];
        System.arraycopy(a, 0, r, 0, a.length);
        System.arraycopy(b, 0, r, a.length, b.length);
        return r;
    }
}