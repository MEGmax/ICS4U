package arrays2.activites;

import java.util.Scanner;

public class ArrayActivity22
{
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);

        int x = 0;

        int [] list = new int[100];

        System.out.println("Enter between 1 and 100 integers ");
        list[x] = k.nextInt();

        while (list[x] != 0 && x < list.length)
        {
            x++;
            System.out.println("Enter a number: ");
            list[x] = k.nextInt();
        }

        int countSameNumber = 0;

        for (int i = 0; i < list.length ; i++)
        {
            for (int j = 1; j < list.length ; j++)
            {
                if(list[i] == list[j])
                {
                    countSameNumber++;
                }
            }
        }


    }
}
