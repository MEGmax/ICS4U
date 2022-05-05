package arrays2;

import java.util.Scanner;

public class AnalyzeNumbers
{
    public static void main(String[] args)
    {
        final int NUMBER_OF_ELEMENTS = 10;
        double [] numbers = new double[NUMBER_OF_ELEMENTS];
        double sum = 0;

        Scanner k = new Scanner (System.in);

        //this for loop takes input and calculates the sum using a running total
        for (int i = 0; i < NUMBER_OF_ELEMENTS ; i++)
        {
            System.out.print("Enter a new number: ");
            numbers[i] = k.nextDouble();
            sum += numbers[i];
        }

        //calculates average
        double average = sum / NUMBER_OF_ELEMENTS;

        //this block determines the number of elements above the average
        int countAbove = 0;
        for (int i = 0; i < NUMBER_OF_ELEMENTS ; i++)
        {
            if(numbers[i] > average)
            {
                countAbove++;
            }
        }
        System.out.println("Average is: " + average);
        System.out.println("Number of elements above the average: " + countAbove);

    }
}
