import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] marks = new int[n];
        
        long sum = 0;

        for (int i = 0; i < marks.length; i++) {
            marks[i] = scanner.nextInt();
        }

        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }

        System.out.println(sum);

        double average = (double) sum / n;
        System.out.printf("%.2f\n", average);

        scanner.close();
    }
}