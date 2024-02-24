package org.example.dependencyinjection;

public class Main {
    public static void main(String[] args) {
        // IoC
        ProductRepository productRepository = new MongoDbProductRepository();
        ProductRepository productRepository1 = new MySqlProductRepository();

        // Loose-coupling
        ProductService productService = new ProductServiceImpl(productRepository); // mysql
        productService.add();

        ProductService productService1 = new ProductServiceImpl(productRepository1); // mongodb
        productService1.add();
    }
}
