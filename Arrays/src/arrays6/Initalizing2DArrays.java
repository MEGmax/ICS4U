package arrays6;

import java.util.Scanner;

public class Initalizing2DArrays
{
    public static void main(String[] args)
    {
        System.out.println("Example 1");

        int [] [] matrix = new int[5][5];
        Scanner k = new Scanner(System.in);

        System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns.");

        for (int row = 0; row < matrix.length ; row++)
        {
            for (int column = 0; column < matrix[row].length; column++)
            {
                System.out.print("Enter a value for row " + (row + 1 ) + " column " + (column+1) + ": ");
                matrix[row][column] = k.nextInt();
            }
        }

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length ; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
