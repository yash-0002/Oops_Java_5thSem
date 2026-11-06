class Book {
    String title;
    String author;
    double price;

    Book() {
        title = "Not Available";
        author = "Unknown";
        price = 0.0;
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    Book(Book b) {
        this.title = b.title;
        this.author = b.author;
        this.price = b.price;
    }

    void display() {
        System.out.println("Title: " + title + " | Author: " + author + " | Price: " + price);
    }
}

public class Practical6 {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java: The Complete Reference", "Herbert Schildt", 899.0);
        Book b3 = new Book(b2);

        System.out.println("Default constructor:");
        b1.display();
        System.out.println("Parameterized constructor:");
        b2.display();
        System.out.println("Copy constructor:");
        b3.display();

        b3.title = "Head First Java";
        b3.price = 650.0;

        System.out.println();
        System.out.println("After changing the copy:");
        System.out.print("Original: ");
        b2.display();
        System.out.print("Copy    : ");
        b3.display();
        System.out.println("The original object did not change.");

        System.out.println();
        System.out.println("Default constructor takes no arguments and sets default values.");
        System.out.println("Parameterized constructor sets values given by the caller.");
        System.out.println("Copy constructor makes a new object from an existing object.");
    }
}
