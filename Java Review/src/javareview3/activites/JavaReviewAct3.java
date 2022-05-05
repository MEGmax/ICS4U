package javareview3.activites;

import java.util.Scanner;

public class JavaReviewAct3
{
    public static void main(String[] args)
    {
        //create scanner
        Scanner k = new Scanner(System.in);

        //get month and record it
        System.out.print("Enter a number corresponding to a month (e.g. 1 = January): ");
        int month = k.nextInt();

        //get year and record it
        System.out.print("Enter the year: ");
        int year = k.nextInt();

        if (month == 2) //if its february run this code
        {
            if (year >= 1752) //1752 was the first leap year so anything before that wouldn't be a leap year
            {
                if (year % 4 == 0) //if its divisible by 4 run this block
                {
                    if (year % 100 == 0) //if its divisible by 100 run this block
                    {
                        if (year % 400 == 0) //if its divisible by 400 run this block, it will be a leap year
                        {
                            System.out.println("February " + year + " has 29 days. ");
                        }
                        else //if its divisible by 4 and 100, but not 400, it is not a leap year
                        {
                            System.out.println("February " + year + " has 28 days. ");
                        }
                    }
                    else // if it is divisible by 4 and not 100 or 400, it is a leap year
                    {
                        System.out.println("February " + year + " has 29 days. ");
                    }

                }
                else //if its not divisible by 4, 100, or 400 it is not a leap year
                {
                    System.out.println("February " + year + " has 28 days. ");
                }

            }
            else //the year is before leap years were invented
            {
                System.out.println("February " + year + " has 28 days. ");
            }
        }

        //if it is not february run this code
        else
        {
            switch (month)
            {
                case 1:
                    System.out.println("January " + year + " has 31 days.");
                    break;
                case 3:
                    System.out.println("March " + year + " has 31 days.");
                    break;
                case 4:
                    System.out.println("April " + year + " has 30 days.");
                    break;
                case 5:
                    System.out.println("May " + year + " has 31 days.");
                    break;
                case 6:
                    System.out.println("June " + year + " has 30 days.");
                    break;
                case 7:
                    System.out.println("July " + year + " has 31 days.");
                    break;
                case 8:
                    System.out.println("August " + year + " has 31 days.");
                    break;
                case 9:
                    System.out.println("September " + year + " has 30 days.");
                    break;
                case 10:
                    System.out.println("October " + year + " has 31 days.");
                    break;
                case 11:
                    System.out.println("November " + year + " has 30 days.");
                    break;
                case 12:
                    System.out.println("December " + year + " has 31 days.");
                    break;
                default:
                    System.out.println("Error. Please recheck your values.");
            }

        }


        k.close(); // close keyboard

    }

}
