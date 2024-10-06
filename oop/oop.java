package oop;
public class oop {
    public static void main(String[] args) {
        
        // object = an instance of a class that may contain attributes and methods
        // example: (phone, desk, computer, coffe cup)
        
        carClass myCar = new carClass();

        System.out.println(myCar.model);
        System.out.println(myCar.color);

        myCar.drive();
    }
}
