package javareview4;

import java.util.Scanner;

public class DoWhileLoop
{
    public static void main(String[] args)
    {
        //create keyboard
        Scanner k = new Scanner(System.in);

        //declare 2 variables
        int data, sum = 0;

        //run this block while data does not equal 0
        do
        {
            //gets number and records it
            System.out.print("Enter an integer (the input ends if it is 0):");
            data = k.nextInt();
            //same thing as sum = sum + data
            sum += data;
        }
        while (data != 0);

        //print sum
        System.out.println("The sum is " + sum);

    }
}
