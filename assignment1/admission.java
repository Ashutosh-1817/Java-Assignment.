import java.util.Scanner;

public class admission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter marks for student " + i + " (Maths, Physics, Chemistry):");
            int maths = sc.nextInt();
            int physics = sc.nextInt();
            int chemistry = sc.nextInt();
            int total = maths + physics + chemistry;
            int mathPhysicsTotal = maths + physics;
            if ((maths >= 60 && physics >= 50 && chemistry >= 40 && total >= 200) || mathPhysicsTotal >= 150) {
                System.out.println("Student " + i + " is eligible.");
            } else {
                System.out.println("Student " + i + " is not eligible.");
            }
        }
        sc.close();
    }
}

