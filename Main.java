public class Main {
    public static void main (String [] args) {
        int sum = 1 + 2;
        boolean isEvenNumber = sum % 2 == 0;
        if(isEvenNumber == true) {
            System.out.println("Число " + sum + " является четным");
        } else if(isEvenNumber == false) {
            System.out.println("Число " + sum + " является нечетным");
        }
    }
}
