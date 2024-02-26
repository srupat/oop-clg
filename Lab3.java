import java.lang.Math;
import java.util.Scanner;

abstract class Shape {
    public abstract void area();
}

class Triangle extends Shape {
    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void area() {
        double triangleArea = 0.5 * base * height;
        System.out.println("Area of Triangle: " + triangleArea);
    }
}

class Square extends Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void area() {
        int squareArea = side * side;
        System.out.println("Area of Square: " + squareArea);
    }
}

class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        double circleArea = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + circleArea);
    }
}

public class Lab3 {
    public static void main(String[] args) {
        Shape triangle = new Triangle(3, 4);
        Shape circle = new Circle(5);
        Shape square = new Square(5);

        triangle.area();
        circle.area();
        square.area();
    }
}
