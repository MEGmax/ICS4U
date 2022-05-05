package arrays2.activites;

import java.util.Scanner;

public class ArrayActivity2
{
    public static void main(String[] args)
    {
        final int ARRAY_SIZE = 100;

        int numbers[] = new int[ARRAY_SIZE];
        int x = 0;

        Scanner k = new Scanner(System.in);

        System.out.println("Enter between 1 and 100 integers.");

        System.out.print("Enter a number: ");
        numbers[x] = k.nextInt();

        while (numbers[x] != 0 && x < numbers.length)
        {
            x++;
            System.out.print("Enter a number: ");
            numbers[x] = k.nextInt();
        }

        int numCount = 0;
        int [] numResults = new int[x];
        boolean [] printNum = new boolean[x];

        for (int i = 0; i < x ; i++)
        {
            for (int j = 0; i < x ; j++)
            {
                if(numbers[i]==numbers[j])
                {
                    numCount++;
                    if(numCount > 1)
                    {
                        printNum[j] = true;

                    }
                }
            }
            numResults [i] = numCount;
        }

        for (int i = 0; i < printNum.length ; i++)
        {
            if(printNum[i] == false)
            {
                System.out.println(numbers[i] + " occurs ");
                if(numResults[i] > 1)
                {
                    System.out.println(numCount + " times ");
                }
                else
                {
                    System.out.println(numCount + " time");
                }
            }
        }



    }
}
