package javareview6.activites;

import java.util.Scanner;

public class JavaReviewAct6
{
    public static void main(String[] args)
    {
        Scanner k = new Scanner (System.in);

        System.out.print("Enter a number: ");
        int number = k.nextInt();

        int outcome = primeNumber(number);


        if (outcome == 0)
        {
            System.out.println("The number " + number + " is a prime number");
        }
        else if (outcome == 1)
        {
            System.out.println("The number " + number + " is not a prime number");
        }

    }

    public static int primeNumber(int number)
    {
        int result = 0;
        int i = 2;

        while (number > i)
        {
            if (number % i == 0)
            {
                result = 1;
            }
            else
            {
                result = 0;
            }
            i++;

        }
        return result;
    }


}
