package x;


public class testing
{
    public static void main(String[] args)
    {
        /*
        int number = 21;
        int i;
        boolean isPrime = true;

        for(i = 2; i < number && isPrime; i++)
        {
            if(number % i == 0)
            {
                isPrime = false;
            }
        }
        System.out.println("i is " + i+ " isPrime is " + isPrime);

         */
        int num1 = 0;
        int num2 = 2;
        do
        {
            num2++;
            num1 += num2;
            if(num1 > 2)
            {
                break;
            }
        }while(num2 < 5);
        System.out.println(num1);
    }

    /*
    public void message(int x)
    {
        System.out.printf("This is the first version ");
        System.out.println("of the method.");
    }

    public void message(String x)
    {

        System.out.printf("This is the second version ");
        System.out.println("of the method.");

    }




    public static void main(String[] args)
    {
        testing cp = new testing( );
        cp.message("1");
        cp.message(1);
    }

     */
}