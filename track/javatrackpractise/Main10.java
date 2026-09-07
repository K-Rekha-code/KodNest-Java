import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputName = sc.next();

        Employee emp = new Employee();
        emp.name = inputName;

        emp.displayProfile(); // Added call
        sc.close();           // Close scanner
    }
}
class Employee {
    String name;
    String role;

    // Constructor inside class
    Employee() {
        role = "Trainee";
    }

    // Method inside class
    void displayProfile() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Role: " + role);
    }
} // <--- Employee class ends HERE

