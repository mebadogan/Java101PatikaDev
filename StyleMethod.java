import java.util.Scanner;

public class StyleMethod {
    static void Design(int number, boolean isTrue, int stc){

        if (number > 0 && isTrue==true){
            number -= 5;
            System.out.print(number + " ");
            Design(number,isTrue,stc);
        }
        else if (number <= 0 && isTrue==true){
            isTrue = false;
            number += 5;
            System.out.print(number + " ");
            Design(number,isTrue,stc);
        }
        else if (number > 0 && isTrue==false && number != stc){
            number += 5;
            System.out.print(number + " ");
            Design(number,isTrue,stc);
        }
        else if (number > 0 && isTrue==false && number == stc){
            System.out.print("");
        }

    }
    public static void main(String[] args) {
        int number, stc;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number.");
        number = input.nextInt();
        stc = number;
        boolean neverTurned = true;
        System.out.print(number + " ");
        Design(number, neverTurned, stc);

    }
}
