import java.util.Scanner;

public class Array25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read first array
        int size1 = sc.nextInt();
        int[] a = new int[size1];
        for (int i = 0; i < size1; i++) {
            a[i] = sc.nextInt();
        }

        // Read second array
        int size2 = sc.nextInt();
        int[] b = new int[size2];
        for (int i = 0; i < size2; i++) {
            b[i] = sc.nextInt();
        }

        // 1. If lengths differ, arrays cannot be identical
        if (size1 != size2) {
            System.out.println(0);
            return;
        }

        // 2. Compare elements at each corresponding index
        for (int i = 0; i < size1; i++) {
            if (a[i] != b[i]) {
                System.out.println(0);
                return;
            }
        }

        // 3. If no mismatches were found
        System.out.println(1);
    }
}