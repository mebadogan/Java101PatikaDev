import java.util.Scanner;
public class PalindromeNumber
{
    static boolean isPalindrome(int number)
    {
        int count = 1, base = 10, temp = number, reverse = 0;

        while (number % base != number)
        {
            base *= 10;
            count++;
        }
        base = 10;
        while (count >= 1)
        {
            reverse += (temp % base) * Math.pow(10,count-1);
            temp = (temp - (temp % base)) / 10;
            count--;
        }
        return (number == reverse) ? true:false;
    }
    public static void main(String[] args)
    {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number.");
        number = input.nextInt();
        boolean result = isPalindrome(number);
        System.out.println(result);
    }
}
