package arrays4;

public class PassingArraysToMethods
{
    public static void main(String[] args)
    {
        int x = 1;
        int [] y = new int[10];
        y [0]= 2222;

        m(x, y);
        System.out.println("X is " + x);
        System.out.println("Y[0] is " + y[0]);


    }
    public static void m (int number, int [] numbers)
    {
        number = 1001;
        numbers [0] = 5555;
    }

}
