package ru.netology;

public class Book extends Product{
    private String author;

    public Book(int id, String name, int price, String productName,String author) {
        super(id, name, price, productName);
    }
}
