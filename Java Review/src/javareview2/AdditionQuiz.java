package javareview2;

import java.util.Scanner;
import java.util.Random;

/*
Write a program that generates 2 random numbers between 1 and 10 and asks the user to guess the number.
The program should specify if they are correct or not.
 */
public class AdditionQuiz
{
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        Random randNum = new Random();

        //generates random number from 1 to 10
        //plus 1 is used because zero is counted. So if it generates 0 it will add 1.
        int num1 = randNum.nextInt(10) + 1;
        int num2 = randNum.nextInt(10) + 1;

        //ask user what a random number plus a random number is
        System.out.print("What is " + num1 + " + " + num2 + "? ");
        int answer = k.nextInt();

        //tell user if they are correct or not
        System.out.println(num1 + " + " + num2 + " = " + answer + " is " + (num1+num2==answer));

        k.close();





    }
}
