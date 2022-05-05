package javareview4.activites;
//(Count positive and negative numbers and compute the average of numbers) Write a program that reads an
//unspecified number of integers, determines how many positive and negative values have been read, and computes
//the total and average of the input values (not counting zeros). Your program ends with the input 0.
// Display the average as a floating-point number.


import java.util.Scanner;

public class JavaReviewAct4
{
    public static void main(String[] args)
    {

       Scanner k = new Scanner (System.in); //create scanner

        int input, sum = 0, positiveNums = 0, negativeNums = 0; //declare and initialize variables
        double i = -1; //declare and initialize counter variable, -1 so the number to divide by is correct

        do
        {
            System.out.print("Enter an integer (the input ends if it is 0): ");  //prompt user for input
            input = k.nextInt(); //record input
            sum += input; //add input to sum and record it

            i++; //iterate +1

            if (input > 0) //if number entered is positive
            {
                positiveNums++; //increase the number of positive numbers by 1
            }
            else if (input < 0) //if number entered is negative
            {
                negativeNums++; //increase the number of negative numbers by 1
            }
        }
        while (input != 0);//run do loop until the user enters 0

        //display results
        System.out.println(); //for a break
        System.out.println("The total number of positive integers is: " + positiveNums);
        System.out.println("The total number of negative integers is: " + negativeNums);
        System.out.println("The sum is " + sum);
        System.out.printf("The average is: %.2f", sum/i);

        k.close(); //close the keyboard
    }
}
