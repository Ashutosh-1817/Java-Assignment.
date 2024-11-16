import java.util.Scanner;

public class BinaryDecimalConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Binary to Decimal or 2 for Decimal to Binary:");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Enter a binary number:");
            int binary = sc.nextInt();
            int decimal = 0, power = 0;

            while (binary > 0) {
                int digit = binary % 10;
                decimal += digit * Math.pow(2, power);
                binary /= 10;
                power++;
            }
            System.out.println("Decimal: " + decimal);
        } else if (choice == 2) {
            System.out.println("Enter a decimal number:");
            int decimal = sc.nextInt();
            String binary = "";

            while (decimal > 0) {
                binary = (decimal % 2) + binary;
                decimal /= 2;
            }
            System.out.println("Binary: " + binary);
        } else {
            System.out.println("Invalid choice.");
        }
        sc.close();
    }
}

