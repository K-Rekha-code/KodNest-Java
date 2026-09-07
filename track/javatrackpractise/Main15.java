import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read size and array elements
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Read target and replacement values
        int target = scanner.nextInt();
        int replacement = scanner.nextInt();

        int changeCount = 0;

        // Replace matches and count changes
        for (int i = 0; i < size; i++) {
            if (numbers[i] == target) {
                numbers[i] = replacement;
                changeCount++;
            }
        }

        // Output results
        System.out.println("Changes: " + changeCount);
        System.out.print("Updated array:");

        for (int i = 0; i < size; i++) {
            System.out.print(" " + numbers[i]);
        }

        System.out.println();
        scanner.close();
    }
}