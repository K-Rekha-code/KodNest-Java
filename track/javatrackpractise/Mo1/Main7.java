import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distance = scanner.nextInt();
        int expressFee = scanner.nextInt();

        DeliveryCalculator d = new DeliveryCalculator();

        int standardCharge = d.calculateCharge(distance);
        int expressCharge = d.calculateCharge(distance, expressFee);

        System.out.println("Standard Charge: " + standardCharge + " Express Charge: " + expressCharge);

        scanner.close();
    }
}

class DeliveryCalculator {
    int calculateCharge(int distance) {
        return distance * 5;
    }

    int calculateCharge(int distance, int expressFee) {
        return distance * 5 + expressFee;
    }
}
