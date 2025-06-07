package MethodsPractice;

class Vehicle {
    void run() {
        System.out.println("Vehicle is running"); // This line appears to be misplaced in the original PDF, it should be inside the run() method. Corrected here.
    }
}

class Bike extends Vehicle {
    @Override
    void run() {
        System.out.println("Bike is running safely");
    }
}

public class Maina {
    public static void main(String[] args) {
        Bike obj = new Bike();
        obj.run();
    }
}
