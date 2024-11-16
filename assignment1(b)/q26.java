import java.util.Scanner;

public class q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the queue:");
        int size = sc.nextInt();
        int[] queue = new int[size];
        int front = -1, rear = -1;

        while (true) {
            System.out.println("1. Enqueue\n2. Dequeue\n3. Display\n4. Exit");
            int choice = sc.nextInt();

            if (choice == 1) {
                if (rear == size - 1) {
                    System.out.println("Queue is full.");
                } else {
                    System.out.println("Enter element to enqueue:");
                    if (front == -1) front = 0;
                    queue[++rear] = sc.nextInt();
                }
            } else if (choice == 2) {
                if (front == -1 || front > rear) {
                    System.out.println("Queue is empty.");
                } else {
                    System.out.println("Dequeued: " + queue[front++]);
                }
            } else if (choice == 3) {
                if (front == -1 || front > rear) {
                    System.out.println("Queue is empty.");
                } else {
                    for (int i = front; i <= rear; i++) {
                        System.out.println(queue[i]);
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

