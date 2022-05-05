package arrays6;

public class Processing2DArrays
{
    public static void main(String[] args)
    {
        int[][] matrix = new int [10][10];
        System.out.println("Example 2: Initializing an array with 2D values");

        for (int i = 0; i < matrix.length ; i++)
        {
            for (int j = 0; j < matrix[i].length ; j++)
            {
                matrix[i][j] = (int) (Math.random() * 100); //random number from 0-99
            }
        }

        //******************************************************************

        System.out.println("Example 3: Printing 2D arrays with printf");

        for (int i = 0; i < matrix.length ; i++)
        {
            for (int j = 0; j < matrix[i].length ; j++)
            {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }

        //******************************************************************
        System.out.println("Example 4: Summing all elements");

        int total = 0;
        for (int i = 0; i < matrix.length ; i++)
        {
            for (int j = 0; j < matrix[i].length ; j++)
            {
                total += matrix[i][j];
            }
        }
        System.out.println("The sum of all the elements is " + total);

        //******************************************************************

        System.out.println("Example 5: Which row has the largest sum");

        int maxRow = 0;
        int indexOfMaxRow = 0;

        for (int column = 0;  column < matrix[0].length ; column++)
        {
            maxRow += matrix[0][column];
        }

        for (int row = 1; row < matrix.length ; row++)
        {
            int totalOfThisRow = 0;
            for (int column = 0; column < matrix[row].length; column++)
            {
                totalOfThisRow += matrix[row][column];
            }
            if(totalOfThisRow > maxRow)
            {
                maxRow = totalOfThisRow;
                indexOfMaxRow = row;
            }

        }
        System.out.println("Row " + indexOfMaxRow + " has the maximum sum of " + maxRow);

        //******************************************************************

        System.out.println("Example 6: 2D Random Shuffling ");

        for (int i = 0; i < matrix.length ; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                int i1 = (int)(Math.random() * matrix.length); //random number between 0 and 9 (random row)
                int j1 = (int)(Math.random() * matrix[i].length); //random number between 0 and 9 (random column)

                int temp = matrix[i][j]; //the first run will hold the first value of the array in temp
                matrix[i][j] = matrix[i1][j1]; // this will assign the first value in the array to a random row and column
                matrix[i1][j1] = temp;
            }
        }

        for (int i = 0; i < matrix.length ; i++)
        {
            for (int j = 0; j < matrix[i].length ; j++)
            {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }



    }
}
