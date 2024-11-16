class Example {
    int number;

    Example(int num) {
        number = num;
        System.out.println("Parameterized constructor called. Number: " + number);
    }
}

public class q32 {
    public static void main(String[] args) {
        Example obj = new Example(10);
    }
}

