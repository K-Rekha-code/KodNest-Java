
public class static2 {

    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Demo d3 = new Demo();
        Demo d4 = new Demo();
        Demo d5 = new Demo();
        Demo d6 = new Demo();
        Demo d7 = new Demo();
        System.out.println(Demo.count);
    }
}

class Demo {

    static int count;

    Demo() {
        count++;
    }
}
