
import java.util.Scanner;

public class String5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read full name and city using nextLine() to preserve spaces
        String learnerName = scanner.nextLine();
        String city = scanner.nextLine();

        // Display the required output
        System.out.println("Name: " + learnerName);
        System.out.println("City: " + city);
        System.out.println("Name length: " + learnerName.length());

        scanner.close();
    }
}
