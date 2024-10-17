import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int lcm;
        if (num1 > num2) {
            lcm = num1;
        } else {
            lcm = num2;
        }
        while (lcm % num1 != 0 || lcm % num2 != 0) {
            lcm++;
        }
        System.out.println("LCM: " + lcm);
        sc.close();
    }
}

