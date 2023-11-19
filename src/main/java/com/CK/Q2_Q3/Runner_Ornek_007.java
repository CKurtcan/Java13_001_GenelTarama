package com.CK.Q2_Q3;

import java.util.Scanner;

public class Runner_Ornek_007 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        System.out.println("E-Shop");

        System.out.println("********************");
        System.out.println("**** CATEGORİES ****");
        System.out.println("********************");

        System.out.println("1- Electronic");
        System.out.println("2- Food");
        System.out.println("3- Clothing");

        System.out.print("Please enter category with assigned number...: ");
        int num = new Scanner(System.in).nextInt();
        System.out.println();

        if (num == 1)
            System.out.println("You are redirected to the electrical goods page");
        else if (num == 2)
            System.out.println("You are directed to the food page");
        else if (num == 3)
            System.out.println("You are redirected to the clothing page");
        else
            System.out.println("Please enter a valid value");

        long finishTime = System.nanoTime();
        long time = finishTime - startTime;

        System.out.println(time); // nano saniye
    }
}
