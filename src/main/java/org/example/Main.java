package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Please input an e-mail address: ");
        String eMail = console.nextLine().toLowerCase();

        String at = String.valueOf(eMail.indexOf("@"));
        String dotAfterAt = at.substring(Integer.parseInt("@") + 1, Integer.parseInt("."));

        String beforeAt = at.substring(0, Integer.parseInt("@"));

        System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a distance in km: ");

        double distance = console.nextDouble();

        double mileDistance = distance / 1.60934;

        double gallonAmount =  mileDistance / 11;

        double gasLitre = gallonAmount * 3.78541;

        double gasPrice = gasLitre * 1.33;

        System.out.printf("Distance(km): %.2f\n" +
                        "Distance(miles); %.2f\n" +
                        "Gas(gallon); %.2f\n" +
                        "Gas(litre): %.2f\n" +
                        "Price: %.2f$",
                distance, mileDistance, gallonAmount, gasLitre, gasPrice);
    }
    public static int sumInts(int num1, int num2) {
        int sum = num1 + num2;

        return sum;
    }

}