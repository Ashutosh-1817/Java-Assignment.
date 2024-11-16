package assignment2;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array A: ");
        int m = sc.nextInt();
        int[] A = new int[m];
        System.out.println("Enter elements of array A (sorted):");
        for (int i = 0; i < m; i++) {
            A[i] = sc.nextInt();
        }
        
        System.out.print("Enter size of array B: ");
        int n = sc.nextInt();
        int[] B = new int[n];
        System.out.println("Enter elements of array B (sorted):");
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }
        
        int[] C = new int[m + n];
        int i = 0, j = 0, k = 0;
        
        while (i < m && j < n) {
            if (A[i] < B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }
        
        while (i < m) {
            C[k++] = A[i++];
        }
        
        while (j < n) {
            C[k++] = B[j++];
        }
        
        System.out.println("Merged sorted array:");
        for (int x : C) {
            System.out.print(x + " ");
        }
    }
}
