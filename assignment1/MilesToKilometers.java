import java.util.Scanner;

public class MilesToKilometers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in miles:");
        double mil = sc.nextDouble();
        double cf = 1.60934;
        double km = mil * cf;
        System.out.println("Distance in kilometers: " + km);
        sc.close();
    }
}

