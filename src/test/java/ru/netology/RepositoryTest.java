package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {
    Repository repo = new Repository();
    Book first = new Book(1, "book", 111, "first","Masha");
    Book second = new Book(2, "book", 222, "second","Tom");
    Smartphone third = new Smartphone(3, "smartphone", 333, "third", "apple");
    Smartphone forth = new Smartphone(4, "smartphone", 444, "forth", "sony");

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