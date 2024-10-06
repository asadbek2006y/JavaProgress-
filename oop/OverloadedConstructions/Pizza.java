package oop.OverloadedConstructions;

public class Pizza {

    String bread;
    String sauce;
    String cheese;
    String topping;
    
    Pizza(String bread, String sauce){
        this.bread = bread;
        this.sauce = sauce;
    }
    Pizza(String bread, String sauce,String cheese, String topping){
        this.bread = bread;
        this.sauce = sauce;
        this.sauce = cheese;
        this.sauce = topping;
    }
}
