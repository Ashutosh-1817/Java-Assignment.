package assignment2;

class Parent {
    static void show() {
        System.out.println("Parent static method");
    }
}

class Child extends Parent {
    static void show() {
        System.out.println("Child static method");
    }
}

public class Q8 {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.show();
        
        Child c = new Child();
        c.show();
        
       // Parent pc = new Child();
        //pc.show(); // Calls Parent's show because static methods are hidden, not overridden
    }
}
