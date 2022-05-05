package arrays5;

import java.util.Arrays;

public class BionarySearchAlgorithim
{
    public static void main(String[] args)
    {
        int [] numbers = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

        int result = binarySearch(numbers, 79);
        //int result = Arrays.binarySearch(numbers, 50);

        System.out.println(result);

    }

    public static int binarySearch(int[] list, int key)
    {
        int low = 0;
        int high = list.length - 1;

        while (high >= low)
        {
            int mid = (low + high) / 2; //this will give middle of array

            if(key < list[mid])
            {
                high = mid -1;
            }
            else if (key == list[mid])
            {
                return mid;
            }
            else
            {
                low = mid + 1;
            }
        }
        return -1;

    }
}
