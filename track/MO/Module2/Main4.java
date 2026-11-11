
import java.util.*;

class Main4 {

    public static void main(String[] args) {
        System.out.println("Method execution stated.......");
        divide();
        System.out.println("Methode execution ended........");
    }  

    static void divide() {
        try {
            System.out.println("dividion  started....");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a / b;
            System.out.println(res);

        } catch (Exception e) {
            System.out.println("Exception handled");
        }
        System.out.println("division completed");
    }

}

