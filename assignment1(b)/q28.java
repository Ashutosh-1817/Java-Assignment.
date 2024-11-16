import java.util.Scanner;

public class q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        int sum = 0;

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
            if (numbers[i] % 2 != 0) {
                sum += numbers[i];
            }
        }

        System.out.println("Sum of odd numbers: " + sum);
        sc.close();
    }
}

