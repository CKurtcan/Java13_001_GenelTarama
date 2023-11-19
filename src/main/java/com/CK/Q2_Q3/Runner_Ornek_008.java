package com.CK.Q2_Q3;

import java.util.Scanner;

public class Runner_Ornek_008 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        System.out.println("Credit inquiry");

        System.out.println("Calculate your credit score");
        System.out.println("Did you get a credit before...: +500");
        System.out.println("Do you have a credit card...: +300");
        System.out.println("Is your salary more than 35.000...: +400");
        System.out.println("Do you have a property...: +800");

        System.out.println();


        System.out.println("Please enter your credit score you calculated");
        int creditScore = new Scanner(System.in).nextInt();

        if (creditScore < 699)
            System.out.println("You cant get a credit");
        else if (creditScore < 1099)
            System.out.println("You have a low chance to get credit");
        else if (creditScore < 1499)
            System.out.println("You may get a credit");
        else if (creditScore < 1699)
            System.out.println("You can get a credit");
        else
            System.out.println("You can get a credit");

        long finishTime = System.nanoTime();
        long time = finishTime - startTime;

        System.out.println(time); // nano saniye
    }
}
