package ru.netology;

public class ProductManager {
    private Repository repo = new Repository();
    private Product product = new Product();
    public ProductManager() {}
    public Product[] findAll() {
        return repo.findAll();
    }

    public void add(Product newProduct) {
        repo.save(newProduct);
    }

    public Product[] searchBy(String text) {
        Product[] results = new Product[0]; // тут будем хранить подошедшие запросу продукты
        for (Product product : repo.findAll()) {
            if (product.matches(text)) {
                Product[] tmp = new Product[results.length + 1];
                System.arraycopy(results, 0, tmp, 0, results.length);
                tmp[tmp.length - 1] = product;
                results = tmp;
            }
        }
        return results;
    }
    // метод определения соответствия товара product запросу search
    //public boolean matches(Product product, String search) {
    //    if (product.getName().contains(search)) {
    //        return true;
    //    } else {
    //        return false;
    //    }
    //}
}
