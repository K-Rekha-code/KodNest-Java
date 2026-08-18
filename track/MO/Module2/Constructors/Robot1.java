import java.util.Scanner;

// Main class placed on top
public class Main {
    public static void main(String[] args) {
        // Create one Robot object
        Robot r = new Robot();
    }
}

// Robot class placed below
class Robot {
    Robot() {
        // Print the message inside constructor
        System.out.println("Beep beep! Robot reporting for Java duty!");
    }
}