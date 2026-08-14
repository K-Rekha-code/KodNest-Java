import java.util.Scanner;



public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read three marks
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        // Create one ResultCalculator object
        ResultCalculator r = new ResultCalculator();

        // Call both overloaded methods
        int a = r.getTotal(first, second);
        int b = r.getTotal(first, second, third);

        // Print both totals
        System.out.println("Two-Mark Total: " + a);
        System.out.println("Three-Mark Total: " + b);

        scanner.close();
    }
}
class ResultCalculator {
    // Method to calculate total of two marks
    int getTotal(int first, int second) {
        return first + second;
    }

    // Overloaded method to calculate total of three marks
    int getTotal(int first, int second, int third) {
        return first + second + third;
    }
}