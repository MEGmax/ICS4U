package arrays2;

import java.util.Scanner;

public class PartiallyFilledArray
{
    public static void main(String[] args)
    {
        final int ARRAY_SIZE = 100;
        int input[] = new int[ARRAY_SIZE];

        int count = 0;

        Scanner k = new Scanner(System.in);

        System.out.print("Enter a number or -1 to quit: ");
        int number = k.nextInt();

        while (number != -1 && count < input.length)
        {
            input[count] = number;
            count++;
            System.out.print("Enter a number or -1 to quit: ");
            number = k.nextInt();
        }

        System.out.print("The elements in the array are:");
        for (int i = 0; i < count ; i++)
        {
            System.out.print(" " + input[i]);
        }

        System.out.println("\nYou entered " + count + " elements into the array");

    }
}
