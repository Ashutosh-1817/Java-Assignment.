package assignment2;

public class Q20 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[-5];
        } catch (NegativeArraySizeException e) {
            System.out.println("NegativeArraySizeException caught");
        }

        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught");
        }
    }
}

