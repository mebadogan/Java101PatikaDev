import java.util.Scanner;
public class OddNumbersSummation {
    public static void main(String[] args) {
        //Practical Part
        int number, total = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter a number. ");
            number = input.nextInt();
            if (number % 2 != 0)
            {
                total += number;
            }
        }while (number >= 0);
        System.out.println("Total of even numbers is: " + total);

        //Homework Part
        int num, sum = 0;
        do {
            System.out.println("Enter a number.");
            num = input.nextInt();
            if (num % 2 == 0 && num % 4 == 0)
            {
                sum += num;
            }
        }while (num % 2 == 0);
        System.out.println("Total of even and power of four numbers is: " + sum);
    }
}
