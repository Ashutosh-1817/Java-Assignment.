package assignment2;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        int previousDigit = -1; // To store the previous digit, initialized as -1 for the first iteration

        while (num > 9) {
            int currentDigit = num % 10; // Get the last digit
            int nextDigit = (num / 10) % 10; // Get the next digit from the right

            // Form a two-digit number with the current and next digit
            int twoDigitNum = nextDigit * 10 + currentDigit;
            sum += twoDigitNum;

            num /= 10; // Remove the last digit for the next iteration
        }

        System.out.println("Sum of consecutive numbers: " + sum);
    }
}
