package javareview5;

import java.util.Scanner;

public class InvestmentTable
{
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);

        //ask yearly rate and record it
        System.out.print("What is the yearly rate? ");
        double rate = k.nextDouble();

        //get balance and record it
        System.out.print("What is the initial balance of your investment? ");
        double balance = k.nextDouble();

        //get number of years and record it
        System.out.print("Enter number of years: ");
        int years = k.nextInt();

        for (int i = 1; i <= years; i++)
        {
            double interest = balance * rate / 100;
            balance = balance + interest; // same as balance += interest
            System.out.printf("Year %2d %10.2f\n", i, balance); // %2d creates 2 spaces
        }

k.close();

    }
}
