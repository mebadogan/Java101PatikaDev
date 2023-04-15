import java.util.Scanner;
public class EventDepensWeather {
    public static void main(String[] args) {
        int warmth;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the warmth of the weather.");
        warmth = input.nextInt();

        if (warmth < 5){
            System.out.println("You can go for skiing.");
        }
        if (warmth >= 5 && warmth <= 15){
            System.out.println("You can go to cinema.");
        }
        if (warmth >= 10 && warmth <= 25){
            System.out.println("You can go to picnic.");
        }
        if (warmth > 25) {
            System.out.println("You can go to the pool.");
        }
    }
}
