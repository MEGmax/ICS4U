package javareview5.activites;

//Program displays numbers between 100 and 1000 that are divisible by 5 and 6 in 10 numbers per line

public class JavaReview5b
{
    public static void main(String[] args)
    {
        System.out.print("Numbers between 100 and 1000 divisible by 5 and 6 are:"); //header

        int counter = 0;//declare and initialize counter

        for (int i = 100; i <= 1000; i++) //set for loop up to run for numbers between 100 and 1000
        {
            if(i % 5 == 0 && i % 6 ==0) //if the number is divisible by 5 or 6 run this block
            {
                if(counter % 10 == 0) // if there have been 10 numbers on the line run this code
                {
                    System.out.println(); //print new line
                }
                counter++; //increase counter by 1 each time a number is checked
                System.out.print(i + " "); //output any number that is divisible by 5 and 6 with a space between them
            }
        }
    }
}
