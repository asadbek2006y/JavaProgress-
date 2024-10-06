package oop.abstraction;

public class Main {
    public static void main(String[] args) {
        // abstract = abstract classes cannot be installed, but they can have a subclass
        // abstract methodds are declared without an implementation

        // Vehicle vehicle = new Vehicle();
        Car car = new Car();
        car.go();
    }
}
