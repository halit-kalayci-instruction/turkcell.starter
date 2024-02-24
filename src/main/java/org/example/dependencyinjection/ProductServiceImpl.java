package org.example.dependencyinjection;

import org.example.logging.BaseLogger;
import org.example.logging.Logger;

public class ProductServiceImpl implements ProductService{
    ProductRepository productRepository;
    BaseLogger logger;
    // CTOR
    public ProductServiceImpl(ProductRepository productRepository, BaseLogger logger) {
        this.productRepository = productRepository;
        this.logger=logger;
    }

    @Override
    public void add() {
        // Repository nesnesi? // Bağımlılık
        System.out.println("Service işlemleri bitti, repository işlemleri başlıyor..");
        productRepository.addToDb();
        logger.logMessage("Add işlemi loglandı");
    }

    @Override
    public void update() {
        productRepository.addToDb();
    }
}
