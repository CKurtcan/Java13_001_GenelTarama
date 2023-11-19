package com.CK.Q4;

import java.util.Scanner;

public class Runner_Ornek_001 {
    public static void main(String[] args) {
        System.out.println("Birden Fazla Durumu Ifade Etme");

        System.out.println("Please enter day");
        String day = new Scanner(System.in).nextLine();

        String message = dayMessage(day);
        System.out.println(message);
    }
        public static String dayMessage(String day){
            switch (day){
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                    return "On weekdays, try to be energetic!";
                case "Saturday":
                case "Sunday":
                    return "It's the weekend, time to relax!";
                default:
                    return "Invalid day";
            }
        }
}
