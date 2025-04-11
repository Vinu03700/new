class Rectangle {
    private double length;
    private double width;

    // Constructor 1: Default constructor (no arguments)
    public Rectangle() {
        this.length = 1.0; // Default length
        this.width = 1.0;   // Default width
        System.out.println("Rectangle created with default dimensions: length=" + length + ", width=" + width);
    }

    // Constructor 2: Constructor with one argument (for a square)
    public Rectangle(double side) {
        this.length = side;
        this.width = side;
        System.out.println("Square created with side: " + side);
    }

    // Constructor 3: Constructor with two arguments (length and width)
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("Rectangle created with dimensions: length=" + length + ", width=" + width);
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public void displayDimensions() {
        System.out.println("Length: " + length + ", Width: " + width);
    }
}

public class ConstructorOverloadingExample {
    public static void main(String[] args) {
        // Creating Rectangle objects using different constructors
        Rectangle rect1 = new Rectangle();         // Calls the default constructor
        Rectangle square1 = new Rectangle(5.0);    // Calls the constructor with one argument
        Rectangle rect2 = new Rectangle(8.0, 12.0); // Calls the constructor with two arguments

        System.out.println("\n--- Rectangle 1 ---");
        rect1.displayDimensions();
        System.out.println("Area: " + rect1.calculateArea());
        System.out.println("Perimeter: " + rect1.calculatePerimeter());

        System.out.println("\n--- Square 1 ---");
        square1.displayDimensions();
        System.out.println("Area: " + square1.calculateArea());
        System.out.println("Perimeter: " + square1.calculatePerimeter());

        System.out.println("\n--- Rectangle 2 ---");
        rect2.displayDimensions();
        System.out.println("Area: " + rect2.calculateArea());
        System.out.println("Perimeter: " + rect2.calculatePerimeter());
    }
}