import java.util.Scanner;
public class PowerOfNumbers {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number.");
        number = input.nextInt();
        System.out.println("Power of 2.");
        for (int i = 1; i <= number; i *= 2)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Power of 4.");
        for (int j = 1; j <= number; j *= 4)
        {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("Power of 5.");
        for (int k = 1; k <= number; k *= 5)
        {
            System.out.print(k + " ");
        }

    }
}
