package oop.Encapsulation;

public class Main {
    public static void main(String[] args) {
        
        // Encapsulation = attributes of a class will be hidden or private,
        //                 Can be accessed only through methods(getters & setters)
        //                 You should  make attributes private if you don't have a reason to make them public/potected




        Car car = new Car("Chevrolet", "Camoro", 2012);
        System.out.println(car.getMake());
    }
    
}
