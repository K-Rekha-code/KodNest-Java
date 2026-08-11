
class Employee {

    int id;
    String name;

    void working() {
        System.out.println("Employee is working");

    }
}

public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 1;
        e1.name = "Raja";

        System.out.println(e1.id);
        System.out.println(e1.name);
        Employee e2 = e1;
        e2.id = 2;
        e2.name = "Rani";

        System.out.println(e2.id);
        System.out.println(e2.name);

        System.out.println(e1.id);
        System.out.println(e1.name);
    }
}
