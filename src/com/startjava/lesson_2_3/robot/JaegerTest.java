package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        System.out.println("\n1. [Выбор первого робота] ");
        jaegerOne.setModelName("Crimson Typhoon");
        System.out.println("Вы выбрали: " + jaegerOne.getModelName());
        jaegerOne.setMark("Mark-4");
        System.out.println("Модификация: " + jaegerOne.getMark());
        jaegerOne.setOrigin("China");
        System.out.println("Производство: " + jaegerOne.getOrigin());
        jaegerOne.setHeight(250.0f);
        System.out.println("Высота: " + jaegerOne.getHeight());
        jaegerOne.setWeight(1.722f);
        System.out.println("Масса: " + jaegerOne.getWeight());
        jaegerOne.setSpeed(9);
        System.out.println("Скорость: " + jaegerOne.getSpeed());
        jaegerOne.setStrenght(8);
        System.out.println("Сила: " + jaegerOne.getStrenght());
        jaegerOne.setArmor(6);
        System.out.println("Броня: " + jaegerOne.getArmor());
        jaegerOne.setWeapon("Plasmacaster I-22");
        System.out.println("Оружие: " + jaegerOne.getWeapon());
        jaegerOne.setSkill("Muay Thai");
        System.out.println("Искусство боя: " + jaegerOne.getSkill());

        System.out.println("\nИгра началась...");
        jaegerOne.drift();
        jaegerOne.move();
        jaegerOne.disguise();
        jaegerOne.scanKaiju();
        jaegerOne.thunderCloud();
        jaegerOne.jetKick();
        jaegerOne.killKaiju();

        Jaeger jaegerTwo = new Jaeger("Gipsy Danger", "Mark-3", "USA", 260.0f, 1.980f, 7, 8, 6,
                "Plasmacaster I-19", "Street Fighter");
        System.out.println("\n2. [Выбор второго робота] ");
        System.out.println("Вы выбрали: " + jaegerTwo.getModelName());
        System.out.println("Модификация: " + jaegerTwo.getMark());
        System.out.println("Производство: " + jaegerTwo.getOrigin());
        System.out.println("Высота: " + jaegerTwo.getHeight());
        System.out.println("Масса: " + jaegerTwo.getWeight());
        System.out.println("Скорость: " + jaegerTwo.getSpeed());
        System.out.println("Сила: " + jaegerTwo.getStrenght());
        System.out.println("Броня: " + jaegerTwo.getArmor());
        System.out.println("Оружие: " + jaegerTwo.getWeapon());
        System.out.println("Искусство боя: " + jaegerTwo.getSkill());

        System.out.println("\nИгра началась...");
        jaegerTwo.drift();
        jaegerTwo.move();
        jaegerTwo.disguise();
        jaegerTwo.scanKaiju();
        jaegerTwo.palmGrip();
        jaegerTwo.elbowRocket();
        jaegerTwo.killKaiju();
    }
}