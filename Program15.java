import java.util.Scanner;

// Interface
interface Bill {
    void calculate();
}

// Class implementing interface
class Product implements Bill {
    int productId;
    String name;
    int quantity;
    double unitPrice;
    double total;

    // Constructor
    Product(int productId, String name, int quantity, double unitPrice) {
        this.productId = productId;
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    // Implement calculate method
    public void calculate() {
        total = quantity * unitPrice;
    }

    // Display product details
    public void display() {
        System.out.println(productId + "\t\t" + name + "\t" + quantity + "\t\t" + unitPrice + "\t\t" + total);
    }
}

// Main class
public class Program15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        double netAmount = 0;

        System.out.print("Enter number of products: ");
        n = sc.nextInt();

        Product[] p = new Product[n];

        // Input
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of product " + (i + 1));

            System.out.print("Product ID: ");
            int id = sc.nextInt();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Quantity: ");
            int qty = sc.nextInt();

            System.out.print("Unit Price: ");
            double price = sc.nextDouble();

            p[i] = new Product(id, name, qty, price);
            p[i].calculate();
        }

        // Output Bill Format
        System.out.println("\n---------------- BILL ----------------");
        System.out.println("Product Id\tName\tQty\tUnit Price\tTotal");

        for (int i = 0; i < n; i++) {
            p[i].display();
            netAmount += p[i].total;
        }

        System.out.println("--------------------------------------");
        System.out.println("\t\t\tNet Amount: " + netAmount);

        sc.close();
    }
}
