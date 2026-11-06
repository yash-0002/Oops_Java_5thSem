class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class Worker {
    String name;

    Worker(String name) {
        this.name = name;
    }

    double calculatePay() {
        return 0;
    }
}

class FullTimeWorker extends Worker {
    double monthlySalary;

    FullTimeWorker(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    double calculatePay() {
        return monthlySalary;
    }
}

class PartTimeWorker extends Worker {
    int hours;
    double ratePerHour;

    PartTimeWorker(String name, int hours, double ratePerHour) {
        super(name);
        this.hours = hours;
        this.ratePerHour = ratePerHour;
    }

    double calculatePay() {
        return hours * ratePerHour;
    }
}

public class Practical4 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("--- Method Overloading ---");
        System.out.println("add(10, 20) = " + calc.add(10, 20));
        System.out.println("add(10, 20, 30) = " + calc.add(10, 20, 30));
        System.out.println("add(5.5, 2.5) = " + calc.add(5.5, 2.5));

        System.out.println();
        System.out.println("--- Method Overriding ---");
        Worker w1 = new FullTimeWorker("Suresh", 40000);
        Worker w2 = new PartTimeWorker("Kavita", 80, 250);
        System.out.println(w1.name + " pay: " + w1.calculatePay());
        System.out.println(w2.name + " pay: " + w2.calculatePay());

        System.out.println();
        System.out.println("Overloading is compile-time polymorphism (decided by the compiler).");
        System.out.println("Overriding is runtime polymorphism (decided by the object at runtime).");
    }
}
