package org.example;


// Access Modifiers => Erişim Belirteçleri
public class Product
{
    // Constructor => CTOR
    // Hiç ctor tanımı yoksa,
    // no-argument ctor default olarak tanımlıdır.

    public Product() {
    }

    public Product(String name, double unitPrice, boolean onSale, double salePercentage) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.onSale = onSale;
        this.salePercentage = salePercentage;
    }

    // Encapsulation
    private String name;
    private double unitPrice;
    private boolean onSale;
    private double salePercentage;

    // getter-setter methods
    // read-only write-only


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public boolean isOnSale() {
        return onSale;
    }

    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }

    public double getSalePercentage() {
        return salePercentage;
    }

    public void setSalePercentage(double salePercentage) {
        this.salePercentage = salePercentage;
    }

    public void buy()
    {
        System.out.println(name + " ürünü satıldı");
    }
}
