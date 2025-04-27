// 2081/11/26
// lab 2.2 to count the numbmer of digit for user given number 

import java.util.Scanner;

public class countDigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize the digit count to 0
        int digitCount = 0;

        // Use a loop to count the digits
        int tempNumber = Math.abs(number); // Handle negative numbers
        while (tempNumber != 0) {
            tempNumber /= 10;
            digitCount++;
        }

        // Handle the case when the number is 0
        if (digitCount == 0) {
            digitCount = 1;
        }

        // Display the result
        System.out.println("The number of digits in " + number + " is: " + digitCount);

        scanner.close();
    }
}
