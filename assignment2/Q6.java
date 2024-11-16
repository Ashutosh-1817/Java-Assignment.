package assignment2;

public class Q6 {
    void show(int x) {
        System.out.println("Integer: " + x);
    }

    void show(String s) {
        System.out.println("String: " + s);
    }

    public static void main(String[] args) {
        Q6 obj = new Q6();
        obj.show(10);
        obj.show("Krishna");
    }
}

