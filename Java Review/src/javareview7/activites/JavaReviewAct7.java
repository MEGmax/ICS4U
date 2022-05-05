package javareview7.activites;

import java.util.Scanner;

public class JavaReviewAct7
{
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);

        System.out.print("How many primes numbers do you wish to display: ");
        int numberCheck = k.nextInt();
        System.out.println();
        printPrimeNumbers(numberCheck);
    }

    public static boolean isPrime(int numberToCheck)
    {
        for (int divisor = 2; divisor < numberToCheck; divisor++)
        {
            if (numberToCheck % divisor == 0)
            {
                return false;
            }

        }
        return true;

    }

    public static void printPrimeNumbers(int numberOfPrimes)
    {
        final int NUMBERS_OF_PRIME_PER_LINE = 10;
        int count = 0;
        int number = 2;

        while (count < numberOfPrimes)
        {
            if(isPrime(number))
            {
                count++;
                if(count % NUMBERS_OF_PRIME_PER_LINE == 0)
                {
                    System.out.printf("%-5s \n", number);
                }
                else
                {
                    System.out.printf("%-5s", number);

                }
            }
            number++;
        }
    }

    /*
    public static int rows(int input)
    {
        int counter = 1;
        int numberOfLines = 1;

        while (counter < input)
        {
            if (counter % 10 == 0)
            {
                numberOfLines++;
            }
            counter++;
        }
        return numberOfLines;
    }

     */

    /*
    public static int primeNumbers(int numPrimes)
    {
        int primes = 0;
        int max = 2;

        for (int x= 1; x < max; x++)
        {
            int numberOfDivisors = 0;

            //if a number has more than 1 divisors than it is not prime
            for (int i = 2; i < x; i++)
            {
                if (x % i == 0)
                {
                    numberOfDivisors++;
                }
            }

            //this block checks if the number tested it prime and prints it
            if (x != 1 && numberOfDivisors == 0)
            {
                System.out.print(x + " ");
                primes++;
            }

            //this block ensures that the loop will only run for the number of primes imputed by the user
            if (primes == numPrimes)
            {
                max = 0;
            }
            //increments max
            max++;
        }
        return primes;

    }

     */

}
