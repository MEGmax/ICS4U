package arrays6.activites;

import java.util.Scanner;

public class TwoDArrayActivity3
{
    public static void main(String[] args)
    {
        //creates keyboard obbject
        Scanner k = new Scanner(System.in);

        //ask user for size of matrix and record it
        System.out.print("Enter the size for the matrix: ");
        int input = k.nextInt();

        //create array called matrix
        int [] [] matrix = new int[input][input];

        //create array called sum to keep track of sum of each row
        int [] sum = new int[input];

        //run outer for loop for every index of the input
        for (int i = 0; i < input; i++)
        {
            //run inner for loop for every index of the input
            for (int j = 0; j < input; j++)
            {
                int randNum = (int)(Math.random()*2); //generates a 0 or a 1 randomly and assigns it to randNum
                matrix[i][j] = randNum;//assign a 0 or 1 to an element of the matrix
                System.out.print(randNum + " "); //print that 0 or 1 and a space
                sum[i] += matrix[i][j];//sum the row
            }
            System.out.println();//creates a new line for every row
        }

        for (int i = 0; i < input ; i++)
        {
            if(sum[i] == input)//if it is all 1's the sum will equal the number the user entered
            {
                System.out.println("All 1's on row " + (i+1) ); //output results
            }
            else if (sum[i] == 0) //if it is all 0's the sum will be 0
            {
                System.out.println("All 0's on row " + (i+1) ); //output results
            }
            else //if theres no pattern
            {
                System.out.println("No pattern on row " + (i+1) ); //output results
            }

        }

    }

}
