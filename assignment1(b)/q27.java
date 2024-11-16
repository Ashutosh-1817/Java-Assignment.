import java.util.Scanner;

public class q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int smallest = numbers[0];
        for (int i = 1; i < n; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println("Smallest number: " + smallest);
        sc.close();
    }
}
