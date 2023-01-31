public class MyFirstApp {
    public static void main(String[] args) {
        System.out.print("Написано однажды, ");
        System.out.println("работает везде!");

        int num = 10;
        for(int i = 1; i < num; i++) {
            for(int j = num; j > i; j--) {
                System.out.print("-");
            }
            for(int j = 1; j< 2*i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int i1 = 0;
        while(i1 < 5) {
            int j1 = i1;
            while (j1 < 5) {
                System.out.print("#");
                j1++;
            }
            System.out.println();
            i1++;
        }



        int countLine = 5; //Скольк строк вывести
        int sizeMaxLine = 3; //Максимальное количество символов
        String symbol = "$"; //Символ, который выводим
        int countShowLines = 0; //Начальная строка
        boolean isIncrement = true; //Увеличивать или уменьшать значения

        do {
            if (isIncrement) {
                for (int i = 1; i <=sizeMaxLine; i++) {
                    String str = symbolEqualsOnNumber(symbol,i);
                    System.out.println(str);
                    countShowLines++;
                }
            } else if (!isIncrement) {
                for (int y = sizeMaxLine-1; y>0; y--){
                    String str = symbolEqualsOnNumber(symbol,y);
                    System.out.println(str);
                    countShowLines++;
                }
            }

            if (countShowLines == sizeMaxLine) {
                isIncrement = false;
            }
        }while (countShowLines != countLine);
    }

    public static String symbolEqualsOnNumber(String symbol,int count){
        String result="";
        while (count!=0){
            result=result+symbol;
            count--;
        }
        return result;
    }
}
    