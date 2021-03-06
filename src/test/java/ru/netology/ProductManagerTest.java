package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {
    ProductManager manager = new ProductManager();
    Repository repo = new Repository();
    Book first = new Book(1, "book", 111, "bookName","Masha");
    Book second = new Book(2, "book", 222, "bookName","Tom");
    Smartphone third = new Smartphone(3, "smartphone", 333, "smartphoneName", "apple");
    Smartphone forth = new Smartphone(4, "smartphone", 444, "smartphoneName", "sony");


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
    void searchByWhenNoProductMatch() {
        manager.add(first);
        manager.add(second);
        Product[] actual = manager.searchBy("smartphone");
        Product[] expected = {};
        assertArrayEquals(actual, expected);
    }

    @Test
    void searchByWhenOneProductMatches() {
        manager.add(first);
        manager.add(second);
        manager.add(forth);
        Product[] actual = manager.searchBy("smartphone");
        Product[] expected = {forth};
        assertArrayEquals(actual, expected);
    }

    @Test
    void searchByWhenMoreProductsMatch() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(forth);
        Product[] actual = manager.searchBy("smartphone");
        Product[] expected = {third, forth};
        assertArrayEquals(actual, expected);
    }
}