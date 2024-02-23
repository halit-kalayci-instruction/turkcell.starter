package org.example;


// Access Modifiers => Erişim Belirteçleri
public class Product
{
    // Constructor => CTOR
    // Hiç ctor tanımı yoksa,
    // no-argument ctor default olarak tanımlıdır.
    public Product() {
        System.out.println("Boş ctor çalıştı.");
    } // noargsCtor
    public Product(String name, double unitPrice, boolean onSale, double salePercentage)
    {
        // this. => classın genelini (kendisini) ifade eder.
        this.name=name;
        this.unitPrice= unitPrice;
        this.onSale = onSale;
        this.salePercentage= salePercentage;
    } // allArgsCtor
    public String name;
    public double unitPrice;
    public boolean onSale;
    public double salePercentage;

    public void buy()
    {
        System.out.println(name + " ürünü satıldı");
    }
}
