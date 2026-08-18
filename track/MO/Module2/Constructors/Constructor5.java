import java.util.Scanner;

public class Constructor5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item = scanner.nextLine();
        int quantity = scanner.nextInt();

        FoodOrder order1 = new FoodOrder(item);
        order1.display();

        FoodOrder order2 = new FoodOrder(item, quantity);
        order2.display();
    }
}

class FoodOrder {
    String item;
    int quantity;

    // Store the item and set quantity to 1
    FoodOrder(String item) {
        this.item = item;
        this.quantity = 1; // Fixed: assign directly to instance variable
    }

    // Store both values
    FoodOrder(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Order: " + item + ", Quantity: " + quantity);
    }
}