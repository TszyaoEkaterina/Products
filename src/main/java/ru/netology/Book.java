package ru.netology;

public class Book extends Product {
    private String author;
    public Book(int id, String productName, int price, String name, String author) {
        super(id, productName, price, name);
        this.author = author;
    }
    @Override
    public boolean matches(String search) {
        if (super.matches(search)) { // вызов метода matches в версии описанной в Product
            return true;
        } else {
            if (author.equals(search)) {
                return true;
            } else return false;
        }
    }
}
