
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();
        String keyword = scanner.nextLine();

        String normalizeSentence = sentence.trim().toLowerCase();
        String normalizedKeyword = keyword.trim().toLowerCase();

        System.out.println("Normalized text: " + normalizeSentence);
        System.out.println("Contains keyword: " + normalizeSentence.contains(normalizedKeyword));
    }
}
