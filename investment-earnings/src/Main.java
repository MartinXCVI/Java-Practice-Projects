import java.util.Scanner;
import java.text.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter buying price per share:");
        double buyingPrice = scanner.nextDouble();
        int day = 1;
        double closingPrice = 0.1;
        DecimalFormat df = new DecimalFormat("0.00");

        while(true) {
            System.out.println("Enter the closing price for day " + day + " (Any negative value to leave)");
            closingPrice = scanner.nextDouble();

            if(closingPrice < 0) {
                break;
            }

            double earnings = closingPrice - buyingPrice;

            if(earnings > 0.0) {
                System.out.println("After day " + day + " you have earned " + df.format(earnings) + " per share.");
            } else if(earnings < 0.0) {
                System.out.println("After day " + day + " you have lost " + df.format(-earnings) + " per share.");
            } else {
                System.out.println("After day " + day + " you have no earnings per share.");
            }

            day += 1;
        }
        scanner.close();
    }
}