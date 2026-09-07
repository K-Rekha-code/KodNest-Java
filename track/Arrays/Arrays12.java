import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read array size
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        // Read array elements
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Read target value
        int target = scanner.nextInt();

        int count = 0;

        // Count occurrences of the target value
        for (int i = 0; i < size; i++) {
            if (numbers[i] == target) {
                count++;
            }
        }

        // Print frequency output
        System.out.println("Frequency of " + target + ": " + count);

        scanner.close();
    }
}