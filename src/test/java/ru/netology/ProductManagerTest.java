package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {
    ProductManager manager = new ProductManager();
    Repository repo = new Repository();
    Book first = new Book(1, "book", 111, "bookName","Masha");
    Book second = new Book(2, "book", 222, "bookName","Tom");
    Smartphone third = new Smartphone(3, "smartphone", 333, "smartphoneName", "Apple");
    Smartphone forth = new Smartphone(4, "smartphone", 444, "smartphoneName", "Sony");

    @Test
    void shouldAddWithRepoEmpty() {
        manager.add(first);
        Product[] actual = manager.findAll();
        Product[] expected = {first};
        assertArrayEquals(actual, expected);
    }

    @Test
    void shouldAddWithRepoNotEmpty() {
        manager.add(first);
        manager.add(second);

        manager.add(third);
        Product[] actual = manager.findAll();
        Product[] expected = {first, second, third};
        assertArrayEquals(actual, expected);
    }

    @Test
    void searchByWhenNoProductMatchByName() {
        manager.add(first);
        manager.add(second);
        Product[] actual = manager.searchBy("smartphoneName");
        Product[] expected = {};
        assertArrayEquals(actual, expected);
    }

    @Test
    void searchByWhenOneProductMatchesByName() {
        manager.add(first);
        manager.add(second);
        manager.add(forth);
        Product[] actual = manager.searchBy("smartphoneName");
        Product[] expected = {forth};
        assertArrayEquals(actual, expected);
    }

    @Test
    void searchByWhenMoreProductsMatchByName() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(forth);
        Product[] actual = manager.searchBy("bookName");
        Product[] expected = {first,second};
        assertArrayEquals(actual, expected);
    }
    @Test
    void searchByWhenNoProductMatchByAuthor() {
        manager.add(first);
        manager.add(second);
        Product[] actual = manager.searchBy("Chris");
        Product[] expected = {};
        assertArrayEquals(actual, expected);
    }
    @Test
    void searchByWhenOneProductMatchesByAuthor() {
        manager.add(first);
        manager.add(second);
        manager.add(forth);
        Product[] actual = manager.searchBy("Tom");
        Product[] expected = {second};
        assertArrayEquals(actual, expected);
    }
    @Test
    void searchByWhenMoreProductsMatchByAuthor() {
        Book fifth = new Book(5,"book",555,"bookName","Masha");
        manager.add(first);
        manager.add(third);
        manager.add(fifth);
        Product[] actual = manager.searchBy("Masha");
        Product[] expected = {first,fifth};
        assertArrayEquals(actual, expected);
    }
    @Test
    void searchByWhenNoProductMatchByManufacturer() {
        manager.add(third);
        manager.add(forth);
        Product[] actual = manager.searchBy("Samsung");
        Product[] expected = {};
        assertArrayEquals(actual, expected);
    }
    @Test
    void searchByWhenOneProductMatchesByManufacturer() {
        manager.add(first);
        manager.add(third);
        manager.add(forth);
        Product[] actual = manager.searchBy("Apple");
        Product[] expected = {third};
        assertArrayEquals(actual, expected);
    }
    @Test
    void searchByWhenMoreProductsMatchByManufacturer() {
        Smartphone fifth = new Smartphone(5,"smartphone",555,"smartphoneName","Sony");
        manager.add(first);
        manager.add(third);
        manager.add(forth);
        manager.add(fifth);
        Product[] actual = manager.searchBy("Sony");
        Product[] expected = {forth,fifth};
        assertArrayEquals(actual, expected);
    }
}