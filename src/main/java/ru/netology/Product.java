package ru.netology;

public class Product {
    private int id;
    private String productName;
    private int price;
    private String name;

    public int getId() {
        return id;
    }
    public Product(int id, String productName, int price, String name) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.name = name;
    }
    public Product() {}
    public boolean matches(String search) {
        if (name.contains(search)) {
            return true;
        } else {
            return false;
        }
    }
}
