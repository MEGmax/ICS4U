package javareview4;

//Write a program that generates two random numbers between 1 and 10
//and asks the user to give the correct answer. The program should continually ask the user
//to try again if the answer is not correct. If the user gives the correct answer, then the
//program should tell the user that they answered correctly.

import java.util.Scanner;

public class RepeatAddition
{
    public static void main(String[] args)
    {
        //create keyboard
        Scanner k = new Scanner(System.in);

        //make 2 random numbers between 1 and 10
        int num1 = (int)(Math.random() * 10 + 1);
        int num2 = (int)(Math.random() * 10 + 1);

        //ask user what 2 random numbers added together is and record it
        System.out.print("What is " + num1 +  " + " + num2 + "? : ");
        int answer = k.nextInt();

        //if the user gets the answer wrong run this block
        while (num1 + num2 != answer)
        {
            //prompt user and record next trial
            System.out.print("Wrong answer. Try again. What is " + num1 + " + " + num2 + "? : ");
            answer = k.nextInt();
        }

        //default since while loop will run if answer is not correct
        System.out.println("You got it! ");

        k.close();

    }
}
