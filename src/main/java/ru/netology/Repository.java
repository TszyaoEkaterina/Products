package ru.netology;

public class Repository {
    private Product[] products = new Product[0];
    public void setProducts(Product[] products) {
        this.products = products;
    }

    public void save(Product newProduct) {
        Product[] tmp = new Product[products.length + 1];
        System.arraycopy(products,0,tmp,0,products.length);
        tmp[tmp.length - 1] = newProduct;
        this.products = tmp;
    }

    public Product[] findAll() {
        return products;
    }

    public void removeById(int id) {
        Product[] tmp = new Product [products.length - 1];
        int index = 0;
        for (Product product:products) {
            if (product.getId() != id) {
                tmp[index] =product;
                index++;
            }
        }
        products= tmp;
    }
}
