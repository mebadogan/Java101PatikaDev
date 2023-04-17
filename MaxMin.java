import java.util.Scanner;
public class MaxMin
{
    public static void main(String[] args)
    {
        int count, number, maximum = 0, minimum = 0, i = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers you are going to enter?");
        count = input.nextInt();
        while (count > 0)
        {
            System.out.println("Enter the " + i + ". number.");
            number = input.nextInt();
            if (number > maximum)
            {
                maximum = number;
            }
            if (number < minimum)
            {
                minimum = number;
            }
            i++;
            count--;
        }
        System.out.println("The smallest number that you have entered is: " + minimum);
        System.out.println("The biggest number that you have entered is: " + maximum);
    }
}
