import java.util.Scanner;

class Complex {
    int real, imag;

    // Parameterized Constructor
    Complex(int r, int i) {
        real = r;
        imag = i;
    }

    // Method to add two complex numbers
    Complex add(Complex c) {
        int newReal = this.real + c.real;
        int newImag = this.imag + c.imag;
        return new Complex(newReal, newImag);
    }

    // Display method
    void display() {
        System.out.println(real + " + " + imag + "i");
    }
}

public class Addcomplex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter real and imaginary part of first complex number:");
        int r1 = sc.nextInt();
        int i1 = sc.nextInt();

        System.out.println("Enter real and imaginary part of second complex number:");
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();

        // Creating objects using parameterized constructor
        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);

        // Adding complex numbers
        Complex result = c1.add(c2);

        System.out.print("Sum = ");
        result.display();
    }
}
