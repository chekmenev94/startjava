package com.startjava.lesson_2_3_4.graduation;

public class Book {
    private String author;
    private String nameBook;
    private int yearPublication;
    private String infoBook;

    public Book(String author, String nameBook, int yearPublication) {
        this.author = author;
        this.nameBook = nameBook;
        this.yearPublication = yearPublication;
    }

    public String toString() {
        return "| " + this.author + ", " + this.nameBook +", " + getYearPublication() + " |";
    }

    public String getNameBook() {
        return nameBook;
    }

    public int getYearPublication() {
        return yearPublication;
    }
}


