package oop.modifiers.package2;

import oop.modifiers.package1.*;

public class Asub extends A {
    public static void main(String[] args) {

        Asub asub = new Asub();
        System.out.println(asub.protectedMessage);
    }
}
