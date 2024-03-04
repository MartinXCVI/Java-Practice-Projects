import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How much can you spend? Enter your budget:");
        double userBudget = scanner.nextDouble();
        double totalSum = 0;
        int i = 0; // item index
        ArrayList<Double> proportion = new ArrayList<Double>();

        System.out.println("Enter your proportion of various expenses.");
        System.out.println("The program will stop when the 100% of the accumulative proportion is reached.");
        do {
            System.out.println("Your proportion of expense n° " + (i + 1) + ":");
            double userValue = scanner.nextDouble();
            proportion.add(userValue);
            totalSum += proportion.get(i);
            i++;
        } while(totalSum <= 100);
        scanner.close();

        if(totalSum > 100) {
            double accumulativeSum = 0.0;
            for(int j = 0; j < proportion.size() - 1; j++) {
                accumulativeSum += proportion.get(j);
            }
            proportion.set(proportion.size() - 1, 100.0 - accumulativeSum);
        }
        System.out.println("---------------------------------------");
        for(double value : proportion) {
            double expense = value * userBudget / 100.0;
            System.out.println("Your " + value + "% equals $" + expense);
        }
    }
}
