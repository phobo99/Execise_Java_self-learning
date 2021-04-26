package test;

import Circle.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(10,"blue");

        System.out.println(circle1);
        System.out.println(circle2);
    }
   ;
}
