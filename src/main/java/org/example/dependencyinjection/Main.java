package org.example.dependencyinjection;

import org.example.logging.BaseLogger;
import org.example.logging.DatabaseLogger;
import org.example.logging.FileLogger;
import org.example.logging.Logger;

public class Main {
    public static void main(String[] args) {
        // IoC
        ProductRepository productRepository = new MongoDbProductRepository();
        ProductRepository productRepository1 = new MySqlProductRepository();

        BaseLogger fileLogger = new FileLogger();
        BaseLogger dbLogger = new DatabaseLogger();

        // Loose-coupling
        ProductService productService = new ProductServiceImpl(productRepository,fileLogger); // mysql
        productService.add();

        ProductService productService1 = new ProductServiceImpl(productRepository1, dbLogger); // mongodb
        productService1.add();
    }
}
