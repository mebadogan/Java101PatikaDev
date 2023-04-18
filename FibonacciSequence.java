import java.util.Scanner;
public class FibonacciSequence
{
    public static void main(String[] args)
    {
        int count, first = 0, second = 1,temp = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the count of the fibonacci elements.");
        count = input.nextInt();
        System.out.print("0 1 ");
        for (int i = 1; i < count; i++)
        {
            temp = first + second;
            System.out.print(temp + " ");
            first = second;
            second = temp;
        }

    }
}
