import java.util.Scanner;

public class Array28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int maxCount = 0;
        int currentCount = 0;
        
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            
            if (num == 1) {
                currentCount++;
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
            } else {
                currentCount = 0;
            }
        }
        
        System.out.println(maxCount);
    }
}