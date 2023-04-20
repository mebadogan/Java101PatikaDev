import java.sql.Array;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayOrderer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the dimension of the array.");
        int dimension = input.nextInt();
        int[] arr = new int[dimension];

        for (int i = 0; i < arr.length; i++){
            System.out.println("Enter the " + (i + 1) + ". element.");
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);
        System.out.print("Increasing order of array : ");
        for (int j = 0; j < arr.length; j++){
            System.out.print(arr[j] + " ");
        }
    }
}
