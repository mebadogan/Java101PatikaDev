import java.util.Scanner;
public class PrimeNumber
{
    static boolean PrimeChecker(int number, int divider){
        if (number < 2) {
            return false;
        }
        if (number == 2){
            return true;
        }
        if (number % divider == 0) {
            return false;
        }
        if (divider * divider > number){
            return true;
        }
        return PrimeChecker(number,divider + 1);
    }

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number.");
        number = input.nextInt();
        System.out.println(PrimeChecker(number, 2));
    }
}
