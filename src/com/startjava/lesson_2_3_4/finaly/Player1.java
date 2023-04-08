package com.startjava.lesson_2_3_4.finaly;

public class Player1 {
    private String name;
    private int[] nums = new int[10];
    private int i;

    public Player1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return nums[i];
    }

    public void addNum(int num, int i) {
        if (num > 0 && num <= 100) {
            nums[i] = num;
            this.i = i;
        } else {
            System.out.println("Введенное значение не удовлетворяет условию ");
            throw new RuntimeException();
        }
    }

    public int[] getNums() {
        return nums;
    }

    public void setNumsArr(int[] nums) {
        this.nums = nums;
    }
}