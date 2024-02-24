package org.example.dependencyinjection;

public class ProductServiceImpl implements ProductService{
    ProductRepository productRepository;
    // CTOR
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void add() {
        // Repository nesnesi? // Bağımlılık
        System.out.println("Service işlemleri bitti, repository işlemleri başlıyor..");
        productRepository.addToDb();
    }

    @Override
    public void update() {
        productRepository.addToDb();
    }
}
