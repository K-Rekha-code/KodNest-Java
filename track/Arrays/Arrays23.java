import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] a = new int[n];
        
        // --- ADD THIS LOOP TO READ THE ARRAY VALUES ---
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                positiveCount++;
            } else if (a[i] < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println(positiveCount + " " + negativeCount + " " + zeroCount);
        scanner.close();
    }
}