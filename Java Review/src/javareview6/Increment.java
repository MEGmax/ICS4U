package javareview6;

public class Increment
{
    public static int x = 1;

    public static void main(String[] args)
    {
        System.out.println("Before the call, x is " + x);
        increment();
        System.out.println("After the call, x is " + x);
    }

    public static void increment()
    {
        x++;
        System.out.println("x inside the method is " +  x);
    }
}
