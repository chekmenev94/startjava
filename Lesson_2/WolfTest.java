public class WolfTest {
    public static void main(String[] args) {

        Wolf tank = new Wolf();
        tank.gender = "Самец";
        tank.nickName = "Танк";
        tank.color = "Серый";
        tank.weight = 44.1f;
        tank.age = 5;

        System.out.println("Пол: " + tank.gender);
        System.out.println("Кличка: " + tank.nickName);
        System.out.println("Цвет: " + tank.color);
        System.out.println("Вес: " + tank.weight + " кг");
        System.out.println("Возраст: " + tank.age + " лет");

        tank.move();
        tank.sit();
        tank.run();
        tank.howl();
        tank.hunt();
    }
}