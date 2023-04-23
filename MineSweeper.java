import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class MineSweeper {
    public static void mineField(int rows, int columns,String[][] map)
    {
        int mineNumber = rows * columns / 4;
        Random randomMineNumber = new Random();
        for (int i = 0; i < rows;i++)
        {
            for(int j=0; j<columns;j++)
            {
                map[i][j] = "-";
            }
        }
        while(mineNumber > 0)
        {
            int rowMineNumber = randomMineNumber.nextInt(rows);
            int columnMineNumber = randomMineNumber.nextInt(columns);
            if(map[rowMineNumber][columnMineNumber].equals("-"))
            {
                map[rowMineNumber][columnMineNumber] = "*";
                mineNumber--;
            }
        }
        for (int i = 0; i < rows;i++){
            for(int j=0; j<columns;j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("=======================");
        System.out.println();
    }

    public static void countMines(int userInput,int rows,int columns, String [][] map, String [][] mineField){

        int i = (userInput - 1) / rows;
        int j = (userInput - 1) % rows;
        int count = 0;
        int[][] neighbors = {{i-1, j-1}, {i-1, j}, {i-1, j+1}, {i, j-1}, {i, j+1}, {i+1, j-1}, {i+1, j}, {i+1, j+1}};

        for (int[] neighbor : neighbors) {
            int row = neighbor[0];
            int col = neighbor[1];
            if (row >= 0 && row < map.length && col >= 0 && col < map[0].length) {

                if (map[row][col] == "*") {

                    count++;
                }
            }
        }

        mineField[i][j] = " " + Integer.toString(count) + " ";
    }

    public static void printGamerTable(String[][] mineField){
        for (int i = 0; i < mineField.length;i++){
            for(int j=0; j<mineField[i].length;j++){
                System.out.print(mineField[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("=======================");
        System.out.println();

    }

    public static int playerChoice (String [][] mineField){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a cell number");
        while (input.hasNextInt() == false){
            System.out.println("Invalid entry.");
            printGamerTable(mineField);
            input.next();
        }

        int userInput = input.nextInt();
        while (userInput < 0 || userInput > (mineField.length * mineField[0].length)){
            System.out.println("You entered location is out of boundaries. Try again.");
            userInput = input.nextInt();
        }
        return userInput;
    }

    public static boolean game(String[][] mineField, String[][] map){
        printGamerTable(mineField);
        int userInput = playerChoice(mineField);
        int x = (userInput - 1) / mineField.length;
        int y = (userInput - 1) % mineField.length;
        while (!(mineField[x][y] == " ? ")){
            printGamerTable(mineField);
            System.out.println("You have chosen this cell before. Try another cell.");
            userInput = playerChoice(mineField);
            x = (userInput - 1) / mineField.length;
            y = (userInput - 1) % mineField.length;

        }

        if (!(map[x][y] == "*")){
            countMines(userInput,mineField.length,mineField.length,map,mineField);
            int count = 0;
            for (int i = 0; i < mineField.length;i++){
                for (int j = 0; j < mineField[i].length; j++){
                    if(mineField[i][j] == " ? "){
                        count++;
                    }
                }
            }
            if (count == (int) ((mineField.length * mineField[0].length) / 4)){
                System.out.println("Congrats! You won.");
                return false;
            }
            printGamerTable(mineField);
            return true;
        }
        else if (map[x][y] == "*"){
            printGamerTable(map);
            System.out.println("You stepped on a mine. KABOOOM!");
            System.out.println("You lost.");
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        boolean tryAgain = true;
        while (tryAgain == true){
            while (run == true){
                System.out.println("Enter the number of rows.");
                int rows = input.nextInt();
                System.out.println("Enter the number of columns.");
                int columns = input.nextInt();
                String [][] mineField = new String[rows][columns];
                String[][] map = new String[rows][columns];

                for (int i = 0; i < rows;i++){
                    for(int j=0; j<columns;j++){
                        mineField[i][j] = " ? ";
                    }
                }
                mineField(rows,columns,map); // one time
                run = game(mineField,map);
            }

            System.out.println("Do you want to play again? (y or n)");
            String ans = input.nextLine();
            ans = input.nextLine();
            ans = ans.toLowerCase();
            if (ans.equals("y")){
                tryAgain = true;
                run = true;
            }
            else{
                System.out.println("Have a nice day.");
                tryAgain = false;
                run = false;
            }
        }
    }
}
