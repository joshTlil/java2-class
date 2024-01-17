package lesson2;
public class J202_1 {
    public static void main(String[] args) {
    Rectangle shape1 = new Rectangle(10, 15);
        System.out.println(shape1.width);
        System.out.println(shape1.height);
        System.out.println(shape1.area());

    }

}



class Shape {
    private String creator;

    public Shape(){};
    public Shape(String creator){
        this.creator = creator;
    }

    public String getName(){
        return this.creator;
    }

    public double area(){
        return 0.0;
    }
}

class Rectangle extends Shape{
    public double width;
    public double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double area(){
        return width * height;
    }
}