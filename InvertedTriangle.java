import java.util.Scanner;
public class InvertedTriangle
{
    public static void main(String[] args)
    {
        int digit;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number.");
        digit = input.nextInt();
        for (int i = digit; i >= 1; i--)
        {
            // Inner loop print space
            for(int j = i; j < digit; j++)
            {
                System.out.print(" ");
            }

            // Inner loop print star
            for(int j = 1; j <= (2 * i - 1); j++)
            {
                System.out.print("*");
            }

            // Ending line after each row
            System.out.println("");
        }
    }
}
