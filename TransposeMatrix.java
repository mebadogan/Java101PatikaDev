import java.util.*;
public class TransposeMatrix
{
    public static void main(String[] args)
    {
        
        int [][] matrix = {{1, 2, 3},{4, 5, 6}};
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++) 
            {
                transposed[j][i] = matrix[i][j];
            }
            
        }
        System.out.println(Arrays.deepToString(transposed));
        
    }
}
    
