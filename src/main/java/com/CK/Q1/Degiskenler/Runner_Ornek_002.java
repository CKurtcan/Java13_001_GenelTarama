package com.CK.Q1.Degiskenler;

import java.util.Arrays;

public class Runner_Ornek_002 {
    public static void main(String[] args) {

        System.out.println("Referans Veri Tipleri");

        System.out.println("1-Class");
        Otomobil otomobil = new Otomobil("Mercedes",
                                         "AMG",
                                         1.6,
                                         "2021"); //sınıfın nesneye dönüşme işlemi

        System.out.println(otomobil.toString());

        System.out.println("2-Interface");
        System.out.println("IUlasimAraci interfacei oluşturuldu, içindeki method kullanarak" +
                " araçların hızları kendi verileri kullanılarak hesaplanabilir");

        System.out.println("3-Array");
        int[] sayilar = {1,2,3};
        System.out.println("Array türüne örnek, sayilar = " + Arrays.toString(sayilar));

    }
}
