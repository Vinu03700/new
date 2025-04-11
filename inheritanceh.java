class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
        System.out.println("Shape constructor called. Color: " + color);
    }

    public void displayColor() {
        System.out.println("Color of the shape: " + color);
    }

    public double area() {
        System.out.println("Area calculation not defined for a generic shape.");
        return 0;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(String color, double length, double width) {
        super(color); 
        this.length = length;
        this.width = width;
        System.out.println("Rectangle constructor called.");
    }

    @Override
    public double area() {
        return length * width;
    }

    public void displayDimensions() {
        System.out.println("Length: " + length + ", Width: " + width);
    }
}

class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super(color); 
        this.radius = radius;
        System.out.println("Circle constructor called.");
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    public void displayRadius() {
        System.out.println("Radius: " + radius);
    }
}

public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle("Blue", 5, 10);
        System.out.println("\n--- Rectangle Details ---");
        myRectangle.displayColor(); 
        myRectangle.displayDimensions();
        System.out.println("Area: " + myRectangle.area()); 

        Circle myCircle = new Circle("Red", 7);
        System.out.println("\n--- Circle Details ---");
        myCircle.displayColor(); 
        myCircle.displayRadius(); 
        System.out.println("Area: " + myCircle.area()); 

        Shape shape1 = myRectangle;
        Shape shape2 = myCircle;

        System.out.println("\n--- Polymorphic Calls ---");
        shape1.displayColor();
        System.out.println("Area of shape 1: " + shape1.area()); 