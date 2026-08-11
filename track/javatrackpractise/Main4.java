
import java.util.Scanner;

class PracticeProfile {

    // Declare fields
    String name;
    int points;
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read inputs
        String name = scanner.next();
        int points = scanner.nextInt();
        int boostPoints = scanner.nextInt();
        int correctionPoints = scanner.nextInt();

        // 1. Create live object
        PracticeProfile live = new PracticeProfile();
        live.name = name;
        live.points = points;

        // 2. Create alias reference pointing to live
        PracticeProfile alias = live;

        // 3 & 4. Add boost and cap at 100
        alias.points += boostPoints;
        if (alias.points > 100) {
            alias.points = 100;
        }

        // 5 & 6. Create independent checkpoint object with copied values
        PracticeProfile checkpoint = new PracticeProfile();
        checkpoint.name = live.name;
        checkpoint.points = live.points;

        // 7 & 8. Subtract correction from live and floor at 0
        live.points -= correctionPoints;
        if (live.points < 0) {
            live.points = 0;
        }

        // 9. Output results
        System.out.println("Live: " + live.name + " " + live.points);
        System.out.println("Alias: " + alias.name + " " + alias.points);
        System.out.println("Checkpoint: " + checkpoint.name + " " + checkpoint.points);
    }
}
