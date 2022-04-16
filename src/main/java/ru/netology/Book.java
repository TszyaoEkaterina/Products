package ru.netology;

public class Book extends Product {
    private String author;

    public Book(int id, String productName, int price, String name, String author) {
        super(id, productName, price, name);
    }
}

