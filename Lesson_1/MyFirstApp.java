public class MyFirstApp {
    public static void main(String[] args) {
        for (int i7 = 1; i7 < 10; i7++) {
            for (int j5 = 1; j5 < 10; j5++) {
                if (j5 == 2) {
                    System.out.printf( "|" +  "%3d", i7 * j5);
                } else {
                    System.out.printf("%3d", i7 * j5);
                }
            }
            System.out.println();
            if (i7 == 1) {
                for (int j = 1; j < 10; j++) {
                    if (j == 2) {
                        System.out.printf( "|" +  "%3s", "-");
                    } else {
                        System.out.printf("%3s", "-");
                    }
                }
                System.out.println();
            }
        }
    }
}