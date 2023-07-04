package com.booleanuk;

public class Book {
    String title;
    String author;
    double price;
    int year;
    String genre;
    boolean paperback;



    public Book(String title, String author, double price, int year, String genre, boolean paperback) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = year;
        this.genre = genre;
        this.paperback = paperback;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, double price, String genre) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.genre = genre;
    }

    public String toString() {
        String book = "";
        book += "Title: " + this.title + "\n";
        book += "Author: " + this.author + "\n";
        book += "Price: £" + this.price + "\n";
        book += "Year: " +  this.year + "\n";
        book += "Genre: " + this.genre + "\n";
        if (paperback) {
            book += "Paperback";
        } else {
            book += "Hardback";
        }
        return book;
    }
}
