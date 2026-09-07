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
        
        // Read search target
        int target = scanner.nextInt();
        
        boolean found = false;
        
        // Linear search for target
        for (int i = 0; i < size; i++) {
            if (numbers[i] == target) {
                found = true;
                break; // Stop after first match
            }
        }
        
        // Output search result
        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
        
        // Output elements in reverse order without modifying the array
        System.out.print("Reverse order:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(" " + numbers[i]);
        }
        System.out.println();
        
        scanner.close();
    }
}