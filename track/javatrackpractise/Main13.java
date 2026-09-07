import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int days = scanner.nextInt();
        
        int[] planned = new int[days];
        int[] completed = new int[days];
        
        // Read planned question counts
        for (int i = 0; i < days; i++) {
            planned[i] = scanner.nextInt();
        }
        
        // Read completed question counts
        for (int i = 0; i < days; i++) {
            completed[i] = scanner.nextInt();
        }
        
        int completedDaysCount = 0;
        
        // Compare arrays and print status
        for (int i = 0; i < days; i++) {
            if (completed[i] >= planned[i]) {
                System.out.println("Day " + (i + 1) + ": Completed");
                completedDaysCount++;
            } else {
                System.out.println("Day " + (i + 1) + ": Pending");
            }
        }
        
        // Output total completed days
        System.out.println("Completed days: " + completedDaysCount);
        
        scanner.close();
    }
}