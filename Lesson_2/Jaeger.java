public class Jaeger {
    private String modelName = "Brancer Phoenix";
    private String mark = "Mark - 5";
    private String origin = "USA";
    private float height = 70.7f;
    private float weight = 2.1f;
    private int speed = 3;
    private int strenght = 8;
    private int armor = 9;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        if (modelName == "") {
            System.out.println("Пустая строка");
        } else {
            this.modelName = modelName;
        }
    }

    public boolean drift() {
        System.out.println("Вы вошли в дрифт");
        return true;
    }

    public void move() {
        System.out.println("Вы прошли 5 шагов");
    }

    public String scanKaiju() {
        return "nothing";
    }

    public void useVortexCannon() {
    }
}