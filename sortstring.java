import java.util.*;

class StringSorter {

    String arr[];
    int n;
    Scanner sc = new Scanner(System.in);

    // Constructor
    StringSorter(int n) {
        this.n = n;
        arr = new String[n];
    }

    // Read strings
    void readStrings() {
        System.out.println("Enter strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
    }

    // Built-in sorting
    void builtInSort() {
        Arrays.sort(arr);
        System.out.println("Built-in Sorting Done.");
    }

    // User-defined sorting (Bubble Sort)
    void userDefinedSort() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("User-defined Sorting Done.");
    }

    // Display
    void display() {
        System.out.println("Sorted Strings:");
        for (String s : arr) {
            System.out.println(s);
        }
    }
}

public class Sortstring {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        // object creation
        StringSorter obj = new StringSorter(n);
        obj.readStrings();

        int choice;

        // while loop for menu
        while (true) {

            System.out.println("\nMENU");
            System.out.println("1. Built-in Sorting");
            System.out.println("2. User-defined Sorting");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    obj.builtInSort();
                    break;

                case 2:
                    obj.userDefinedSort();
                    break;

                case 3:
                    obj.display();
                    break;

                case 4:
                    System.out.println("Program Ended.");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
