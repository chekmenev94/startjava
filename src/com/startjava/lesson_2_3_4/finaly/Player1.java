package com.startjava.lesson_2_3_4.finaly;

import java.util.Arrays;

public class Player1 {
    private final String name;
    private final int[] nums = new int[10];
    private int attempts = 0;

    public Player1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return nums[attempts-1];
    }

    public boolean addNum(int num) {
        if (num > 0 && num <= 100) {
            nums[attempts] = num;
            attempts++;
            return true;
        } else {
            System.out.println("Введенное значение не удовлетворяет условию ");
            return false;
        }
    }

    public int[] getNums() {
        return  Arrays.copyOf(nums, attempts);

    }
}