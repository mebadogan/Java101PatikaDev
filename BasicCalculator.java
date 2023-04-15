import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        int number1, number2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number.");
        number1 = input.nextInt();
        System.out.println("Enter the second number.");
        number2 = input.nextInt();
        System.out.println("What do you want to do? Enter one of them +,-,*,/");
        String operator;
        operator = input.next();
        switch (operator){

            case ("+"):
                System.out.println(number1 + " + " + number2 + " = " + (number1+number2));
                break;
            case ("-"):
                System.out.println(number1 + " - " + number2 + " = " + (number1-number2));
                break;
            case ("*"):
                System.out.println(number1 + " * " + number2 + " = " + (number1*number2));
                break;
            case ("/"):
                if (number2 != 0) {
                    System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
                    break;
                }
                else {
                    System.out.println("For Dividing process, the second number cannot be zero.");
                }
            default:
                System.out.println("Input error.");
        }

    }
}
