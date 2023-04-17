import java.util.Scanner;
public class CalculationOfExponentialNumber {
    public static void main(String[] args) {
        int number, exponent,exponentialNumber = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number that you want to calculate exponent.");
        number = input.nextInt();
        System.out.println("Enter the exponent part that you want to calculate of it.");
        exponent = input.nextInt();
        for (int i = 1 ; i <= exponent; i++)
        {
            exponentialNumber *= number;
        }
        System.out.println("The exponential number is: " + exponentialNumber);

    }
}
