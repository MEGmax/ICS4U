package arrays2;

import java.util.Scanner;

public class ArrayActivity2
{
    public static void main(String[] args)
    {
        //setup keyboard
        Scanner k = new Scanner(System.in);

        int [] input = new int[100]; //create input array for 100 elements
        int [] count = new int[100]; //create count array fro 100 elements
        int i = 0,  x; //create counter variables

        //header
        System.out.println("Enter between 1 and 100 integers. Ends if 0 is input.");

        do
        {
            System.out.print("Enter a number: "); //prompts user to enter number
            input[i] = k.nextInt(); //records number
        }while (input[i++] != 0 && i < 100); //while the input is not 0 and there is less than 100 numbers inputted

        for (i = 0; i < input.length ; i++)//runs for every element in input array
        {
            x = input[i];//x is equal to the value held at input[i]
            count[x]++;//increment count[x]
        }

        System.out.println(); //line space for results

        //this for loop prints results
        for (int j = 1; j < count.length; j++)
        {
            if (count[j] == 1) //to print "time"
            {
                System.out.printf("%d occurs %d time\n", j, count[j]);
            }
            else if (count[j] >= 2) //to print "times" (plural)
            {
                System.out.printf("%d occurs %d times\n", j, count[j]);
            }
        }


    }
}

