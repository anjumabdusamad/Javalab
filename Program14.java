import java.util.Scanner;

// Student class
class Student {
    int rollNo;
    int academicMarks;

    void getStudentData(Scanner sc) {
        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();

        System.out.print("Enter Academic Marks: ");
        academicMarks = sc.nextInt();
    }
}

// Sports interface
interface Sports {
    int sportsScore = 0; // default

    void getSportsScore(Scanner sc);
}

// Result class inherits Student and implements Sports
class Result extends Student implements Sports {
    int sportsMarks;

    public void getSportsScore(Scanner sc) {
        System.out.print("Enter Sports Score: ");
        sportsMarks = sc.nextInt();
    }

    void displayResult() {
        System.out.println("\n--- Student Result ---");
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Academic Marks: " + academicMarks);
        System.out.println("Sports Score: " + sportsMarks);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Result r = new Result();

        r.getStudentData(sc);
        r.getSportsScore(sc);
        r.displayResult();

        sc.close();
    }
}
