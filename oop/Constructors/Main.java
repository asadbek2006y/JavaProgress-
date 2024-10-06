package oop.Constructors;

public class Main {

    public static void main(String[] args) {
        Human human = new Human("Rick", 65, 80);
        System.out.println(human.name);
        System.out.println(human.age);
        System.out.println(human.wheight);
    }
}