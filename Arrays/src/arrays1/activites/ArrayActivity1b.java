package arrays1.activites;

public class ArrayActivity1b
{
    public static void main(String[] args)
    {
        final int ARRAY_SIZE = 10;

        int [] list = new int [ARRAY_SIZE];

        System.out.print("Random numbers generated in an array: ");
        for (int i = 0; i < list.length; i++)
        {
            list[i] = (int) (Math.random() * 100 + 1); //generates a random value from 1-100
            System.out.print(list[i] + " ");
        }

        System.out.print("\nEvery element at an even index: ");

        for (int i = 0; i < list.length ; i+=2)
        {
            System.out.print(list[i] + " ");
        }

        System.out.print("\nEvery even element: ");

        for (int i = 0; i < list.length ; i++)
        {
            if(list[i] % 2 == 0)
            {
                System.out.print(list[i] + " ");
            }
        }

        System.out.print("\nAll elements in reverse order: ");

        for (int i = list.length-1; i >= 0; i--)
        {
            System.out.print(list[i] + " ");
        }

        System.out.print("\nThe first and last elements: " + list[0] + " " + list[9]);


    }
}
