package arrays7.activites;

import java.util.Scanner;

public class TwoDArrayAct7
{
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);

        double [][] value = new double[6][4];

        int divisions = value.length;
        int quarters = value[0].length;

        System.out.print("Please enter the four quarterly sales figures for all six divisions of the company.\n");


        for (int i = 0; i < value.length ; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                System.out.print("Please enter a value for division " + (i + 1) + " quarter " + (j + 1) + ": $");
                value[i][j] = k.nextDouble();

            }
            System.out.println();
        }

        System.out.println("The sales figures of each division are: \n");
        double sum = 0;

        for (int i = 0; i < value.length; i++)
        {
            for (int j = 0; j < value[0].length ; j++)
            {
                sum += value[i][j];
            }
            System.out.printf("Total sales for division " + (i+1) + " is $%.2f",  sum);
            sum = 0;
            System.out.println();
        }

        System.out.println();
        System.out.println("The profit/loss for each division from the previous quarter (1st Quarter is not displayed):");
        System.out.println("  Quarter 2           Quarter 3           Quarter 4");
        System.out.println("---------------------------------------------------");

        double pldq;
        for (int i = 0; i < divisions ; i++)
        {
            for (int j = 1; j < quarters; j++)
            {
                pldq = value[i][j] - value[i][j-1];
                System.out.print("    $" + pldq + "               ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println();
        System.out.println("The total sales for each quarter is: ");
        System.out.println("  Quarter 1           Quarter 2           Quarter 3           Quarter 4");
        System.out.println("-----------------------------------------------------------------------");
        double sumq = 0;
        double tempsumq;
        double plq = 0;
        double [] plqArray = new double[4];


        for (int i = 0; i < quarters ; i++)
        {
            tempsumq = sumq;
            sumq = 0;
            for (int j = 0; j < divisions ; j++)
            {
               sumq += value[j][i];
               plq = sumq - tempsumq;
            }
            System.out.printf("   $%.2f            " ,  sumq);
            plqArray[i] = plq;
        }

        System.out.println();
        System.out.println("\nThe profit/loss from the previous quarter (1st Quarter is not displayed):");
        System.out.println("  Quarter 2           Quarter 3           Quarter 4");
        System.out.println("---------------------------------------------------");

        for (int i = 0; i < 3 ; i++)
        {
            System.out.printf("     $%.2f          ", plqArray[i+1]);
        }

        System.out.println();
        System.out.println();
        System.out.println("The average sales for all divisions in each quarter is: ");
        System.out.println("  Quarter 1           Quarter 2           Quarter 3           Quarter 4");
        System.out.println("-----------------------------------------------------------------------");

        double divSum;
        double avgDiv;
        for (int i = 0; i < quarters ; i++)
        {
            divSum = 0;
            for (int j = 0; j < divisions ; j++)
            {
                divSum += value[j][i];
            }
            avgDiv = divSum/6;
            System.out.printf("   $%.2f            " ,  avgDiv);
        }

        System.out.println();
        System.out.println("\nThe Division with the highest sale for each quarter is:");

        double maxDiv = 0;
        for (int i = 0; i < quarters ; i++)
        {
            double maxQValue = value[0][i];

            for (int j = 0; j < divisions ; j++)
            {
                if(maxQValue < value[j][i])
                {
                    maxQValue = value[j][i];
                    maxDiv = j;
                }

            }
            System.out.printf("\nDivison %.0f = $%.2f", (maxDiv+1), maxQValue);

        }



    }
}
