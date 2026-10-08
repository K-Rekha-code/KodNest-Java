
public class Static3 {

    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Demo d3 = new Demo();

    }
}

class Demo {

    static {
        System.out.println("static1 block");
    }

    static {
        System.out.println("static2 block");
    }

    {
        System.out.println("Non 1 static block");
    }

    {
        System.out.println("Non 2 static block");

    }

}
}
