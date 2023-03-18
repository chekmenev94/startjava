package com.startjava.lesson_2_3.guess;

public class Player {
    private String name;
    private int num = 1;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}