package Assignment2;
import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the lengths of the legs
        System.out.print("Enter the length of the first leg: ");
        double firstLeg = scanner.nextDouble();

        System.out.print("Enter the length of the second leg: ");
        double secondLeg = scanner.nextDouble();

        // Calculate the length of the hypotenuse
        double hypotenuse = Math.sqrt(firstLeg * firstLeg + secondLeg * secondLeg);

        // Display the length of the hypotenuse
        System.out.printf("The length of the hypotenuse is: %.2f", hypotenuse);

        // Close the scanner
        scanner.close();
    }

}
