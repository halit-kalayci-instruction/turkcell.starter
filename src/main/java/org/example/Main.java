package org.example;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        // Programlama Konseptleri

        // n adet
        // 4 => 2+2 4+0 2x2 16/4

        // Variables - Değişkenler
        //type-safe
        String metin = "Merhaba, Turkcell";
        System.out.println(metin);
        metin="Merhaba, Turkcell 2";
        System.out.println(metin);

        int ogrenciSayisi=45;
        double ogrenciNotOrtalamasi=50.5;
        boolean dersBitti=false;


        // Value Type => Değer Tip
        int ogrenciSayisi2 = ogrenciSayisi; // değer ataması
        ogrenciSayisi2 = ogrenciSayisi2 + 10;
        System.out.println(ogrenciSayisi2);
        System.out.println(ogrenciSayisi);
        System.out.println("**********");
        // Set
        // Reference Type => Referans Tip
        int[] ogrenciNotlari = {45,50,55,60,65,70};
        int[] ogrenciNotlari2 = ogrenciNotlari;
        ogrenciNotlari2[0]=100;

        int[] ogrenciNotlari3 = {5,6,7,8};

        for (int i = 0; i < ogrenciNotlari.length; i++) {
            System.out.println(ogrenciNotlari[i]);
        }
        System.out.println(ogrenciNotlari);
        System.out.println(ogrenciNotlari2);
        System.out.println(ogrenciNotlari3);
        int not = 50;
        // If-else blokları tek bir scope çalıştırır!
        if(not < 50) // true
        {
            System.out.println("Geçti");
        }
        if (not == 50)
        {
            System.out.println("Sınırdan geçti..");
        }
        else
        {
            System.out.println("Kaldı");
        }

        // OOP
        // OOP Concepts
    }
}