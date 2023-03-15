package com.startjava.lesson_2_3.person;

public class Person {
    
    String gender = "Men";
    String name = "Aleks";
    float height = 1.82f;
    float weight = 85.7f;
    int age = 25;

    void move() {
        System.out.println("moving");
    }

    void sit() {
        System.out.println("sit");
    }

    void run() {
        System.out.println("run");
    }

    String talk() {
        return "Привет, как дела?";
    }

    String learnJava() {
        return "Я выучил еще одну главу!";
    }
}
