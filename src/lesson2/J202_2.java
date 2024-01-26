package lesson2;

import java.util.Scanner;

public class J202_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String creator = "Joshua";
        Circle circle = new Circle(creator, 10);
        System.out.println(circle.toString());
        System.out.println("Radius: "+circle.getRadius() + " cm");
        System.out.println("Area: "+circle.area()+ " cm^2");
        System.out.println("==============================");
        Rectangle rectangle = new Rectangle(creator, 5, 2);
        System.out.println(rectangle.toString());
        System.out.println("Width: " + rectangle.getWidth() + " cm");
        System.out.println("Height: " + rectangle.getHeight() + " cm");
        System.out.println("Area: " + rectangle.area() + " cm^2");
        System.out.println("==============================");
        Square square = new Square(creator, 10);
        System.out.println(square.toString());
        System.out.println("Side: " + square.getSide() + " cm");
        System.out.println("Area: " + square.area() + " cm^2");
    }
}

class Shape {
    String creator;
    Shape(){}
    Shape(String creator){
        this.creator = creator;
    }

    String getName(){
        return creator;
    }

    double area(){
        return 0.0;
    }
}

class Circle extends Shape{
    double radius;
    Circle(double radius){

        this.radius = radius;
    }


    Circle (String creator, double radius){
        this.creator = creator;
        this.radius = radius;
    }

    double getRadius(){
        return radius;
    }

    double area(){
        return radius * 2;
    }

    public String toString(){
            return "Circle created by " + creator;
    }

}

class Rectangle extends Shape{
    private double width;
    double height;

    Rectangle(){}

    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    Rectangle(String creator, double width, double height){
        this.creator = creator;
        this.height = height;
        this.width = width;
    }

    double getWidth(){
        return width;
    }

    double getHeight(){
        return height;
    }

    double area(){
        return height * width;
    }

    public String toString(){
        return "Rectangle created by "+creator;
    }
}


class Square extends Rectangle{
double side;
Square(double side){
    this.side = side;
}

Square(String creator, double side){
    this.creator = creator;
    this.side = side;
}

double getSide(){
    return side;
}

double area(){
    return side * side;
}

    public String toString(){
        return "Square created by "+creator;
    }
}