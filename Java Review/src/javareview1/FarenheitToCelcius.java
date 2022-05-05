package javareview1;
//write a program the converts farenheit to celcius
import java.util.Scanner;

public class FarenheitToCelcius
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter temp in farenheit: ");
        double f = keyboard.nextDouble();

        double c = ((double) 5 / 9) * (f -32);

        System.out.printf("%.2f degrees farenheit is %.2f degrees celcuis.", f, c);
        keyboard.close();

    }
}
