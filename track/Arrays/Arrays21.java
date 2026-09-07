import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] a = new int[n];
        
        // Read input array elements
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        
        // Initialize min and max with the first element
        int min = a[0];
        int max = a[0];
        
        // Traverse to find min and max
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }
        }
        
        // Print min followed by max separated by a space
        System.out.println(min + " " + max);
        
        scanner.close();
    }
}