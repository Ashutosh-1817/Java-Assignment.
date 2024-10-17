public class fac {
    public static void main(String[] args) {
        int num = 4;
        long f= 1;
        for (int i = 1; i <= num; i++) {
             f*= i;
        }
        System.out.println("Factorial of 4 : " + f);
    }
}
