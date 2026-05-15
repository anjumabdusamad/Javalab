import java.util.Scanner;

class Employeedetails {
    int eNo;
    String eName;
    double eSalary;

    void read(Scanner sc) {
        System.out.println("Enter employee no:");
        eNo = sc.nextInt();
        sc.nextLine();   // clear buffer

        System.out.println("Enter employee name:");
        eName = sc.nextLine();

        System.out.println("Enter employee salary:");
        eSalary = sc.nextDouble();
    }

    void display() {
        System.out.println("Employee no: " + eNo);
        System.out.println("Employee name: " + eName);
        System.out.println("Employee salary: " + eSalary);
    }
}

public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of employees:");
        int n = sc.nextInt();

        Employeedetails emp[] = new Employeedetails[n];

        // Employee details
        for (int i = 0; i < n; i++) {
            emp[i] = new Employeedetails();
            System.out.println("\nEnter details of employee " + (i + 1));
            emp[i].read(sc);
        }

        // Search employee
        System.out.println("\nEmployee no. to search:");
        int searchNo = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (emp[i].eNo == searchNo) {
                System.out.println("\nEmployee found.");
                emp[i].display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nEmployee not found.");
        }

        sc.close();
    }
}
