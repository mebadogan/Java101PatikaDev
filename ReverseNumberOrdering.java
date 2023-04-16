import java.util.Scanner;
public class ReverseNumberOrdering {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number.");
        a = input.nextInt();
        System.out.println("Enter the second number.");
        b = input.nextInt();
        System.out.println("Enter the third number.");
        c = input.nextInt();

        if ((a < b) && (a < c))
        {
            if (b < c)
            {
                System.out.println("a < b < c");
            } else if (c < b)
            {
                System.out.println("a < c < b");
            }
        }

        else if ((b < a) && (b < c))
        {
            if (a < c)
            {
                System.out.println("b < a < c");
            } else if (c < a)
            {
                System.out.println("b < c < a");
            }
        }

        else if ((c < a) && (c < a))
        {
            if (a < b)
            {
                System.out.println("c < a < b");
            } else if (b < a)
            {
                System.out.println("c < b < a");
            }
        }
    }
}
