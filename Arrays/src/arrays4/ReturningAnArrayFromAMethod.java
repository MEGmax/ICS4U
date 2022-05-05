package arrays4;

import java.util.Arrays;

public class ReturningAnArrayFromAMethod
{
    public static void main(String[] args)
    {
        int [] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] returnedArray = reverse(list);

        System.out.println(Arrays.toString(list));
        System.out.println(Arrays.toString(returnedArray));

    }

    public static int [] reverse(int [] list)
    {
        int [] result = new int[list.length];
        //result array contains [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) //i counts up to the array size length and j counts down, i = 0 j = 9
        {
            result[j] = list[i]; //reverses order, 1st run is result [9] = list[0] which is
        }

        return result;
    }

}
