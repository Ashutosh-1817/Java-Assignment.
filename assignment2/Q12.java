package assignment2;

class Distance {
    double miles;

    Distance(double miles) {
        this.miles = miles;
    }

    void travelTime() {
        System.out.println("Time taken (at 60 mph): " + (miles / 60) + " hours");
    }
}

class DistanceMKS extends Distance {
    DistanceMKS(double kilometers) {
        super(kilometers);
    }

    @Override
    void travelTime() {
        System.out.println("Time taken (at 100 km/h): " + (miles / 100) + " hours");
    }
}

public class Q12 {
    public static void main(String[] args) {
        Distance distance = new Distance(120);
        distance.travelTime();

        DistanceMKS distanceMKS = new DistanceMKS(200);
        distanceMKS.travelTime();
    }
}
