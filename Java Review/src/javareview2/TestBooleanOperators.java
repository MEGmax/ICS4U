package javareview2;
/*
Write a program that asks the user to enter a whole number.
The program should determine if the number is divisible by 2 and 3, by 2 or 3, or neither.
 */

import java.util.Scanner;

public class TestBooleanOperators
{
    public static void main(String[] args)
    {
        //create keyboard scanner
        Scanner k = new Scanner(System.in);

        //get number from user and record it
        System.out.print("Enter an integer: ");
        int num = k.nextInt();

        //determine if it is divisible by either 2 or 3
        if (num % 2 == 0 || num % 3 == 0 )
        {
            //determines if it divisible by 2 and 3
            if (num % 2 == 0 && num % 3 == 0)
            {
                System.out.println("This number is divisible by 2 and 3.");
            }
            //determines if it is divisible by one the other (2 or 3)
            else
            {
                System.out.println("This number is divisible by 2 or 3, but not both.");
            }
        }
        //determines if it is not divisible by 2 and 3
        else
        {
            System.out.println("This number is not divisible by 2 or 3.");
        }

        k.close();

    }
}
