package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {

        System.out.println("1. Реверс значений массива");
        int[] nums = {6, 4, 2, 7, 3, 5, 1};
        System.out.println("Массив: ");
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        for(int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }
        System.out.println("\nМассив после реверса: ");
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println("\n\n2. Вывод произведения элементов массива");
        int[] nums1 = new int[10];
        for(int i = 0; i < nums1.length; i++) {
            nums1[i] = i;
        }
        int result1 = 1;
        int result2 = 1;
        for(int i = 0; i < nums1.length; i++) {
            if (i > 0 && i < 9) {
                result1 *= nums1[i];
            } else {
                result2 *= nums1[i];
            }
        }
        String answer = result1 > 0 ? "1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 = " : "0 * 9 = ";
        System.out.println(answer + "" + result1);
        answer = result2 > 0 ? "1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 = " : "0 * 9 = ";
        System.out.println(answer + "" + result2);

        System.out.println("\n3. Удаление элементов массива");
        double[] nums2 = new double[15];
        double sum = 0;
        for(int i = 0; i < nums2.length; i++) {
            nums2[i] = Math.random();
            sum += nums2[i];
        }
        double averageNum = sum / nums2.length;
        System.out.println("Исходный массив: ");
        for(int i = 0; i < nums2.length; i++) {
            System.out.printf(" %.3f", nums2[i]);
            if(i == 7) {
                System.out.println("");
            }
        }
        System.out.printf("\nСреднее значение = %.3f", averageNum);
        int quantity = 0;
        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] > averageNum) {
                nums2[i] = 0;
                quantity++;
            }
        }
        System.out.println("\nИзмененный массив: ");
        for(int i = 0; i < nums2.length; i++) {
            System.out.printf(" %.3f", nums2[i]);
            if(i == 7) {
                System.out.println("");
            }
        }
        System.out.println("\nКоличество обнуленных ячеек = " + quantity);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] letters = new char[26];
        int index = 0;
        for(char ch = 'Z'; ch >= 'A'; ch--) {
            letters[index++] = ch;
        }
        for(int i = 0; i < letters.length; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(letters[j]);
            }
            System.out.println("");
        }

        System.out.println("\n5. Генерация уникальных чисел");
        double[] numsArr = new double[30];
        for(int i = 0; i < numsArr.length; i++) {
            numsArr[i] = 60 + Math.random() * 40;
        }
        Arrays.sort(numsArr);
        int cycle = 0;
        for (int i = 0; i < numsArr.length; i++) {
            System.out.printf(" %.2f", numsArr[i]);
            cycle ++;
            if(cycle == 10) {
                System.out.println("");
                cycle = 0;
            }
        }
    }
}