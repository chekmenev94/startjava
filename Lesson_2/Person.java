public class Person {
    
    String gender = "Men";
    String name = "Aleks";
    float height = 1.82f;
    float weight = 85.7f;
    int age = 25;

    void move() {
        System.out.println("moving");
    }

    void sitDown() {
        System.out.println("sit");
    }

    void running() {
        System.out.println("run");
    }

    String talk() {
        return "Привет, как дела?";
    }

    String learnJava() {
        return "Я выучил еще одну главу!";
    }
}
