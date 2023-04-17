import java.util.Scanner;
public class FactorialPermutationCombination {
    public static void main(String[] args) {
        //Practical Part
        int number, n, r,factorial = 1, permutation = 1, combination = 1, nfactorial = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to take factorial.");
        number = input.nextInt();
        for (int i = 1; i <= number; i++)
        {
            factorial *= i;
        }
        System.out.println(number + "! equals to " + factorial);
        //Homework Part
        System.out.println("Enter the count of element in set.");
        n = input.nextInt();
        System.out.println("Enter the count of permutation and combination.");
        r = input.nextInt();
        for (int i = 1; i <= n; i++)
        {
            nfactorial *= i;
        }
        for (int j = 1; j <= (n - r); j++)
        {
            combination *= j;
        }
        for (int k = 1; k <= r; k++)
        {
            permutation *= k;
        }
        System.out.println(n + " of " + r + " permutation is: " + (nfactorial / permutation));
        System.out.println(n + " of " + r + " combination is: " + (nfactorial / (combination * permutation)));

    }
}
