package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {
    ProductManager manager = new ProductManager();
    Repository repo = new Repository();
    Product first = new Product(1, "book", 111, "first");
    Product second = new Product(2, "book", 222, "second");
    Product third = new Product(3, "smartphone", 333, "third");
    Product forth = new Product(4, "smartphone", 444, "forth");
    @Test
    void shouldAddWithRepoEmpty() {
        manager.add(first);
        Product[] actual = manager.findAll();
        Product[] expected = {first};
        assertArrayEquals(actual,expected);
    }

    @Test
    void searchBy() {
    }
}