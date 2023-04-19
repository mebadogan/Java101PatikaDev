import java.util.Scanner;
public class PowerOfNumber {
    static int Power(int base, int exponent){
        int result = 1;
        if (exponent == 1){
            return base;
        }
        return result = base * Power(base, exponent -1);
    }
    public static void main(String[] args) {
        int base, exponent;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number.");
        base = input.nextInt();
        System.out.println("Enter the exponent of number.");
        exponent = input.nextInt();
        int rst = Power(base, exponent);
        System.out.println(rst);
    }
}
