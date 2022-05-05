package arrays3.activites;

import java.util.Scanner;

public class mitchellact3 {
    public static void main(String[] args)
    {
        Scanner k = new Scanner (System.in);

        System.out.println("Enter ten numbers:");
        int[] list = new int[10];

        for (int i = 0; i < 10; i++)
        {
            System.out.print("Number "+(i+1)+": ");
            list[i]= k.nextInt();
        }

        int[] newerList = eliminateDuplicates(list);

        System.out.println("The distinct numbers are");

        for (int i = 0; i < newerList.length; i++)
        {
            if (newerList[i] != 0)
            {
                System.out.print(newerList[i]+" ");
            }
        }


        k.close();

    }
    public static int[] eliminateDuplicates(int[] list)
    {
        int count = 0;
        int[] newList = new int[list.length];

        for (int i = 0; i < list.length; i++)
        {
            boolean noDupe = true;
            for (int j = 0; j < i+1; j++)
            {
                if (list[i] == list[j] && i != j )
                {
                    noDupe = false;
                }
            }
            if (noDupe)
            {
                newList[count] = list[i];
                count++;
            }
        }


        return newList;
    }
}

