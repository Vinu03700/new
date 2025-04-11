class ComplexNumber {
    double real;
    double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two ComplexNumber objects
    public ComplexNumber add(ComplexNumber other) {
        double sumReal = this.real + other.real;
        double sumImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(sumReal, sumImaginary);
    }

    // Method to subtract two ComplexNumber objects
    public ComplexNumber subtract(ComplexNumber other) {
        double diffReal = this.real - other.real;
        double diffImaginary = this.imaginary - other.imaginary;
        return new ComplexNumber(diffReal, diffImaginary);
    }

    // Method to multiply two ComplexNumber objects
    public ComplexNumber multiply(ComplexNumber other) {
        double productReal = (this.real * other.real) - (this.imaginary * other.imaginary);
        double productImaginary = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new ComplexNumber(productReal, productImaginary);
    }

    @Override
    public String toString() {
        return real + (imaginary >= 0 ? " + " : " - ") + Math.abs(imaginary) + "i";
    }
}

public class OperatorOverloadingExample {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(4, 5);
        ComplexNumber num2 = new ComplexNumber(2, -3);

        System.out.println("Complex Number 1: " + num1);
        System.out.println("Complex Number 2: " + num2);

        // Using the 'add' method to simulate '+' operator
        ComplexNumber sum = num1.add(num2);
        System.out.println("Sum (num1 + num2): " + sum);

        // Using the 'subtract' method to simulate '-' operator
        ComplexNumber difference = num1.subtract(num2);
        System.out.println("Difference (num1 - num2): " + difference);

        // Using the 'multiply' method to simulate '*' operator
        ComplexNumber product = num1.multiply(num2);
        System.out.println("Product (num1 * num2): " + product);
    }
}