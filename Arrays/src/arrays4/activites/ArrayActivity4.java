package arrays4.activites;

import java.util.Scanner;

public class ArrayActivity4
{
    public static void main(String[] args)
    {
        //create scanner
        Scanner k = new Scanner(System.in);

        //create array with 10 index's
        int [] list = new int[10];

        //use for loop to ask for 10 numbers and record it
        for (int i = 0; i < list.length ; i++)
        {
            System.out.print("Enter number " + (i+1) + ": ");
            list[i] = k.nextInt();
        }

        //header for results
        System.out.println("The reverse elements of your array is: ");

        //call reverse method to reverse elements of array
        reverse(list);

        //use for loop to display results
        for (int i = 0; i < list.length; i++)
        {
            System.out.print(list[i] + " ");
        }

    }

    public static int[] reverse (int [] array)
    {
        //run 5 times since 1 run will swap 2 values and there are 10 values
        for (int i = 0, j = array.length-1; i < array.length / 2 ; i++, j--)
        {
            int temp = array[i]; //temporarily hold first element in temp
            array[i] = array[j]; //assign first element to last element
            array[j] = temp; //reassign the last element to the first element
        }

        //return the array reversed and will be held in the array list[] in the main method
        return array;
    }

}
