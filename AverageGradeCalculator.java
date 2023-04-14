import java.util.Scanner;
public class AverageGradeCalculator {
    public static void main(String[] args) {
        int math,phy,che,tur,his,mus;
        int numOfClasses = 6;
        int averageGrade;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Math Grade.");
        math = input.nextInt();
        System.out.println("Enter Your Physics Grade.");
        phy = input.nextInt();
        System.out.println("Enter Your Chemistry Grade.");
        che = input.nextInt();
        System.out.println("Enter Your Turkish Grade.");
        tur = input.nextInt();
        System.out.println("Enter Your History Grade.");
        his = input.nextInt();
        System.out.println("Enter Your Music Grade.");
        mus = input.nextInt();

        int sumOfGrades = math + phy +che + tur + his + mus;
        averageGrade = sumOfGrades/numOfClasses;
        System.out.println("Your Average Grade is " + averageGrade + ".");
        String str = (averageGrade < 60) ? "failed":"passed";
        System.out.println("You " + str + " the class.");
    }
}
