class Employee {
    String name;
    double salary;
    static int count = 0;

    Employee() {
        this("Not Assigned", 10000);
        System.out.println("No-argument constructor called this(...)");
    }

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        count++;
    }

    void display() {
        System.out.println("Name: " + this.name + ", Salary: " + this.salary);
    }

    static void showCount() {
        System.out.println("Total employees created: " + count);
    }
}

public class Practical9 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ravi Mehta", 45000);
        Employee e2 = new Employee("Sunita Rao", 52000);
        Employee e3 = new Employee();

        e1.display();
        e2.display();
        e3.display();

        Employee.showCount();
    }
}
