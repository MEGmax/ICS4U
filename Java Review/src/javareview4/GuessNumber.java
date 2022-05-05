package javareview4;

// Write a program that asks a user to guess a number between 0 and 100.
// The program should loop until the user guesses the correct number. The program
// should also prompt the user if he/she has guessed too low or too high during
// each iteration.

import java.util.Scanner;


public class GuessNumber
{
    public static void main(String[] args)
    {
        int number;
        int guess = -1; //-1 because cant be a negative number
        number = (int)(Math.random() * 101);

        Scanner k = new Scanner(System.in);

        System.out.print("Guess a number between 0 and 100: ");

        while (guess != number)
        {
            System.out.print("\nEnter your guess: ");
            guess = k.nextInt();

            if (guess == number)
            {
                System.out.println("Yes, the number is " +  number);
            }

            else if (guess > number)
            {
                System.out.println("Your guess is too high");
            }

            else
            {
                System.out.println("Your guess is too low");
            }


        }

        k.close();

    }
}
