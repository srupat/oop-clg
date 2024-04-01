import java.lang.Math;
import java.util.Scanner;

class Shape {
    private int a = 5;
    private int b = 4;
    public void area(){
        a = a++;
        return;
    };
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

    public void area(int base) {
        this.base = base;
        double triangleArea = 0.5 * this.base * height;
        System.out.println("Area of Triangle with new base: " + triangleArea);
    }

    public void area(int base, int height) {
        this.base = base;
        this.height = height;
        double triangleArea = 0.5 * this.base * this.height;
        System.out.println("Area of Triangle with new base and height: " + triangleArea);
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
        int a = 5;
        int b = 10;

        triangle.area();
        circle.area();
        square.area();
    }
}
