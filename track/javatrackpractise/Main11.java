import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        String name = sc.next();
        String department = sc.next();

        Employee emp = new Employee(id, name, department);
        emp.displayProfile();

        sc.close();
    }
}
class Employee {
    int id;
    String name;
    String department;

    // Parameterized constructor
    Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Method to display profile details
    void displayProfile() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
    }
}

