import java.util.Scanner;

public class q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the stack:");
        int size = sc.nextInt();
        int[] stack = new int[size];
        int top = -1;

        while (true) {
            System.out.println("1. Push\n2. Pop\n3. Display\n4. Exit");
            int choice = sc.nextInt();

            if (choice == 1) {
                if (top == size - 1) {
                    System.out.println("Stack is full.");
                } else {
                    System.out.println("Enter element to push:");
                    stack[++top] = sc.nextInt();
                }
            } else if (choice == 2) {
                if (top == -1) {
                    System.out.println("Stack is empty.");
                } else {
                    System.out.println("Popped: " + stack[top--]);
                }
            } else if (choice == 3) {
                if (top == -1) {
                    System.out.println("Stack is empty.");
                } else {
                    for (int i = top; i >= 0; i--) {
                        System.out.println(stack[i]);
                    }
                }
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}

