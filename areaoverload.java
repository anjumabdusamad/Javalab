```java id="2v9kdt"
import java.util.Scanner;

class areaoverload
{
    // Area of Square
    double area(double side)
    {
        return side * side;
    }

    // Area of Rectangle
    double area(double length, double breadth)
    {
        return length * breadth;
    }

    // Area of Circle
    double area(float radius)
    {
        return 3.14 * radius * radius;
    }

    // Area of Triangle
    double area(double base, double height, int t)
    {
        return 0.5 * base * height;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        areaoverload obj = new areaoverload();

        System.out.print("Enter side of square: ");
        double side = sc.nextDouble();
        System.out.println("Area of Square = " + obj.area(side));

        System.out.print("Enter length and breadth of rectangle: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Area of Rectangle = " + obj.area(l, b));

        System.out.print("Enter radius of circle: ");
        float r = sc.nextFloat();
        System.out.println("Area of Circle = " + obj.area(r));

        System.out.print("Enter base and height of triangle: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        System.out.println("Area of Triangle = " + obj.area(base, height, 1));
    }
}
```
