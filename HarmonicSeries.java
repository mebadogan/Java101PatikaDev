import java.util.Scanner;
public class HarmonicSeries {
    public static void main(String[] args) {
        int number;
        double total = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number.");
        number = input.nextInt();
        for (double i = 1.0; i <= number; i++)
        {
            total += 1.0 / i;
        }
        System.out.println("Sum of harmonic series is: " + total);
    }
}
