package oop.arrayofobjects;

public class Main {
    
    public static void main(String[] args) {
        
        // Food[] refrigirator = new Food[3];

        Food food1 = new Food("Pizza");
        Food food2 = new Food("Hamburger");
        Food food3 = new Food("HotDog");

        Food[] refrigirator = {food1,food2,food3};
        // refrigirator[0] = food1;
        // refrigirator[1] = food2;
        // refrigirator[2] = food3;

        System.out.println(refrigirator[0].name);
        System.out.println(refrigirator[1].name);
        System.out.println(refrigirator[2].name);

    }
}
