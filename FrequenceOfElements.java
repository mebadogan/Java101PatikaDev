import java.util.Arrays;

public class FrequenceOfElements {
    public static void main(String[] args) {
        //int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        //int[] arr = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1};
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5};
        int count = 1;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++){
            if (i != arr.length-1){
                if (arr[i] == arr[i+1]){
                    count++;
                }
                else{
                    System.out.println(arr[i] + " repeated " + count + " times.");
                    count = 1;
                }
            }
            else{
                System.out.println(arr[i] + " repeated " + count + " times.");
            }
        }

    }
}
