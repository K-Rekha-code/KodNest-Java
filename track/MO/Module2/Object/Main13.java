
public class Main13 {

    public static void main(String[] args) {
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();
        accessMethods(c1);
        accessMethods(c2);

    }

    public static void accessMethods(Parent p) {
        p.display1();
        p.display2();
        if (p instanceof Child1) {
            ((Child1) (p)).display3();
        }
        if (p instanceof Child2) {
            ((Child2) (p)).display3();
        }
    }
}

class Parent {

    void display1() {
        System.out.println("I am inside a parent class method 1");
    }

    void display2() {
        System.out.println("I am inside a parent class method 2");
    }
}

class Child1 extends Parent {

    @Override
    void display2() {
        System.out.println("I am inside a child1 class method (inherited menthod) ");
    }

    void display3() {
        System.out.println("I am inside a child1 class method (child specified method)");
    }
}

class Child2 extends Parent {

    @Override
    void display2() {
        System.out.println("I am inside a child2 class method (inherited menthod) ");
    }

    void display3() {
        System.out.println("I am inside a child2 class method (child2 specified method)");
    }
}
