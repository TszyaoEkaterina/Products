package ru.netology;

public class Product {
    private int id;
    private String name;
    private int price;
    private String productName;

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Product(int id, String name, int price, String productName) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.productName = productName;
    }
}
