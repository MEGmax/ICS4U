package arrays2;

import java.util.Scanner;

public class AlgorithmicEfficiency
{
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);

        long number;
        boolean primeCheck = true;

        System.out.print("Check if prime: ");
        number = k.nextLong();

        long currentTime = System.currentTimeMillis();

        for (long divisor = 2; divisor < number; divisor++)
        {
            if(number % divisor == 0)
            {
                primeCheck = false;
                break;
            }

        }

        if(primeCheck)
        {
            System.out.println(number + " is a prime number");
        }

        else
        {
            System.out.println(number + " is a not prime number");
        }

        currentTime = System.currentTimeMillis() - currentTime;
        System.out.println("The algorithim was processed in " + (double)currentTime/1000 + " seconds");

        k.close();
    }


}
