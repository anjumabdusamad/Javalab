// Java program to demonstrate inner class and static nested class
// with user input

import java.util.Scanner;

class CPU {

    int price;

    // Constructor
    CPU(int price) {
        this.price = price;
    }

    // Inner class
    class Processor {

        int cores;
        String manufacturer;

        Processor(int cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }

        void displayProcessor() {
            System.out.println("\nProcessor Details");
            System.out.println("Number of Cores: " + cores);
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

    // Static nested class
    static class RAM {

        int memory;
        String manufacturer;

        RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        void displayRAM() {
            System.out.println("\nRAM Details");
            System.out.println("Memory: " + memory + " GB");
            System.out.println("Manufacturer: " + manufacturer);
        }
    }
}

public class cpu_program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // CPU input
        System.out.print("Enter CPU Price: ");
        int price = sc.nextInt();
        sc.nextLine();

        // Processor input
        System.out.print("Enter Number of Processor Cores: ");
        int cores = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Processor Manufacturer: ");
        String processorManufacturer = sc.nextLine();

        // RAM input
        System.out.print("Enter RAM Memory (GB): ");
        int memory = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter RAM Manufacturer: ");
        String ramManufacturer = sc.nextLine();

        // Create CPU object
        CPU cpu = new CPU(price);

        // Create Processor object
        CPU.Processor processor =
                cpu.new Processor(cores, processorManufacturer);

        // Create RAM object
        CPU.RAM ram =
                new CPU.RAM(memory, ramManufacturer);

        // Display details
        System.out.println("\n----- CPU DETAILS -----");
        System.out.println("CPU Price: " + cpu.price);

        processor.displayProcessor();

        ram.displayRAM();

        sc.close();
    }
}
