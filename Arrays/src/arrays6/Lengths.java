package arrays6;

public class Lengths
{
    public static void main(String[] args)
    {
        int [] [] numbers = { {1, 2, 3},
                              {4, 5, 6,},
                              {7, 8, 9} };

        System.out.println("The number of rows is " + numbers.length);

        for (int i = 0; i < numbers.length ; i++)
        {
            System.out.println("The number of columns in row " + i + " is " + numbers[i].length);
        }
    }
}
