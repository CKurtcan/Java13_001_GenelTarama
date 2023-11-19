package com.CK.Q4;

import java.util.Scanner;

public class Runner_Ornek_002 {
    public static void main(String[] args) {
        System.out.println("Dışa Bağlı Durmları Ifade Etme");

        System.out.println("Select a food from the menu...:");
        System.out.println("1. Hamburger");
        System.out.println("2. Pizza");
        System.out.println("3. Salad");

        int selection = new Scanner(System.in).nextInt();

        double price = calculatePrice(selection);
        if (price != -1) {
            System.out.println("Price of food: " + price + " TL");
        } else {
            System.out.println("Invalid selection");
        }
    }

    public static double calculatePrice(int selection) {
        switch (selection) {
            case 1:
                return 20.0; // Hamburger priceı
            case 2:
                return 25.0; // Pizza priceı
            case 3:
                return 12.0; // Salata priceı
            default:
                return -1; // Geçersiz seçim durumu
        }
    }
}
