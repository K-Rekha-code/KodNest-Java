
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

// Create a builder, reverse it and display the result.
        StringBuilder sb = new StringBuilder(text);
        sb.reverse();
        System.out.println("Reversed: " + sb);

    }
}
