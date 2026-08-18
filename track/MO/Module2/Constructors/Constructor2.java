import java.util.Scanner;

public class Constructor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the full name
        String name = scanner.nextLine();
        
        // Create one Student object
        Student s1 = new Student(name);
        
        // Call display
        s1.display();
    }
}

class Student {
    String name;

    // Constructor to store parameter in instance variable
    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Student Name: " + name);
    }
}