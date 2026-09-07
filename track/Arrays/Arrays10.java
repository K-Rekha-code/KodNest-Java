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
        
        // Initialize min and max with the first element
        int min = numbers[0];
        int max = numbers[0];
        
        // Traverse remaining elements to find min and max
        for (int i = 1; i < size; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        
        // Print results
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        
        scanner.close();
    }
}