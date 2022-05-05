package javareview5;

//Write a program that generates a 9x9 multiplication table

import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        System.out.println("           Multiplication Table\n");
        System.out.print("    ");

        //this does the first row of the multiplication table
        for (int i = 1; i <= 9; i++)
        {
            System.out.print("   " + i);
        }

        //adds line of the table
        System.out.println("\n----------------------------------------");

        //
        for (int i = 1; i <= 9; i++)
        {
            System.out.print(i + " | ");
            for (int j = 1; j <= 9; j++)
            {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }

    }
}
