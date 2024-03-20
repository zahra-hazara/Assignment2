package Assignment2;

import java.util.Scanner;

public class ObsoleteMeasures {
    public static void main(String[] args) {
        final double GRAMS_PER_LUOTI = 13.28;
        final int LUOTI_PER_NAULA = 32;
        final int NAULA_PER_LEIVISKA = 20;

        // Create a Scanner object for console input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a weight in grams
        System.out.print("Enter the weight in grams: ");
        double grams = scanner.nextDouble();

        // Convert grams to total luoti
        double totalLuoti = grams / GRAMS_PER_LUOTI;

        // Calculate the weight in medieval measurements
        int leiviska = (int)(totalLuoti / (LUOTI_PER_NAULA * NAULA_PER_LEIVISKA));
        int naula = (int)(totalLuoti / LUOTI_PER_NAULA) % NAULA_PER_LEIVISKA;
        double luoti = totalLuoti % LUOTI_PER_NAULA;

        // Display the result
        System.out.println("Medieval weight: " + leiviska + " leiviskä, " + naula + " naula, " + String.format("%.2f", luoti) + " luoti");

        // Close the scanner
        scanner.close();
    }

}

