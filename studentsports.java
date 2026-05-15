```java id="4j8wpl"
import java.util.Scanner;

class Student
{
    int academicMarks;

    void getAcademicMarks()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Academic Marks: ");
        academicMarks = sc.nextInt();
    }

    void displayAcademicMarks()
    {
        System.out.println("Academic Marks: " + academicMarks);
    }
}

interface Sports
{
    void getSportsMarks();
    void displaySportsMarks();
}

class Result extends Student implements Sports
{
    int sportsMarks;

    public void getSportsMarks()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Sports Marks: ");
        sportsMarks = sc.nextInt();
    }

    public void displaySportsMarks()
    {
        System.out.println("Sports Marks: " + sportsMarks);
    }
}

public class multi_inheri
{
    public static void main(String[] args)
    {
        Result r = new Result();

        r.getAcademicMarks();
        r.getSportsMarks();

        System.out.println("\n--- Student Result ---");

        r.displayAcademicMarks();
        r.displaySportsMarks();
    }
}
```
