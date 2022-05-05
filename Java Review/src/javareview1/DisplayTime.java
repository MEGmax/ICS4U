package javareview1;

import java.util.Scanner;

/*
write a program that calculates minutes and remaining seconds from an amount of time in seconds
For example, 500 seconds contains 8 minutes and 20 seconds
 */
public class DisplayTime

{
    public static void main (String[] args)
    {
        //creates keyboard
        Scanner keyboard = new Scanner(System.in);

        //gets seconds and records it
        System.out.print("Enter an integer in seconds: ");
        int seconds = keyboard.nextInt();

        //find number of minutes
        int mins = seconds / 60;

        //find remaining seconds
        int remainingSeconds = seconds % 60;

        System.out.println(seconds + " seconds is " + mins +  " minutes and " + remainingSeconds + " seconds. ");

        keyboard.close();
    }
}
