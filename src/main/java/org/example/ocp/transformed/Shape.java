package org.example.ocp.transformed;

public class Shape {

    public static void main(String[] args) {
        Drawable rectangle = new Rectangle();
        rectangle.draw();

        Drawable circle = new Circle();
        circle.draw();
    }
}

interface Drawable {
    void draw();
}

class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle implements  Drawable {

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}