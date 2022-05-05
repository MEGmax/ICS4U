package javareview2.activites;

import java.util.Scanner;
import java.util.Random;

public class JavaReviewAct2
{
    public static void main(String[] args)
    {
        //set up scanner and random number
        Scanner k = new Scanner(System.in);
        Random randomNum = new Random();

        //ask for user to guess heads or tails and record it
        System.out.print("Heads or tails (0 = heads, 1 = tails): ");
        int guess = k.nextInt();

        //generates random number
        int num = randomNum.nextInt(2);

        //first line appearing in program that encourages user for correct answers or states the user was incorrect
        if (guess == num)
        {
            System.out.println("Good job!!");
        }

        else
        {
            System.out.println("Incorrect.");
        }


        if(num == 0 && guess == 0)
        {
            System.out.println("Your guess was heads and this was correct!");
        }

        else if (num == 1 && guess == 1 )
        {
            System.out.println("Your guess was tails and this was correct!");
        }

        else if (num == 0 && guess == 1)
        {
            System.out.println("Sorry your guess was tails but the correct answer was heads.");
        }

        else if (num == 1 && guess == 0)
        {
            System.out.println("Sorry you guess was heads but the correct answer was tails. ");
        }
        k.close();

    }
}
