package com.CK.Q2_Q3;

import java.util.Objects;
import java.util.Scanner;

public class Runner_Ornek_006 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        Scanner sc = new Scanner(System.in);
        System.out.println("Access Check");

        String username = "Admin987";
        String password = "Access123";

        System.out.println("Please write your username and password");
        System.out.println("Username...: ");
        String username1 = sc.nextLine();
        String password1 = sc.nextLine();

        if (username1.equals(username) && password1.equals(password))
            System.out.println("Welcome");
        else
            System.out.println("Check your username or password");
        long finishTime = System.nanoTime();
        long time = finishTime - startTime;

        System.out.println(time); // nano saniye
    }
}
