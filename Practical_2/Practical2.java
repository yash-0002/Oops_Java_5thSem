class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void start() {
        System.out.println(brand + " vehicle is starting");
    }

    void showSpeed() {
        System.out.println("Top speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    int doors;

    Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    void showDoors() {
        System.out.println("Number of doors: " + doors);
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showPerson() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Employee extends Person {
    int empId;
    double salary;

    Employee(String name, int age, int empId, double salary) {
        super(name, age);
        this.empId = empId;
        this.salary = salary;
    }

    void showEmployee() {
        System.out.println("Employee ID: " + empId + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int age, int empId, double salary, String department) {
        super(name, age, empId, salary);
        this.department = department;
    }

    void showManager() {
        System.out.println("Department: " + department);
    }
}

class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }

    void showColor() {
        System.out.println("Color: " + color);
    }
}

class Circle extends Shape {
    double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    double area() {
        return 3.14159 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
}

public class Practical2 {
    public static void main(String[] args) {
        System.out.println("--- Single Inheritance ---");
        Car car = new Car("Honda", 180, 4);
        car.start();
        car.showSpeed();
        car.showDoors();

        System.out.println();
        System.out.println("--- Multilevel Inheritance ---");
        Manager m = new Manager("Neha Gupta", 35, 5021, 85000, "Sales");
        m.showPerson();
        m.showEmployee();
        m.showManager();

        System.out.println();
        System.out.println("--- Hierarchical Inheritance ---");
        Circle c = new Circle("Red", 7);
        Rectangle r = new Rectangle("Blue", 10, 5);
        c.showColor();
        System.out.println("Area of circle: " + c.area());
        r.showColor();
        System.out.println("Area of rectangle: " + r.area());
    }
}
