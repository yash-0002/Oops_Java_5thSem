class ComplexNumber {
    double real;
    double imag;

    ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imag + other.imag);
    }

    void display() {
        if (imag >= 0) {
            System.out.println(real + " + " + imag + "i");
        } else {
            System.out.println(real + " - " + (-imag) + "i");
        }
    }
}

public class Practical5 {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(4, 3);
        ComplexNumber c2 = new ComplexNumber(2.5, -7);
        ComplexNumber sum = c1.add(c2);

        System.out.print("First number  : ");
        c1.display();
        System.out.print("Second number : ");
        c2.display();
        System.out.print("Sum           : ");
        sum.display();

        System.out.println();
        System.out.println("Java does not support user defined operator overloading because it");
        System.out.println("keeps the language simple and the code easy to read. A + could mean");
        System.out.println("anything for a user class, so Java uses named methods like add().");
    }
}
