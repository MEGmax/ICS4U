package arrays7;

import java.util.Scanner;
import java.util.Arrays;
/*
ICS4U nit 2 assignment :Airline Reservation System
Completed: May 14th, 2021
By: Matthew Grech

Description:
This program is an online reservation system that has 2 classes, economy and first class. The input is validated to make
make sure that a valid option is selected. The user will be sat in seats based on what is available, incremementing the
seat numbers by one each time it fills up.
 */

public class AirlineReservationSystem

{
    public static int countf = 0; //declare and initialize counter for first class
    public static int counte = 0; //declare and initialize counter for economy
    public static int count = 0; //declare and initialize counter
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in); //declare and setup scanner

        boolean isTaken[] = new boolean[10]; //initialize boolean array
        Arrays.fill(isTaken, false); //make all elements of array false

        System.out.println("Welcome to the online reservation system."); //header
        System.out.print("\nPlease type 1 for First Class or type 2 for Economy: "); //prompt user for first class or economy
        int input = k.nextInt(); //record first class or economy

        seatAssign(input, isTaken);

        System.out.print("Would you like to reserve another seat (y-Yes or n-No): "); //as if they want a rerun
        String yesOrNo = k.next(); //records answer

        while (!(yesOrNo.equalsIgnoreCase("y")) && !(yesOrNo.equalsIgnoreCase("n"))) //input validation for entering y or n
        {
            System.out.print("That is not a valid option, enter y-Yes or n-No: "); //tells user input is not valid. Asks to re-enter
            yesOrNo = k.next();//records new input
        }

        if(yesOrNo.equalsIgnoreCase("n")) //if the user enters "n" run this code
        {
            System.out.println("Thank you for using the online reservation system. Have a nice day.");//thank user
            System.exit(0);//terminate program
        }

        while(yesOrNo.equalsIgnoreCase("y"))
        {
            reRun(input);
            seatAssign(input, isTaken);
            reRunYesOrNo(yesOrNo);
        }

    }



    public static void seatAssign(int input, boolean[] isTaken)
    {
        Scanner k = new Scanner(System.in); //setup scanner
        while (input != 1 && input != 2) //validates user input
        {
            System.out.print("That is not a valid input. Please type 1 for First Class or type 2 for Economy:");
            input = k.nextInt(); //records new input
        }
            if (input == 1) //if the user selects first class run this code
            {
                if(countf < 5)
                {
                    System.out.println("You have seat " + (countf+1) + " reserved in first class.");
                    isTaken[count]= true;
                    countf++; //increment counter
                }
                else if(countf < 10  && countf > 5)
                {
                    System.out.println("Full class is full. Would you like to book in Economy");
                    String yesOrNo3=k.next();
                    if (yesOrNo3.equalsIgnoreCase("y"))
                    {
                        System.out.println("You have seat " + (count+6) + " reserved in economy.");
                        isTaken[count]= true;
                        count++; //increment counter
                    }
                    else if (yesOrNo3.equalsIgnoreCase("n"))
                    {
                        System.out.println("Thank you for using the online reservation system. Have a nice day.");//thank user
                    }
                }
            }
        if (input == 2) //if the user selects economy run this code
            {
                if(counte >= 5)
                {
                    System.out.println("You have seat " + (counte+1) + " reserved in first class.");
                    isTaken[counte]= true;
                    counte++; //increment counter
                }
                else if(counte > 10)
                {
                    System.out.println("Economy class is full. Would you like to book in First Class");
                    String yesOrNo4=k.next();
                    if (yesOrNo4.equalsIgnoreCase("y"))
                    {
                        System.out.println("You have seat " + (counte+5) + " reserved in economy.");
                        isTaken[count]= true;
                        counte++; //increment counter
                    }
                    else if (yesOrNo4.equalsIgnoreCase("n"))
                    {
                        System.out.println("Thank you for using the online reservation system. Have a nice day.");//thank user
                    }
                }
                System.out.println("You have seat " + (counte+5) + " reserved in economy.");
                isTaken[count]= true;
                counte++; //increment counter
            }


    }
    public static int reRun(int input)
    {
        Scanner k = new Scanner(System.in);

        System.out.print("Please type 1 for First Class or type 2 for Economy: ");
        input = k.nextInt();
        return input;

    }

    public static String reRunYesOrNo(String yesOrNo)
    {
        Scanner k = new Scanner(System.in);
        System.out.print("Would you like to reserve another seat (y-Yes or n-No): "); //as if they want a rerun
        yesOrNo = k.next(); //records answer
        return yesOrNo;
    }


}
