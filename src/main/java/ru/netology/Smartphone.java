package ru.netology;

public class Smartphone extends Product{
    private String manufacturer;

    public Smartphone(int id, String productName, int price,String name, String manufacturer) {
        super(id, productName, price,name);
        this.manufacturer = manufacturer;
    }
}
