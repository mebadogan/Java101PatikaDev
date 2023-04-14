import java.util.Scanner;
public class TaxiMeter {
    public static void main(String[] args) {
        int openingFee = 10;
        int minFee = 20;
        double km;
        double kmRate = 2.20;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the distance you got.");
        km = input.nextDouble();
        double totalFee = openingFee + km * kmRate;
        double charge = (totalFee < minFee) ? 20:totalFee;
        System.out.println("Your Total Charge to Pay is: " + charge);

    }
}
