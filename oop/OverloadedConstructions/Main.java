package oop.OverloadedConstructions;

public class Main {
    public static void main(String[] args) {

        Pizza pizza = new Pizza("Thicc cut", "Tomatoe");

        System.out.println("Here ingredients of pizza");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);
    }
}
