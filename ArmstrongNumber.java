import java.util.Scanner;
public class ArmstrongNumber
{
    public static void main(String[] args) {
        int number, digit = 10, i = 1, totalNum = 0, sumOfBase = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number.");
        number = input.nextInt();
        // To count number of digits.
        int temp = number;
        String numberStr = String.valueOf(number);
        int digitCount = numberStr.length();
        //To count number of digits.
        while (number % (digit/10) != number)
        {
            int base = (temp % digit)/(digit / 10);
            sumOfBase += base;
            System.out.println(i + ". digit of " + number + " is: " + base);
            temp -= (temp % digit);
            totalNum += (int) Math.pow(base,digitCount); // Taking exponential of a number.
            digit *= 10;
            i++;
        }
        if ( number == totalNum)
        {
            System.out.println(number + " is an Armstrong number.");
        }
        else
        {
            System.out.println(number + " is not an Armstrong number.");
        }
        System.out.println("Summary of digits is: " + sumOfBase);
    }
}
