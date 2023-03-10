public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strenght;
    private int armor;
// Боевые характеристики оборудование система энерг.ядро оружие умение количество убитых
    // private String equipment;
    // private String opSystem;
    // private String energyCore;
    private String weapon;
    private String skill;
    // private String kaijuKilled;

// Присваивание данных
    public String getModelName() {
        return modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }
    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrenght() {
        return strenght;
    }
    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public int getArmor() {
        return armor;
    }
    public void setArmor(int armor) {
        this.armor = armor;
    }

    public String getWeapon() {
        return weapon;
    }
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getSkill() {
        return skill;
    }
    public void setSkill(String skill) {
        this.skill = skill;
    }
// конец присваивания данных

// конструктор
    public Jaeger(String modelName, String mark, String origin, float height, float weight, int speed, int strenght, int armor, String weapon, String skill) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strenght = strenght;
        this.armor = armor;
        this.weapon = weapon;
        this.skill = skill;
    }
// конец конструктора

    public boolean drift() {
        System.out.println("Вошли в дрифт. Робот активирован!");
        return true;
    }

    public void move() {
        System.out.println("Вы прошли 5 километров");
    }

    public void disguise() {
        System.out.println("Маскировка...");
    }

    public String scanKaiju() {
        System.out.println("Обнаружен Kaiju");
        return "nothing";
    }

// методы только для Crimson Typhoon
    public void thunderCloud() {
        System.out.println("Образование грозового облака!");
    }

    public void jetKick() {
        System.out.println("Реактивный удар!");
    }
// конец методов Crimson Typhoon

// методы только для Gipsy Danger
    public void palmGrip() {
        System.out.println("Захват!");
    }

    public void elbowRocket() {
        System.out.println("Ракета локтя!");
    }
// конец методов Gipsy Danger
    public void killKaiju() {
        System.out.println("Вы убили Kaiju!");
    }
}