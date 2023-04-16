import java.util.Scanner;
public class ChineseHoroscope {
    public static void main(String[] args) {
        int birthYear, mod;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your birth year.");
        birthYear = input.nextInt();
        mod = birthYear % 12;
        switch (mod)
        {
            case 0:
                System.out.println("Your Chinese horoscope is Monkey.");
                break;
            case 1:
                System.out.println("Your Chinese horoscope is Cockerel.");
                break;
            case 2:
                System.out.println("Your Chinese horoscope is Dog.");
                break;
            case 3:
                System.out.println("Your Chinese horoscope is Pig.");
                break;
            case 4:
                System.out.println("Your Chinese horoscope is Mouse.");
                break;
            case 5:
                System.out.println("Your Chinese horoscope is Bull.");
                break;
            case 6:
                System.out.println("Your Chinese horoscope is Tiger.");
                break;
            case 7:
                System.out.println("Your Chinese horoscope is Rabbit.");
                break;
            case 8:
                System.out.println("Your Chinese horoscope is Dragon.");
                break;
            case 9:
                System.out.println("Your Chinese horoscope is Snake.");
                break;
            case 10:
                System.out.println("Your Chinese horoscope is Horse.");
                break;
            case 11:
                System.out.println("Your Chinese horoscope is Sheep.");
                break;
            default:
                System.out.println("You have entered invalid value.");
        }
    }
}
