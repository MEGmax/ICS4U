package arrays6.activites;

import java.util.Scanner;

public class TwoDArrayActivity2
{
    public static void main(String[] args)
    {
        double [][] matrix = new double [3][4];

        Scanner k = new Scanner(System.in);

        System.out.println("Enter a 3-by-4 matrix row by row");

        //record input using nested for loops
        for (int row = 0; row < matrix.length ; row++)
        {
            for (int column = 0; column < matrix[row].length; column++)
            {
                matrix[row][column] = k.nextDouble();
            }
        }


        for (int i = 0; i < matrix[0].length; i++) //runs 4 times for columns
        {
            double sum = 0; //resets to 0 after going through loop
            for (int j = 0; j < matrix.length ; j++) //run 3 times for rows
            {
                sum += matrix[j][i]; //sums specific column
            }
            System.out.printf("\nThe sum of elements at column %1d is %.2f", i, sum); //print results
        }





    }
}
