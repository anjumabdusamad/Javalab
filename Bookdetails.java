import java.util.Scanner;

class Publisher {
    String publisherName;

    void readPublisher(Scanner sc) {
        System.out.print("Enter publisher name: ");
        publisherName = sc.nextLine();
    }
}

class Book extends Publisher {
    String title;
    String author;

    void readBook(Scanner sc) {
        System.out.print("Enter book title: ");
        title = sc.nextLine();

        System.out.print("Enter author name: ");
        author = sc.nextLine();

        readPublisher(sc);
    }

    void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisherName);
    }
}

class Literature extends Book {
    void display() {
        System.out.println("\n--- Literature Book Details ---");
        displayBook();
    }
}

class Fiction extends Book {
    void display() {
        System.out.println("\n--- Fiction Book Details ---");
        displayBook();
    }
}

public class Bookdetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter category (1-Literature, 2-Fiction): ");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            Literature l = new Literature();
            l.readBook(sc);
            l.display();
        } 
        else if (choice == 2) {
            Fiction f = new Fiction();
            f.readBook(sc);
            f.display();
        } 
        else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}
