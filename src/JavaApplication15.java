import java.util.Scanner;

public class MultiplyNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Multiply the two numbers
        double product = num1 * num2;

        // Display the result
        System.out.println("The product of " + num1 + " and " + num2 + " is " + product);
    }
}
