import java.util.Scanner;

public class GuessTheNumber
{
    public static void main(String[] args)
    {
        int targetNumber = (int) (Math.random() * 20);
        int query = 5, index = 1, userGuess;
        Scanner input = new Scanner(System.in);
        System.out.println("You have " + query + " guess right.");


        while (query >= 0)
        {
            System.out.println("Enter your guess.");

            while (!input.hasNextInt())
            {
                System.out.println("Invalid input. Enter an integer.");
                input.next(); // Consume the invalid input
            }
            userGuess = input.nextInt();

            if (userGuess == targetNumber){
                System.out.println("Your guess is right! Congrats...");
                break;
            }
            else if (userGuess != targetNumber && query > 0)
            {
                if (userGuess > targetNumber){
                    System.out.println("Your guess is bigger than the number. Try again...");
                    query--;
                    if (query == 0){
                        System.out.println("You could not guess the number. The number was " +targetNumber);
                        System.out.println("GAME OVER");
                        break;
                    }
                }
                else if (userGuess < targetNumber){
                    System.out.println("Your guess is smaller than the number. Try again...");
                    query--;
                    if (query == 0){
                        System.out.println("You could not guess the number. The number was " + targetNumber);
                        System.out.println("GAME OVER");
                        break;
                    }
                }

            }

        }

    }
}
