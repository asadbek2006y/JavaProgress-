package oop.Interface;

public class Main {

    public static void main(String[] args) {
        
        // Interface =  a template that can be applied to a class
        //              similar to inhertiance, but specifies what a class has/must do.
        //              classes can aply more than one interface is limited to 1 super 

        // Rabbit rabbit = new Rabbit();
        // rabbit.flee();

        // Hawk hawk = new Hawk();
        // hawk.hunt();

        Fish fish = new Fish();
        fish.hunt();
        fish.flee();
    }
    
}
