package com.startjava.lesson_2_3_4.finaly;

import java.util.Scanner;
public class Player1 {
    private String name;
    private int[] num = new int[10];
    private int i;

    public Player1(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num[i];
    }

    public void setNum(int num, int i) {
        Scanner scan1 = new Scanner(System.in);
        this.num[i] = num;
        this.i = i;
        while(true) {
            if (this.num[i] > 0 && this.num[i] <= 100) {
                break;
            } else {
                System.out.println("Введенное значение не удовлетворяет условию ");
                this.num[i] = scan1.nextInt();
            }
        }
    }

    public int[] getNumArr() {
        return num;
    }

    public void setNumArr(int[] num) {
        this.num = num;
    }
}