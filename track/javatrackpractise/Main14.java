import java.util.Scanner;

public class Main14{
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

        boolean found = false;

        // Perform linear search
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("First index: " + i);
                found = true;
                break;
            }
        }

        // If target is not found
        if (!found) {
            System.out.println("First index: -1");
        }

        scanner.close();
    }
}