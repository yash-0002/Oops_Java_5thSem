interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class AllInOnePrinter implements Printable, Scannable {
    public void print() {
        System.out.println("Printing the document...");
    }

    public void scan() {
        System.out.println("Scanning the document...");
    }
}

class Device {
    String model;

    Device(String model) {
        this.model = model;
    }

    void powerOn() {
        System.out.println(model + " is switched on");
    }
}

class Photocopier extends Device implements Printable, Scannable {
    Photocopier(String model) {
        super(model);
    }

    public void print() {
        System.out.println(model + " is printing a copy");
    }

    public void scan() {
        System.out.println(model + " is scanning a page");
    }

    void copy() {
        scan();
        print();
        System.out.println("Copy completed");
    }
}

public class Practical3 {
    public static void main(String[] args) {
        System.out.println("--- Multiple inheritance using interfaces ---");
        AllInOnePrinter p = new AllInOnePrinter();
        p.print();
        p.scan();

        System.out.println();
        System.out.println("--- Hybrid inheritance ---");
        Photocopier pc = new Photocopier("Canon X200");
        pc.powerOn();
        pc.copy();

        Printable pr = pc;
        Scannable sc = pc;
        pr.print();
        sc.scan();

        System.out.println();
        System.out.println("Java does not allow a class to extend two classes because if both");
        System.out.println("parents had the same method, the compiler could not decide which one");
        System.out.println("to inherit (diamond problem). Interfaces only declare methods and the");
        System.out.println("implementing class gives the single body, so there is no confusion.");
    }
}
