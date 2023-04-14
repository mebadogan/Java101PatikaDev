import java.util.Scanner;
public class CalculatingCircleEnvironments {
    public static void main(String[] args) {
        //Practice Part
        float pi = 3.14f;
        int radius;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle.");
        radius = input.nextInt();
        double area = pi * radius * radius;
        double circumference = 2 * pi * radius;
        //Homework Part
        double centralAngle;
        System.out.println("Enter the central-angle of the circle.");
        centralAngle = input.nextDouble();
        double sectorArea = pi * radius * radius * centralAngle / 360;
        System.out.println("The Circle\'s area is: " + area);
        System.out.println("The Circle\'s circumference is: " + circumference);
        System.out.println("The Circle\'s area of a sector is: " + sectorArea);

    }
}
