import java.util.Scanner;

class Commission {
    double sales;

    Commission(double salesAmount) {
        sales = salesAmount;
    }

    double commission() {
        return sales * 0.1;
    }
}

public class q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sales amount:");
        double sales = sc.nextDouble();

        if (sales < 0) {
            System.out.println("Invalid Input");
        } else {
            Commission commissionObj = new Commission(sales);
            System.out.println("Commission: " + commissionObj.commission());
        }
        sc.close();
    }
}

