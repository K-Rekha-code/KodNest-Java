import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read First Student
        Student s1 = new Student();
        s1.id = scan.nextInt();
        s1.name = scan.next();
        s1.javaScore = scan.nextInt();

        // Read Second Student
        Student s2 = new Student();
        s2.id = scan.nextInt();
        s2.name = scan.next();
        s2.javaScore = scan.nextInt();

        // Print Records
        System.out.println(s1.id + " - " + s1.name + " - " + s1.javaScore);
        System.out.println(s2.id + " - " + s2.name + " - " + s2.javaScore);

        // Compare and Print Output
        if (s1.javaScore > s2.javaScore) {
            System.out.println(s1.name + " has the higher Java score.");
        } else if (s2.javaScore > s1.javaScore) {
            System.out.println(s2.name + " has the higher Java score.");
        } else {
            System.out.println("Both students have the same Java score.");
        }

        scan.close();
    }
}

class Student {
    int id;
    String name;
    int javaScore;
}