package com.booleanuk;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("The Lord of the Rings", "JRR Tolkien", 11.99, 1954, "Fantasy", false);

        Book book1 = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 6.98, 1998, "Fantasy", true);

        Book book2 = new Book("A Game of Thrones: Book 1 of a Song of Ice and Fire", " George R. R. Martin", 15.03, 2011, "Fantasy", true);

        System.out.println(book);
        System.out.println(book1);
        System.out.println(book2);
    }
}