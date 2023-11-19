package com.CK.Q2_Q3;

import java.util.Scanner;

public class Runner_Ornek_009 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        System.out.println("Calculating the money to be paid");

        double interestRate = 0;

        System.out.println("Please chose bank you prefer to get a credit with number");
        System.out.println("1- ING..: 3.29\n2- TEB...: 3.75\n3- Alternative...: 4.30");
        int bank = new Scanner(System.in).nextInt();

        if (bank == 1)
            interestRate = 3.29;
        else if (bank == 2)
            interestRate = 3.75;
        else if (bank == 3)
            interestRate = 4.30;
        else
            System.out.println("Please enter valid number");


        System.out.println("Please enter principal");
        int principal = new Scanner(System.in).nextInt();

        System.out.println("Please enter maturity period");
        int maturity = new Scanner(System.in).nextInt();

        // "kredi tutarı x [faiz x (1 + faiz) taksit sayısı/ (1 + faiz) taksit sayısı - 1]"

        long moneyToPayBack = (long) (principal * (interestRate * (1 + interestRate) * maturity /
                        (1 + interestRate) * maturity -1));

        long interest = (long) (moneyToPayBack - principal);

        System.out.println("Total interest...: " + interest);
        System.out.println("Total money to pay back...: " + (principal + interest));

        long finishTime = System.nanoTime();
        long time = finishTime - startTime;

        System.out.println(time); // nano saniye
    }
}
