import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {15,12,788,1,-1,-778,2,0};
        Arrays.sort(arr);
        System.out.println("Enter a number.");
        int number = input.nextInt();
        System.out.println("Entered number: " + number);
        for (int i = 0; i < arr.length; i++){
            if (number > arr[arr.length - 1]){
                System.out.println("The nearest element of the array which is smaller than the entered number. " + arr[arr.length-1]);
                System.out.println("The array has no element which is bigger than the entered number.");
                break;
            }
            else if (number < arr[0]){
                System.out.println("The nearest element of the array which is bigger than the entered number. " + arr[0]);
                System.out.println("The array has no element which is bigger than the entered number.");
                break;
            }
            else if(number > arr[i] && number < arr[i+1]){
                System.out.println("The nearest element of the array which is smaller than the entered number. " + arr[i]);
                System.out.println("The nearest element of the array which is bigger than the entered number. " + arr[i+1]);
            }
        }
    }
}