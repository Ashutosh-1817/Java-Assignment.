package assignment2;

interface A {
    void methodA1();
    void methodA2();
}

interface B {
    void methodB1();
    void methodB2();
}

interface C {
    void methodC1();
    void methodC2();
}

interface D extends A, B, C {
    void methodD();
}

class Combined implements D {
    public void methodA1() { System.out.println("A1"); }
    public void methodA2() { System.out.println("A2"); }
    public void methodB1() { System.out.println("B1"); }
    public void methodB2() { System.out.println("B2"); }
    public void methodC1() { System.out.println("C1"); }
    public void methodC2() { System.out.println("C2"); }
    public void methodD() { System.out.println("D"); }
}

public class Q18 {
    public static void main(String[] args) {
        Combined obj = new Combined();
        obj.methodA1();
        obj.methodB1();
        obj.methodC1();
        obj.methodD();
    }
}

