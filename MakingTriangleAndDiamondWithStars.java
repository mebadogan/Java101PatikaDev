import java.util.Scanner;
public class MakingTriangleAndDiamondWithStars {
    public static void main(String[] args)
    {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number.");
        n = input.nextInt();

        for(int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n-i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= ((2*i)-1); k++)
            {
                System.out.print("*");
            }
            for (int j = 1; j <= n-i; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
        int i = 1;
        while(i < n)
        {
            int j = 0;
            while(j < i)
            {
                System.out.print(" ");
                j++;
            }
            int k = 2*n -1;
            while (k >= 2*i+1)
            {
                System.out.print("*");
                k--;
            }
            System.out.println();

            i++;
        }
    }
}
