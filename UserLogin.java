import java.util.Scanner;
public class UserLogin {
    public static void main(String[] args) {
        String password = "mark3000", userName = "tony.stark";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username.");
        String userNameIN = input.nextLine();
        System.out.println("Enter your password.");
        String passwordIN = input.nextLine();
        if ((userName.equals(userNameIN)) && (password.equals(passwordIN))){
            System.out.println("Logged in successfuly.");
        }
        else{
            System.out.println("Your login credentials are incorrect.");
            System.out.println("Do you want to reset your password? Yes/No");
            String answer = (input.nextLine()).toLowerCase();
            switch (answer){

                case ("yes"):
                    System.out.println("Enter your new password.");
                    passwordIN = input.nextLine();
                    while (password.equals(passwordIN)){
                        System.out.println("Your new password cannot be exactly the same old password. Try again.");
                        passwordIN = input.nextLine();
                    }
                    System.out.println("Your password has just changed successfuly.");
            }
        }
    }
}
