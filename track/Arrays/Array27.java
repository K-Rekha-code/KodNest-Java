import java.util.Scanner;

public class Array27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        long[] arr = new long[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        
        long target = sc.nextLong();
        
        long closestValue = arr[0];
        long minDiff = Math.abs(arr[0] - target);
        
        // Loop through the array to calculate currentDiff and compare
        for (int i = 1; i < n; i++) {
            long currentDiff = Math.abs(arr[i] - target);
            
            if (currentDiff < minDiff) {
                minDiff = currentDiff;
                closestValue = arr[i];
            } else if (currentDiff == minDiff) {
                if (arr[i] < closestValue) {
                    closestValue = arr[i];
                }
            }
        }
        
        // Print the final result
        System.out.println(closestValue);
    }
}