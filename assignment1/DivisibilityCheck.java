import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num = sc.nextInt();
        int divisor = sc.nextInt();
        if (num % divisor == 0) {
            System.out.println("Divisible");
        } else {
            System.out.println("Not Divisible");
        }
        sc.close();
    }
}

