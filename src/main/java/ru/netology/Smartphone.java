package ru.netology;

public class Smartphone extends Product{
    private String manufacturer;

    public Smartphone(int id, String name, int price, String productName,String manufacturer) {
        super(id, name, price, productName);
    }
}
