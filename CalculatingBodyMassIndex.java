import java.util.Scanner;
public class CalculatingBodyMassIndex {
    public static void main(String[] args) {
        double height;
        int weight;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your height.");
        height = input.nextDouble();
        System.out.println("Enter your weight.");
        weight = input.nextInt();
        double bodyMassIndex = (weight / (height * height));
        System.out.println("Your body mass index is: " + bodyMassIndex);
    }
}
