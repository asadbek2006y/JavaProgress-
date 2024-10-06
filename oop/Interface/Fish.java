package oop.Interface;

public class Fish implements Prey,Predator{

    @Override
    public void flee(){
        System.out.println("This fish escaping from Shark");
    }

    @Override
    public void hunt(){
        System.out.println("This fish hunting smaller fish");
    }
    
}
