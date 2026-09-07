import java.util.Scanner;

public class Array22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read size of array
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Read target value
        int target = scanner.nextInt();
        int answer = -1;

        // Find the first index of the target
        for (int i = 0; i < n; i++) {
            if (numbers[i] == target) {
                answer = i;
                break; // Stop after finding the first match
            }
        }

        // Output result
        System.out.println(answer);
        scanner.close();
    }
}