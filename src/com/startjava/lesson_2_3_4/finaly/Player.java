package com.startjava.lesson_2_3_4.finaly;

public class Player {
    private String name;
    private int[] num = new int[10];
    private int i;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num[i];
    }

    public void setNum(int num, int i) {
        this.i = i;
        this.num[i] = num;
    }

    public int[] getNumArr() {
        return num;
    }

    public void setNumArr(int[] num) {
        this.num = num;
    }
}