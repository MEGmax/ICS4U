package arrays7;

import java.util.Scanner;
import java.util.Arrays;

public class ArraysFinalActivity2
{
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);

        boolean isTaken[] = new boolean[10]; //initialize boolean array
        Arrays.fill(isTaken, false); //make all elements of array false

        System.out.println("Welcome to the online reservation system."); //header
        System.out.print("\nPlease type 1 for First Class or type 2 for Economy: "); //prompt user for first class or economy
        int input = k.nextInt(); //record first class or economy

        int count= 0;
        int countf = 0;
        int counte = 0;
        if(input == 1)
        {
            isTaken[count] = true;
            count++;
            System.out.println("Seat " + count);
        }
        else if (input == 2)
        {
            isTaken[count] = true;
            count++;
            System.out.println("Seat " + (count+5));
        }
        for (int i = 0; i < isTaken.length/2 ; i++)
        {
            if(isTaken[i] = true)
            {
                countf++;
            }
        }
        for (int i = 5; i < isTaken.length ; i++)
        {
            if (isTaken[i] = true)
            {
                counte++;
            }
        }

        System.out.println(countf);

    }
}
