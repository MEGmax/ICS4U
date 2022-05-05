package test;

import java.util.Scanner;
import java.util.Random;

public class fileForTest
{
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        Random y = new Random();

        int num = 20;
        int i;
        boolean isprime = true;

        for (i = 2; i < num && isprime ; i++)
        {
            if(num % i == 0)
            {
                isprime = false;
            }
        }
        System.out.println("i is " + i + " isPrime is " + isprime);

    }
}
