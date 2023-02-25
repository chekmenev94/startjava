public class MyFirstApp {
    public static void main(String[] args) {
        for (int i7 = 1; i7 < 10; i7++) {
            if (i7 == 1) {
                System.out.println("  1|  2  3  4  5  6  7  8  9");
                System.out.print("  -|------------------------");
            } else {
                for (int j5 = 1; j5 < 10; j5++) {
                    if (j5 == 2) {
                        System.out.printf( "|" +  "%3d", i7 * j5);
                    } else {
                        System.out.printf("%3d", i7 * j5);
                    }
                }
            }
            System.out.println();
        }
    }
}