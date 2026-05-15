import java.util.Scanner;

interface Bill {
    void calculate();
}

class Product implements Bill {

    public void calculate() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        int netAmount = 0;
        String billData = "";

        // Input
        for (int i = 1; i <= n; i++) {

            System.out.println("\nEnter Product " + i + " ID: ");
            int id = sc.nextInt();

            System.out.println("Enter Product " + i + " Name: ");
            String name = sc.next();

            System.out.println("Enter Quantity: ");
            int qty = sc.nextInt();

            System.out.println("Enter Unit Price: ");
            int price = sc.nextInt();

            int total = qty * price;
            netAmount += total;

            // Store each row as string
            billData += id + "\t\t" + name + "\t" + qty +
                        "\t\t" + price + "\t\t" + total + "\n";
        }

        // Output (after all input)
        System.out.println("\n\t\tBILL");
        System.out.println("Order No : 1001");
        System.out.println("Date : 06/04/2026");

        System.out.println("---------------------------------------------------");
        System.out.println("Product Id\tName\tQuantity\tUnit Price\tTotal");
        System.out.println("---------------------------------------------------");

        System.out.print(billData);

        System.out.println("---------------------------------------------------");
        System.out.println("\t\t\t\tNet Amount : " + netAmount);
    }
}

public class Billmain {
    public static void main(String[] args) {
        Product p = new Product();
        p.calculate();
    }
}
