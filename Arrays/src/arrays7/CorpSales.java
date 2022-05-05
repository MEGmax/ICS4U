package arrays7;

import java.util.Scanner;

public class CorpSales
{
    public static void main(String[] args)
    {
        final int DIVS = 3;
        final int QTS = 4;

        Scanner k = new Scanner(System.in);

        double totalSales = 0;

        double[][] sales = new double[DIVS][QTS];

        System.out.println("This program will calculate the total sales of ");
        System.out.println("all the company's divisions. Enter the following sales data: ");
        System.out.println();

        for (int i = 0; i < sales.length ; i++)
        {
            for (int j = 0; j < sales[i].length ; j++)
            {
                System.out.printf("Division %d, Quarter %d: $", (i+1), (j+1));//plus 1 because there is no division 0 or quarter 0
                sales[i][j] = k.nextInt();
                totalSales += sales[i][j];
            }
            System.out.println(); //to break up divisions
        }

        System.out.printf("The total company sales is $%,.2f", totalSales);

        k.close();



    }
}
