import java.util.Scanner;
public class CalculatingHypotenuse {
    public static void main(String[] args) {
        int edgeX, edgeY;
        double hyp;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first edge length.");
        edgeX = input.nextInt();
        System.out.println("Enter the second edge length.");
        edgeY = input.nextInt();
        hyp = Math.sqrt(edgeX * edgeX + edgeY * edgeY);
        System.out.println("The hypotenuse length of the right triangle is: " + hyp);
    }
}
