package ru.netology;

public class Product {
    private int id;
    private String name;
    private int price;
    private String productName;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public Product() {
    }
    public Product(int id, String name, int price, String productName) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.productName = productName;
    }
}
