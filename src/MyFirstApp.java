public class MyFirstApp {
    public static void main(String[] args) {
        System.out.print("Написано однажды, ");
        System.out.println("работает везде!");

        int i = 3;
        int i1 = 3;
        do {
            for(int j = i; j <=3; j++) {
                System.out.print("$");
            }
            System.out.println();
            i--;
        }while(i > 0);
        do {
            for(int j1 = i1-1; j1 > 0; j1--) {
                System.out.print("$");
            }
            System.out.println();
            i1--;
        }while(i1 > 0);
    }
}
