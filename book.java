import java.util.Scanner;

class Publisher {
    String publisherName;

    void getPublisher(Scanner sc) {
        System.out.print("Enter Publisher Name: ");
        publisherName = sc.nextLine();
    }
}

class Book extends Publisher {
    String bookTitle;
    String author;

    void getBook(Scanner sc) {
        System.out.print("Enter Book Title: ");
        bookTitle = sc.nextLine();

        System.out.print("Enter Author Name: ");
        author = sc.nextLine();
    }
}

class Literature extends Book {
    void display() {
        System.out.println("\n--- Literature Book Details ---");
        System.out.println("Title: " + bookTitle);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisherName);
    }
}

class Fiction extends Book {
    void display() {
        System.out.println("\n--- Fiction Book Details ---");
        System.out.println("Title: " + bookTitle);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisherName);
    }
}

public class prgm11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Category:");
        System.out.println("1. Literature");
        System.out.println("2. Fiction");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            Literature l = new Literature();
            l.getPublisher(sc);
            l.getBook(sc);
            l.display();
        } 
        else if (choice == 2) {
            Fiction f = new Fiction();
            f.getPublisher(sc);
            f.getBook(sc);
            f.display();
        } 
        else {
            System.out.println("Invalid Choice");
        }
    }
}
