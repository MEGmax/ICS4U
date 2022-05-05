package javareview7;

import java.util.Scanner;

//write a program that find the greatest common divisor between 2 numbers

public class GreatestCommonDivisor
{
    public static void main(String[] args)
    {
        int n1, n2;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        n1 = keyboard.nextInt();

        System.out.print("Enter the second number: ");
        n2 = keyboard.nextInt();

        System.out.println("The greatest common divisor between " + n1 + " and " + n2 + " is " + gcd(n1, n2));

        keyboard.close();
    }

    public static int gcd(int num1, int num2)
    {
        int k = 1;
        int gcd = 1;

        while(k <= num1 && k <= num2)
        {
            if(num1 % k == 0 && num2 % k == 0)
            {
                gcd = k;
            }
            k++;

        }
        return gcd;


    }
}
