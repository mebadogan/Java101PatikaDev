import java.util.Scanner;
public class CalculationsWithNumber {
    public static void main(String[] args) {
        //Practical Part
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number.");
        number = input.nextInt();
        for (int i = 1; i <= number; i++)
        {
            if (i % 2 == 0)
            {
                System.out.println(i + " is even.");

            } else if (i % 2 != 0)
            {
                System.out.println(i + " is odd.");

            }
        }
        //Homework Part
        int sumOfNumbers = 0, count = 0;
        for (int j = 0; j <= number; j++ )
        {
            if ((j % 3 == 0) && (j % 4 == 0))
            {
                sumOfNumbers += j;
                count += 1;
            }
        }
        System.out.println(sumOfNumbers / count);
    }
}
