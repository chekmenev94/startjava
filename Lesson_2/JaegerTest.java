public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setModelName("Bern");
        System.out.println(jaegerOne.getModelName());
        jaegerOne.move();
        System.out.println(jaegerOne.drift());
        System.out.println(jaegerOne.scanKaiju());
    }
}