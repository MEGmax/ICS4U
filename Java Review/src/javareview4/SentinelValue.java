package javareview4;

import java.util.Scanner;


public class SentinelValue

// Write a program that reads and calculates the sum of an unspecified number of integers.
// The program should end and print the sum of the numbers entered if the user enters 0.
{

    public static void main(String[] args)
    {
        //create keyboard
        Scanner k = new Scanner(System.in);

        //get integer and record it
        System.out.print("Enter an integer (the input ends if it is 0):");
        int data = k.nextInt();

        //create sum variable and start at 0
        int sum = 0;

        //run this block while data is not 0
        while (data != 0)
        {
            sum += data; // this is the same as sum = sum + data
            System.out.print("Enter an integer (the input ends if it is 0):");
            data = k.nextInt();

        }
        System.out.println("The sum is " + sum);
        k.close();

    }


}
