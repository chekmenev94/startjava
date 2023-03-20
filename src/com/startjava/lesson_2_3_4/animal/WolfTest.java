package com.startjava.lesson_2_3_4.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf tank = new Wolf();
        tank.setGender("Самец");
        tank.setNickName("Танк");
        tank.setColor("Серый");
        tank.setWeight(44.1f);
        tank.setAge(5);

        System.out.println("Пол: " + tank.getGender());
        System.out.println("Кличка: " + tank.getNickName());
        System.out.println("Цвет: " + tank.getColor());
        System.out.println("Вес: " + tank.getWeight());
        System.out.println("Возраст: " + tank.getAge());

        tank.move();
        tank.sit();
        tank.run();
        tank.howl();
        tank.hunt();
    }
}