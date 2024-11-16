package assignment2;

abstract class ThreeDObject {
    abstract double volume();
    abstract double surfaceArea();
}

class Box extends ThreeDObject {
    double length, width, height;

    Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    double volume() {
        return length * width * height;
    }

    double surfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }
}

class Cube extends ThreeDObject {
    double side;

    Cube(double s) {
        side = s;
    }

    double volume() {
        return side * side * side;
    }

    double surfaceArea() {
        return 6 * (side * side);
    }
}

public class Q9 {
    public static void main(String[] args) {
        Box box = new Box(3, 4, 5);
        System.out.println("Box Volume: " + box.volume());
        System.out.println("Box Surface Area: " + box.surfaceArea());

        Cube cube = new Cube(3);
        System.out.println("Cube Volume: " + cube.volume());
        System.out.println("Cube Surface Area: " + cube.surfaceArea());
    }
}


