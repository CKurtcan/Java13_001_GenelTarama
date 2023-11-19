package com.CK.Q2_Q3;

import java.util.Scanner;

public class Runner_Ornek_004 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        System.out.println("Letter Grade");

        System.out.print("Please enter your exam grade...: ");
        int  grade = new Scanner(System.in).nextInt();
        System.out.println();

        if (grade < 40 )
            System.out.println("You failed exam");
        else if (grade <= 44)
            System.out.println("Your exam letter garde is...: E");
        else if (grade <= 49)
            System.out.println("Your exam letter garde is...: D");
        else if (grade <= 54)
            System.out.println("Your exam letter garde is...: C");
        else if (grade <= 59)
            System.out.println("Your exam letter garde is...: C+");
        else if (grade <= 64)
            System.out.println("Your exam letter garde is...: B");
        else if (grade <= 69)
            System.out.println("Your exam letter garde is...: B+");
        else if (grade <= 79)
            System.out.println("Your exam letter garde is...: A");
        else
            System.out.println("Your exam letter garde is...: A+");

        long finishTime = System.nanoTime();
        long time = finishTime - startTime;

        System.out.println(time); // nano saniye
    }
}
