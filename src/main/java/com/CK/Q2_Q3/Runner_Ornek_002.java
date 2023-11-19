package com.CK.Q2_Q3;

import java.util.Random;
import java.util.Scanner;

public class Runner_Ornek_002 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        Scanner sc = new Scanner(System.in);

        System.out.println("Finding biggest number in an array");
        int[] numArray = new int[3];

        System.out.println("Please enter 3 positive number");
        numArray[0] = sc.nextInt();
        numArray[1] = sc.nextInt();
        numArray[2] = sc.nextInt();

        int bigNum = numArray[0];

        if (numArray[1] > bigNum && numArray[1] > numArray[2])
            bigNum = numArray[2];
        else if (numArray[2] > bigNum && numArray[2] > numArray[1])
            bigNum = numArray[2];
        System.out.println("Biggest number in array is...: " +bigNum);

        long finishTime = System.nanoTime();
        long time = finishTime - startTime;

        System.out.println(time); // nano saniye
    }
}

