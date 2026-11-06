class Product {
    String name;
    double price;
    int quantity;

    Product() {
        name = "No Name";
        price = 0.0;
        quantity = 0;
    }

    Product(String name) {
        this.name = name;
        price = 0.0;
        quantity = 1;
    }

    Product(String name, double price) {
        this.name = name;
        this.price = price;
        quantity = 1;
    }

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double totalCost() {
        return price * quantity;
    }

    void display() {
        System.out.println("Name: " + name + ", Price: " + price + ", Quantity: " + quantity
                + ", Total Cost: " + totalCost());
    }
}

public class Practical8 {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product("Notebook");
        Product p3 = new Product("Pen", 15.5);
        Product p4 = new Product("Backpack", 1200, 3);

        System.out.println("No argument constructor:");
        p1.display();
        System.out.println("Name only constructor:");
        p2.display();
        System.out.println("Name and price constructor:");
        p3.display();
        System.out.println("All fields constructor:");
        p4.display();
    }
}
