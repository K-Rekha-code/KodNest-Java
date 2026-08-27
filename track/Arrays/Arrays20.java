import java.util.Scanner;

public class Array20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int size = scanner.nextInt();
        int evenCount = 0;
        int oddCount = 0;
        
        for (int i = 0; i < size; i++) {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        System.out.println(evenCount + " " + oddCount);
        
        scanner.close();
    }
}