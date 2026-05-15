import java.util.Scanner;

// Abstract class
abstract class Shape {
    abstract double area();
}

// Rectangle class
class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double area() {
        return length * breadth;
    }
}

// Circle class
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return 3.14159 * radius * radius;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Rectangle input
        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth of rectangle: ");
        double breadth = sc.nextDouble();

        Rectangle rect = new Rectangle(length, breadth);
        System.out.println("Area of Rectangle = " + rect.area());

        // Circle input
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();

        Circle circ = new Circle(radius);
        System.out.println("Area of Circle = " + circ.area());

        sc.close();
    }
}
