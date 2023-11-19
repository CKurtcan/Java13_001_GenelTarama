package com.CK.Q2_Q3;

import java.util.Scanner;

public class Runner_Ornek_003 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        System.out.println("Age Check");

        System.out.println("Please enter your age");
        int age = new Scanner(System.in).nextInt();

        if (age < 18)
            System.out.println("Child");
        else if (age <= 24)
            System.out.println("Teen");
        else if (age < 65)
            System.out.println("Adult");
        else
            System.out.println("Old");

        long finishTime = System.nanoTime();
        long time = finishTime - startTime;

        System.out.println(time); // nano saniye
    }
}
