package ru.netology;

public class Smartphone extends Product{
    private String manufacturer;
    public Smartphone(int id, String productName, int price,String name, String manufacturer) {
        super(id, productName, price,name);
        this.manufacturer = manufacturer;
    }
    @Override
    public boolean matches(String search) {
        if (super.matches(search)) { // вызов метода matches в версии описанной в Product
            return true;
        } else {
            if (manufacturer.equals(search)) {
                return true;
            } else return false;
        }
    }

}
