import java.util.Scanner;
public class ClassPass {
    public static void main(String[] args) {
        int math, phys, turk, chem, music, totalGrade = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your math grade.");
        math = input.nextInt();
        System.out.println("Enter your phys grade.");
        phys = input.nextInt();
        System.out.println("Enter your turk grade.");
        turk = input.nextInt();
        System.out.println("Enter your chem grade.");
        chem = input.nextInt();
        System.out.println("Enter your music grade.");
        music = input.nextInt();
        totalGrade = (0 < math && math < 100) ? (totalGrade + math) : totalGrade;
        totalGrade = (0 < phys && phys < 100) ? (totalGrade + phys) : totalGrade;
        totalGrade = (0 < turk && turk < 100) ? (totalGrade + turk) : totalGrade;
        totalGrade = (0 < chem && chem < 100) ? (totalGrade + chem) : totalGrade;
        totalGrade = (0 < music && music < 100) ? (totalGrade + music) : totalGrade;
        double averageGrade = totalGrade / 5;
        String str = (averageGrade < 55) ? "failed" : "passed";
        System.out.println("Your average grade is: " + averageGrade + "." + " You " + str + " class.");

    }
}
