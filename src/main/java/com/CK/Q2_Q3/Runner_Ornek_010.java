package com.CK.Q2_Q3;

import java.util.Scanner;

public class Runner_Ornek_010 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        Scanner sc = new Scanner(System.in);

        System.out.println("Determining Triangle Type");

        System.out.println("Please enter the side lengths of the triangle");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println("Equilateral triangle");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles triangle.");
        } else {
            System.out.println("Scalene triangle.");

        }
        long finishTime = System.nanoTime();
        long time = finishTime - startTime;

        System.out.println(time); // nano saniye
    }
}
