package com.CK.Q2_Q3;

import java.util.Scanner;

public class Runner_Ornek_001 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        System.out.println("Number sign check");

        System.out.println("Please write a number");
        int num = new Scanner(System.in).nextInt();

        if (num > 0)
            System.out.println("Positive number");
        else if (num < 0)
            System.out.println("Negative number");
        else
            System.out.println("Your number is 0 its unsigned number ");

        long finishTime = System.nanoTime();
        long time = finishTime - startTime;

        System.out.println(time); // nano saniye

    }
}
