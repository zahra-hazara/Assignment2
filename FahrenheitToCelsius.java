package Assignment2;
import java.util.Scanner;


public class FahrenheitToCelsius {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a temperature in Fahrenheit: ");
        // Read the temperature in Fahrenheit from the user
        double temperatureFahrenheit = scanner.nextDouble();

        // Convert the temperature to Celsius
        double temperatureCelsius = (temperatureFahrenheit - 32) * 5 / 9;

        // Display the converted temperature with one decimal place
        System.out.printf("Temperature in Celsius: %.1f", temperatureCelsius);

        // Close the scanner
        scanner.close();
    }

}
