import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read student full name and two integer scores
        String name = scanner.nextLine();
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        // Create one Student object
        Student s1 = new Student();

        // Store and print the name
        s1.setName(name);
        s1.showName();

        // Call both showScore() methods
        s1.showScore(first);
        s1.showScore(first, second);

        scanner.close();
    }
}

class Student {
    String name;

    void setName(String name) {
        this.name = name;
    }

    void showName() {
        System.out.println("Student Name: " + this.name);
    }

    void showScore(int first) {
        System.out.println("First Score: " + first);
    }

    void showScore(int first, int second) {
        System.out.println("Two-Score Total: " + (first + second));
    }
}