import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] readings = new int[5];
        
        // Loop 1: Read the five values into the array
        for (int i = 0; i < 5; i++) {
            readings[i] = scanner.nextInt();
        }
        
        int total = 0;
        
        // Loop 2: Add every array value to total
        for (int i = 0; i < 5; i++) {
            total += readings[i];
        }
        
        // Print the final total
        System.out.println("Total: " + total);
        
        scanner.close();
    }
}