package javareview6;

//Write a program that uses a method to return the maximum of two integers

import java.util.Scanner;

public class TestMax
{
    public static int max(int num1, int num2)
    {
        int result;
        if (num1 > num2)
        {
            result = num1;
        }
        else
        {
            result = num2;
        }
        return result;

    }

    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);

        int i;
        int j;
        System.out.print("Enter the first number: ");
        i = k.nextInt();

        System.out.print("Enter the second number: ");
        j = k.nextInt();

        int q = max(i, j);

        System.out.println("The maximum between " + i + " and " + j + " is " + q);

        k.close();

    }
}
