package oop.PolymorphismDynamic;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        // Dynamic Polymorphism

        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("What animal do you want? ");
        System.out.println("(1 = Dog) OR (2 = Cat)");
        int choise  = scanner.nextInt();
        if(choise == 1) {
            animal = new Dog();
            animal.speak();
        }else if(choise == 2) {
            animal = new Cat();
            animal.speak();
        }else{
            animal = new Animal();
            animal.speak();
        }
    }
}
