package com.startjava.lesson_2_3_4.graduation;

import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        int command;
        int i = 0;
        Scanner scan = new Scanner(System.in);
        BookСase oneCase = new BookСase();

        System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
        do {
            System.out.println("""
                    Меню :
                    1. Добавить книгу
                    2. Найти книгу
                    3. Удалить книгу
                    4. Показать шкаф (отобразить все книги)
                    5. Показать сколько книг в шкафу
                    6. Показать свободное количество полок
                    7. Очистить полку
                    """);
            command = scan.nextInt();
            switch (command) {
                case 1 -> {
                    System.out.println("1. Добавить книгу");
                    scan.nextLine();
                    System.out.println("Введите Автора");
                    String author = scan.nextLine();
                    System.out.println("Введите название книги");
                    String title = scan.nextLine();
                    System.out.println("Введите год издания");
                    int Publication = scan.nextInt();
                    if (i == 0) {
                        Book Book1 = new Book(author, title, Publication);
                        oneCase.addBook(Book1);
                    } else if (i == 1){
                        Book Book2 = new Book(author, title, Publication);
                        oneCase.addBook(Book2);
                    } else if (i == 2){
                        Book Book3 = new Book(author, title, Publication);
                        oneCase.addBook(Book3);
                    } else if (i == 3){
                        Book Book4 = new Book(author, title, Publication);
                        oneCase.addBook(Book4);
                    } else if (i == 4) {
                        Book Book5 = new Book(author, title, Publication);
                        oneCase.addBook(Book5);
                    } else if (i == 5) {
                        Book Book6 = new Book(author, title, Publication);
                        oneCase.addBook(Book6);
                    } else if (i == 6) {
                        Book Book7 = new Book(author, title, Publication);
                        oneCase.addBook(Book7);
                    } else if (i == 7) {
                        Book Book8 = new Book(author, title, Publication);
                        oneCase.addBook(Book8);
                    } else if (i == 8) {
                        Book Book9 = new Book(author, title, Publication);
                        oneCase.addBook(Book9);
                    } else if (i == 9) {
                        Book Book10 = new Book(author, title, Publication);
                        oneCase.addBook(Book10);
                    }
                    i++;
                }
                case 2 -> {
                    System.out.println("2. Найти книгу");
                    if (i == 0) {
                        System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
                    } else {
                        scan.nextLine();
                        System.out.println(oneCase.findBook(scan.nextLine()));
                    }
                }
                case 3 -> {
                    System.out.println("3. Удалить книгу");
                    scan.nextLine();
                    oneCase.deleteBook(scan.nextLine());
                }
                case 4 -> {
                    if (i == 0) {
                        System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
                    } else {
                        System.out.println("4. Показать шкаф (отобразить все книги)");
                        System.out.println(oneCase);
                    }
                }
                case 5 -> {
                    System.out.println("5. Показать сколько книг в шкафу");
                    if (i == 0) {
                        System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
                    } else {
                        System.out.println("В шкафу " + oneCase.getNumBooks() + " книг");
                    }
                }
                case 6 -> {
                    System.out.println("6. Показать свободное количество полок");
                    System.out.println("В шкафу " + oneCase.getNumAvailableShelves() + " пустых полок");
                }
                case 7 -> {
                    System.out.println("7. Очистить полку");
                    oneCase.clearShelf();
                }
                default -> System.out.println("Некорректно ввели ");
            }
            System.out.println("Для продолжения работы нажмите Enter");
            scan.nextLine();
            String keyPressed = scan.nextLine();
             if (!keyPressed.isEmpty()) break;
            System.out.println(oneCase);
        } while(true);
    }
}
