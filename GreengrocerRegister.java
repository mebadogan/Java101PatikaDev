import java.util.Scanner;
public class GreengrocerRegister {
    public static void main(String[] args) {
        double pear = 2.14;
        double apple = 3.67;
        double tomatoes = 1.11;
        double banana = 0.95;
        double eggplant = 5;
        Scanner input = new Scanner(System.in);
        System.out.println("How many kilograms of pear do you want?");
        int pearKG = input.nextInt();
        System.out.println("How many kilograms of apple do you want?");
        int appleKG = input.nextInt();
        System.out.println("How many kilograms of tomatoes do you want?");
        int tomatoesKG = input.nextInt();
        System.out.println("How many kilograms of banana do you want?");
        int bananaKG = input.nextInt();
        System.out.println("How many kilograms of eggplant do you want?");
        int eggplantKG = input.nextInt();
        double totalCharge = pear * pearKG + apple * appleKG + tomatoes * tomatoesKG + banana * bananaKG + eggplant * eggplantKG;
        System.out.println("Your total charge is: " + totalCharge);

    }
}
