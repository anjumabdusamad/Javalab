import java.util.Scanner;

class CPU {

    double price;

    // Constructor
    CPU(double price) {
        this.price = price;
    }

    // Inner class Processor
    class Processor {
        int noOfCores;
        String manufacturer;

        Processor(int noOfCores, String manufacturer) {
            this.noOfCores = noOfCores;
            this.manufacturer = manufacturer;
        }

        void displayProcessor() {
            System.out.println("Processor Cores: " + noOfCores);
            System.out.println("Processor Manufacturer: " + manufacturer);
        }
    }

    // Static nested class RAM
    static class RAM {
        int memory;
        String manufacturer;

        RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        void displayRAM() {
            System.out.println("RAM Memory: " + memory + "GB");
            System.out.println("RAM Manufacturer: " + manufacturer);
        }
    }
}

public class Innerandstatic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking CPU input
        System.out.print("Enter CPU Price: ");
        double price = sc.nextDouble();

        CPU cpu = new CPU(price);

        // Taking Processor input
        System.out.print("Enter Number of Cores: ");
        int cores = sc.nextInt();
        sc.nextLine();   // clear buffer

        System.out.print("Enter Processor Manufacturer: ");
        String procMan = sc.nextLine();

        CPU.Processor processor = cpu.new Processor(cores, procMan);

        // Taking RAM input
        System.out.print("Enter RAM Memory (GB): ");
        int memory = sc.nextInt();
        sc.nextLine();   // clear buffer

        System.out.print("Enter RAM Manufacturer: ");
        String ramMan = sc.nextLine();

        CPU.RAM ram = new CPU.RAM(memory, ramMan);

        // Displaying details
        System.out.println("\n--- CPU DETAILS ---");
        System.out.println("CPU Price: " + cpu.price);
        processor.displayProcessor();
        ram.displayRAM();

        sc.close();
    }
}
