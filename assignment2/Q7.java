package assignment2;
class Parent {
    void display() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("Child class");
    }
}

public class Q7 {
    public static void main(String[] args) {
        Child c = new Child();
        c.display(); // Calls overridden method
    }
}
