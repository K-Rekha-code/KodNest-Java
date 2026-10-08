
class Developer {

    void work() {
        System.out.println("Working");
    }

    void project() {
        System.out.println("Working on project");
    }
}

class JavaDeveloper extends Developer {

    @Override
    void project() {
        System.out.println("Working on java project");
    }

    @Override
    void work() {
        System.out.println("Working on java ");
    }
}

class PythonDeveloper extends Developer {

    @Override
    void project() {
        System.out.println("Working on python project");
    }

    @Override
    void work() {
        System.out.println("Working on python ");
    }
}

public class Main11 {

    public static void main(String[] args) {
        JavaDeveloper jd = new JavaDeveloper();
        Main11.accessMethods(jd);
        PythonDeveloper pd = new PythonDeveloper();
        Main11.accessMethods(pd);

    }

    public static void accessMethods(Developer d) {
        d.work();
        d.project();
    }
}
