import java.sql.Array;

public class FindingRepeatingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1};
        int countN = 0, tempN = 0, numberN = 0, countE = 0, tempE = 0, numberE = 0, countO = 0, tempO = 0, numberO = 0;
        for (int i = 0; i < arr.length; i++){
            if (tempN > countN){
                countN = tempN;
                tempN = 0;
                numberN = arr[i-1];
            }
            else{
                tempN = 0;
            }
            if (tempO > countO){
                countO = tempO;
                tempO = 0;
                numberO = arr[i-1];
            }
            else{
                tempO = 0;
            }
            if (tempE > countE){
                countE = tempE;
                tempE = 0;
                numberE = arr[i-1];
            }
            else{
                tempE = 0;
            }
            for ( int j = 0; j < arr.length; j++){
                if (arr[i] == arr[j] && arr[i] % 2 == 0){
                    tempE++;
                }
                if (arr[i] == arr[j] && arr[i] != 0){
                    tempO++;
                }
                if (arr[i] == arr[j]){
                    tempN++;
                }
            }
        }
        System.out.println("The most repetitive number is " + numberN + ". The number of repetitions of " + numberN + " is " + countN + ".");
        System.out.println("The most repetitive even number is " + numberE + ". The number of repetitions of " + numberE + " is " + countE + ".");
        System.out.println("The most repetitive odd number is " + numberO + ". The number of repetitions of " + numberO + " is " + countO + ".");
    }
}
