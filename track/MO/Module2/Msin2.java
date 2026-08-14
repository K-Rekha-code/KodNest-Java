import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read one number and one word
        int number = scanner.nextInt();
        String name = scanner.next();

        // Create Printer object and call methods
        Printer p = new Printer();
        p.show(number);
        p.show(name);

        scanner.close();
    }
}

class Printer {
    void show(int number) {
        System.out.println("Number: " + number);
    }

    void show(String word) {
        System.out.println("Word: " + word);
    }
}