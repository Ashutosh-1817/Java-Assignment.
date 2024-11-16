package assignment2;

class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void display() {
        System.out.println("Roll No: " + this.rollNo);
        System.out.println("Name: " + this.name);
    }
}

public class Q15 {
    public static void main(String[] args) {
        Student student = new Student(1, "Alice");
        student.display();
    }
}
