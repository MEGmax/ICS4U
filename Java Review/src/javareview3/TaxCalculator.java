package javareview3;

//tax determining program based on marital status and income

import java.util.Scanner;

/*
 * Write a program that determines the marital status of an
 * individual and calculates their taxes based on their income figure.
 */

public class TaxCalculator
{
    public static void main(String[] args)
    {
        final double RATE1 = 0.10;
        // This statement declares a final variable named RATE1 and
        // initializes it with a value of 0.10 representing 10%

        final double RATE2 = 0.25;
        // This statement declares a final variable named RATE2 and
        // initializes it with a value of 0.25 representing 25%

        final double RATE1_SINGLE_LIMIT = 32000;
        // This statement declares a final variable named
        // RATE1_SINGLE_LIMIT and initializes it with a value of
        // 32000. This value represents the threshold income for a single
        // individual.

        final double RATE1_MARRIED_LIMIT = 64000;
        // This statement declares a final variable named
        // RATE1_MARRIED_LIMIT and initializes it with a value of
        // 64000. This value represents the threshold combined income
        // for a married couple.

        double tax1 = 0;
        // This variable will hold the tax on any income below the
        // threshold value.

        double tax2 = 0;
        // This variable will hold the tax on any income above the
        // threshold value.

        Scanner keyboard = new Scanner(System.in);
        // This statement creates a keyboard object from the Scanner class
        // and will be used for user input.

        System.out.print("Please enter your income: ");
        // This statement prompts the user for their annual income.

        double income = keyboard.nextDouble();
        // This statement parses the input into a double and stores the value in
        // the variable income.

        keyboard.nextLine();
        // This statement cancels the escape sequence character in the
        // keyboard buffer from the last statement.

        System.out.print("Please enter s for single, m for married: ");
        // This statement prompts the user for their marital status.

        String maritalStatus = keyboard.nextLine();
        // This statement parses the input into a string and stores the
        // value in the variable maritalStatus.

        // This first if statement determines whether the user is single
        // or married.
        if (maritalStatus.equalsIgnoreCase("s"))
        {
            if (income <= RATE1_SINGLE_LIMIT)
            {
                tax1 = RATE1 * income;
            }
            else
            {
                tax1 = RATE1 * RATE1_SINGLE_LIMIT;
                tax2 = RATE2 * (income - RATE1_SINGLE_LIMIT);
            }
        }
        else
        {
            if (income <= RATE1_MARRIED_LIMIT)
            {
                tax1 = RATE1 * income;
            }
            else
            {
                tax1 = RATE1 * RATE1_MARRIED_LIMIT;
                tax2 = RATE2 * (income - RATE1_MARRIED_LIMIT);
            }
        }

        double totalTax = tax1 + tax2;
        System.out.println("The tax is $" + totalTax);
    }
}

