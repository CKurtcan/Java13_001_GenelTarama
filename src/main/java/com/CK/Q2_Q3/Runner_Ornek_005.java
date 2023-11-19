package com.CK.Q2_Q3;

import java.util.Scanner;

public class Runner_Ornek_005 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        System.out.println("Number odd or even check");

        System.out.print("Please enter a number...: ");
        int num = new Scanner(System.in).nextInt();
        System.out.println();

        if (num % 2 == 0)
            System.out.println("Your number is odd");
        else
            System.out.println("Your number is even");
        long finishTime = System.nanoTime();
        long time = finishTime - startTime;

        System.out.println(time); // nano saniye
    }
}
