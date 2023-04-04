package com.startjava.lesson_2_3_4.graduation;

import java.util.Arrays;
import java.util.Objects;

public class BookСase {
    private int numBooks;
    private final Book[] arrBook = new Book[10];
    private int numAvailableShelves;
    private int i = 0;

    public String toString() {
        return "В шкафу " + numBooks + " книга(и) и свободно " + numAvailableShelves + " полок" +
                "\n" + Arrays.toString(getArrBook());
    }

    public void addBook(Book book) {
        while(numBooks < this.arrBook.length) {
            if (arrBook[numBooks] == null) {
                this.arrBook[numBooks] = book;
                numBooks++;
                break;
            }
        }
        setNumAvailableShelves();
    }

    public Book[] getArrBook() {
        Book[] imput = new Book[numBooks];
        numBooks = 0;
        for (Book book : arrBook) {
            if (book != null) {
                imput[numBooks++] = book;
            }
        }
        return imput;
    }

    public Book findBook(String name) {
        while (i < arrBook.length) {
            if (Objects.equals(name, this.arrBook[i].getNameBook())) {
                break;
            }
            i++;
        }
        return arrBook[i];
    }

    public void deleteBook(String name) {
        while (i < arrBook.length) {
            if (Objects.equals(name, arrBook[i].getNameBook())) {
                arrBook[i] = null;
                break;
            }
            i++;
        }
        setNumAvailableShelves();
        setNumBooks();
    }

    public int getNumBooks() {
        return numBooks;
    }

    public int getNumAvailableShelves() {
        return numAvailableShelves;
    }

    public void clearShelf() {
        Arrays.fill(arrBook, null);
        setNumAvailableShelves();
        setNumBooks();
    }

    private void setNumAvailableShelves() {
        numAvailableShelves = 0;
        for (int i = 0; i < this.arrBook.length; i++) {
            if (arrBook[i] == null) {
                numAvailableShelves++;
            }
        }
    }

    private void setNumBooks() {
        numBooks = 0;
        for (int i = 0; i < arrBook.length; i++) {
            if (arrBook[i] != null) {
                numBooks++;
            }
        }
    }
}