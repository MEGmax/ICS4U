package arrays1.activites;

import java.util.Scanner;

public class ArrayActivity1a
{
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);

        int array[] = new int[10];

        System.out.print("Please enter 10 values: \n");

        for (int i = 0; i < array.length; i++)
        {
            System.out.print("Enter value " + (i + 1) + ": ");
            array[i] = k.nextInt();
        }

        for (int i = array.length-1; i >= 0; i--)
        {
            System.out.print(array[i] + " ");
        }


    }
}
