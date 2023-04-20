public class WritingB{
    public static void main(String[] args) {
        String[][] arr = new String[28][5];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (j == 0){
                    arr[i][j] = "*";
                }
                else if (j == 1){
                    if (i == 0 || i == 1 || i == 13 || i == 14 || i == 26 || i == 27){
                        arr[i][j] = "*";
                    }
                    else {
                        arr[i][j] = " ";
                    }
                }
                else if (j == 2){
                    if (i == 0 || i == 1 || i == 13 || i == 14 || i == 26 || i == 27){
                        arr[i][j] = "*";
                    }
                    else {
                        arr[i][j] = " ";
                    }
                }
                else if (j == 3){
                    if (i == 1 || i == 2 || i == 11 || i == 12 || i == 13 || i == 14 || i == 15 || i == 16 || i == 25 || i == 26){
                        arr[i][j] = "*";
                    }
                    else {
                        arr[i][j] = " ";
                    }
                }
                else if (j == 4){
                    if ((i >= 2 && i <= 11) || (i >= 16 && i <= 25)){
                        arr[i][j] = "*";
                    }
                    else{
                        arr[i][j] = " ";
                    }
                }
            }
        }
        for ( String[] row : arr){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
