package oop.javaoverridding;

public class Main {
    public static void main(String[] args) {

        // method overriding = Declaring a method in sub class,
        // Which is already present class.
        // done so that a child class give its ownF implementation

        Animal animal = new Animal();
        Dog dog = new Dog();

        dog.speak();
    }

}
