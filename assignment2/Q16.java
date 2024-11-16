package assignment2;

class MathUtils {
    static int counter = 0;

    static void incrementCounter() {
        counter++;
    }
}

public class Q16 {
    public static void main(String[] args) {
        MathUtils.incrementCounter();
        System.out.println("Counter: " + MathUtils.counter);

        MathUtils.incrementCounter();
        System.out.println("Counter: " + MathUtils.counter);
    }
}
