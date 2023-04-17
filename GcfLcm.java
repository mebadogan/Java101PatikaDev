import java.util.Scanner;
public class GcfLcm {
    public static void main(String[] args)
    {
        int number1, number2, gcf = 1, lcm = 1, minimum, i = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number.");
        number1 = input.nextInt();
        System.out.println("Enter the second number.");
        number2 = input.nextInt();
        minimum = Math.min(number1,number2);

        //GCF
        while(minimum >= 1)
        {
            if (number1 % minimum == 0 && number2 % minimum ==0)
            {
                gcf = minimum;
                break;
            }
            minimum--;
        }
        System.out.println("Greatest Common Factor: " + gcf);

        //LCM
        while (i <= (number1 * number2))
        {
            if (i % number1 == 0 && i % number2 == 0)
            {
                lcm = i;
                break;
            }
            i++;
        }
        System.out.println("Lowest Common Multiple: " + lcm);
    }
}
