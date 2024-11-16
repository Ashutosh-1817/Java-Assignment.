package assignment2;

public class Q4 {
    Q4() {
        System.out.println("Default Constructor");
    }

    Q4(int x) {
        System.out.println("Parameterized Constructor: " + x);
    }

    public static void main(String[] args) {
        new Q4();
        new Q4(100);
    }
}
