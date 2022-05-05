package arrays5.activites;

import java.util.Scanner;

public class ArrayActivity5
{
    public static void main(String[] args)
    {
        //create scanner
        Scanner k = new Scanner(System.in);

        //create array with 10 index's
        int [] array = new int[10];

        //use for loop to ask for 10 numbers and record it
        for (int i = 0; i < array.length ; i++)
        {
            System.out.print("Enter number " + (i+1) + ": ");
            array[i] = k.nextInt();
        }
        //call method to eliminate duplicates
        int [] list2 = eliminateDuplicates(array);

        //header
        System.out.print("The distinct elements in the array are: ");

        //display results
        for (int i = 0; i < list2.length ; i++)
        {
            //ignore 0 because the duplicate elements leave less numbers to print out and they will automatically print 0's to hold the place
            if(list2[i] != 0)
            {
                System.out.print(list2[i] + " ");
            }
        }

        //close keyboard
        k.close();
    }

    public static int[] eliminateDuplicates(int[] list)
    {
        int [] result = new int[list.length]; //create new array to hold results and return to main method
        int x = 0; //counter

        //run a for loop for every index of the array
        for (int i = 0; i < list.length; i++)
        {
            boolean nonDup = true;//set boolean to true, nonDuplicate is true automatically
            for (int f = 0; f < i +1; f++) //check to see if any elements equal each other
            {
                if (list[i] == list[f] && i != f) //if the any 2 elements equal each other and its not the same index run this block
                {
                    nonDup = false;//set nonDup to false since if this runs it is a duplicate
                    break;
                }
            }
            if (nonDup) //if it isn't a duplicate run this block
            {
                result[x] = list[i]; //set new array user 2 counters
                x++; //increment x
            }

        }
        return result; //return the new array made
    }


}
