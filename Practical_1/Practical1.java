class Student {
    int rollNo;
    String name;
    int marks1, marks2, marks3;

    Student(int rollNo, String name, int marks1, int marks2, int marks3) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    int calculateTotal() {
        return marks1 + marks2 + marks3;
    }

    double calculatePercentage() {
        return calculateTotal() * 100.0 / 300;
    }

    void display() {
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Name       : " + name);
        System.out.println("Marks      : " + marks1 + ", " + marks2 + ", " + marks3);
        System.out.println("Total      : " + calculateTotal());
        System.out.printf("Percentage : %.2f%%%n", calculatePercentage());
        System.out.println("-----------------------------");
    }
}

public class Practical1 {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Rahul Sharma", 78, 85, 90);
        Student s2 = new Student(102, "Priya Singh", 92, 88, 95);
        Student s3 = new Student(103, "Amit Kumar", 65, 70, 58);

        s1.display();
        s2.display();
        s3.display();

        System.out.println("Class              : Student");
        System.out.println("Objects            : s1, s2, s3");
        System.out.println("Instance variables : rollNo, name, marks1, marks2, marks3");
        System.out.println("Constructor        : Student(int, String, int, int, int)");
        System.out.println("Methods            : calculateTotal(), calculatePercentage(), display()");
    }
}
