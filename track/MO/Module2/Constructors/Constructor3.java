import java.util.Scanner;

public class Constructor3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the product name and price
        String name = scanner.nextLine();
        double price = scanner.nextDouble();

        // Create one Product object and call display()
        Product p = new Product(name, price);
        p.display();
    }
}

class Product {
    String name;
    double price;

    // Parameterized constructor using 'this' keyword
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
    }
}