package arrays3.activites;

import java.util.Scanner;

public class scap
{
    public static void main(String[] args)
    {
        //create scanner
        Scanner k = new Scanner(System.in);

        //create array
        int [] list = new int[10];

        //output instructions to user
        System.out.print("Please enter 10 numbers: ");

        //use for loop to assign values entered by user to index's 0-9 in the array
        for (int i = 0; i < list.length ; i++)
        {
            list[i] = k.nextInt();
        }

        //Distinct numbers header
        System.out.print("The distinct numbers are: ");

        //run a for loop for every index of the array
        for (int i = 0; i < list.length; i++)
        {
            int j; // declare counter here so can be used outside of for loop
            for (j = 0; j < i; j++) //check to see if any elements equal each other
            {
                if (list[i] == list[j]) //if the elements equal each other break out of the loop
                {
                    break;
                }
            }

            //output results
            if (i == j)
            {
                System.out.print(list[i] + " ");
            }
        }

    }
}

