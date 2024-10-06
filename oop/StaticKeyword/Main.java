package oop.StaticKeyword;

public class Main {
    public static void main(String[] args) {
        
        // static = modifier. A single  copy of a variable/method is created and shared.
        //          The class "owns"  the static member

        Friend friend1 = new Friend("Asadbek");
        Friend friend2 = new Friend("Batmen");

        Friend.displayFriends();
    }
}
