import java.util.Scanner;
public class AtmProject
{
    public static void main(String[] args)
    {
        String userName, password;
        int balance = 1500, right = 3, selection = 0, money;
        Scanner input = new Scanner(System.in);
        do
        {
            System.out.println("Enter your username.");
            userName = input.nextLine();
            System.out.println("Enter your password.");
            password = input.nextLine();
            boolean success = userName.equals("patika") && password.equals("dev123");
            switch (Boolean.toString(success))
            {
                case ("true"):
                    System.out.println("Welcome to the BABO bank.");
                    do
                    {
                        System.out.println("1- Deposit\n" + "2- Withdraw\n" + "3- Balance Inquiry\n" + "4- Exit");
                        selection = input.nextInt();
                        switch (selection)
                        {
                            case 1:
                                System.out.println("How much money you want to deposit?");
                                money = input.nextInt();
                                balance += money;
                                System.out.println(money + " has deposited. Your current balance is " + balance);
                                break;
                            case 2:
                                System.out.println("How much money you want to withdraw?");
                                money = input.nextInt();
                                balance -= money;
                                System.out.println(money + " has withdrawen. Your current balance is " + balance);
                                break;
                            case 3:
                                System.out.println("Your current balance is: ");
                                System.out.println(balance);
                                break;
                        }
                    } while (selection != 4);
                    System.out.println("Have a nice day.");
                    break;
                default:
                    System.out.println("Wrong username or password. Try again.");
                    right--;
                    switch (right)
                    {
                        case 0:
                            System.out.println("Your account has been blocked. Contact your customer service.");
                            break;
                        default:
                            System.out.println("You have " + right + " right left.");
                    }
            }
        }while (right > 0 && selection != 4);
    }
}