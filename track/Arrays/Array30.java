import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("No second smallest distinct value");
            return;
        }
        
        long smallest = Long.MAX_VALUE;
        long secondSmallest = Long.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            long num = sc.nextLong();
            
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num > smallest && num < secondSmallest) {
                secondSmallest = num;
            }
        }
        
        if (secondSmallest == Long.MAX_VALUE) {
            System.out.println("No second smallest distinct value");
        } else {
            System.out.println(secondSmallest);
        }
    }
}