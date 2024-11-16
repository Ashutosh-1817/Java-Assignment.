package assignment2;
class Vehicle {
    protected String regnNumber, color, ownerName;
    protected int speed;

    Vehicle(String regn, String color, String owner, int speed) {
        this.regnNumber = regn;
        this.color = color;
        this.ownerName = owner;
        this.speed = speed;
    }

    void showData() {
        System.out.println("This is a vehicle class");
    }
}

class Bus extends Vehicle {
    private int routeNumber;

    Bus(String regn, String color, String owner, int speed, int route) {
        super(regn, color, owner, speed);
        this.routeNumber = route;
    }

    void showData() {
        super.showData();
        System.out.println("Route Number: " + routeNumber);
    }
}

class Car extends Vehicle {
    private String manufacturerName;

    Car(String regn, String color, String owner, int speed, String manufacturer) {
        super(regn, color, owner, speed);
        this.manufacturerName = manufacturer;
    }

    void showData() {
        super.showData();
        System.out.println("Manufacturer: " + manufacturerName);
    }
}

public class Q10 {
    public static void main(String[] args) {
        Bus bus = new Bus("1234", "Blue", "Alice", 80, 5);
        Car car = new Car("5678", "Red", "Bob", 120, "Toyota");

        bus.showData();
        car.showData();
    }
}
