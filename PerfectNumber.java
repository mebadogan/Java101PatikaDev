import java.util.Scanner;
public class PerfectNumber
{
    public static void main(String[] args)
    {
        int number, total = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number.");
        number = input.nextInt();
        for ( int i = 1; i < number; i++)
        {
            if (number % i == 0 && i != number)
            {
                total += i;
            }

        }
        if (total == number)
        {
            System.out.println(number + " is a perfect number.");
        }
        else
        {
            System.out.println(number + " is not a perfect number.");
        }
    }
}
