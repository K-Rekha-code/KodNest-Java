
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Read input values
        String name = scanner.nextLine();
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        // 2. Create MethodDemo object
        MethodDemo m = new MethodDemo();

        // 3. Call all four methods and display output
        m.sayHello();
        m.greet(name);

        int luckyNumber = m.getLuckyNumber();
        System.out.println("Lucky Number: " + luckyNumber);

        int sum = m.add(first, second);
        System.out.println("Sum: " + sum);

        scanner.close();
    }
}

class MethodDemo {

    void sayHello() {
        System.out.println("Hello from a method!");
    }

    void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    int getLuckyNumber() {
        return 7;
    }

    int add(int first, int second) {
        return first + second;
    }
}
