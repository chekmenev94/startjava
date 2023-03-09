public class JaegerTest {
    public static void main(String[] args) {

        Jaeger jaegerOne = new Jaeger();
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
        jaegerOne.setWeapon("Plasmacaster");
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

        String modelName = "Gipsy Danger";
        String mark = "Mark-3";
        JaegerNew jaegerTwo = new JaegerNew(modelName, mark);
    }
}