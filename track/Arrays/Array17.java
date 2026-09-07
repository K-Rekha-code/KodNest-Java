import java.util.Scanner;

public class Array17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Read the array size
        int n = scanner.nextInt();
        
        // 2. Declare and initialize array with size n
        int[] arr = new int[n];
        
        // 3. Populate array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // 4. Print elements separated by a single space
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(arr[i]);
        }
        
        scanner.close();
    }
}