package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {
    Repository repo = new Repository();
    Product first = new Product(1, "book", 111, "first");
    Product second = new Product(2, "book", 222, "second");
    Product third = new Product(3, "smartphone", 333, "third");
    Product forth = new Product(4, "smartphone", 444, "forth");

    @Test
    void findAllWithRepoEmpty() {
        Product[] actual = repo.findAll();
        Product[] expected = {};
        assertArrayEquals(actual, expected);
    }

    @Test
    void findAllWithRepoNotEmpty() {
        Product[] products = {first, second};
        repo.setProducts(products);
        Product[] actual = repo.findAll();
        Product[] expected = {first, second};
        assertArrayEquals(actual, expected);
    }

    @Test
    void shouldSaveWithRepoEmpty() {
        repo.save(first);
        Product[] actual = repo.findAll();
        Product[] expected = {first};
        assertArrayEquals(actual, expected);
    }

    @Test
    void shouldSaveWithRepoNotEmpty() {
        Product[] products = {first, second};
        repo.setProducts(products);
        repo.save(third);
        Product[] actual = repo.findAll();
        Product[] expected = {first, second, third};
        assertArrayEquals(actual, expected);
    }

    @Test
    void removeById() {
        Product[] products = {first, second, third, forth};
        repo.setProducts(products);
        repo.removeById(3);
        Product[] actual = repo.findAll();
        Product[] expected = {first, second, forth};
        assertArrayEquals(actual, expected);
    }
}