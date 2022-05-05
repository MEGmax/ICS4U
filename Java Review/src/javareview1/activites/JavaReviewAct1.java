package javareview1.activites;

import java.util.Scanner;

public class JavaReviewAct1
{
    public static void main(String[] args)
    {
        //1.
        byte bottles;

        //2.
        /*
        The problem with this variable declaration (int ounces per litres = 28.35) is that there are spaces between
        ounces and per and litres. Another issue is that the integer declared is not an integer (the wrong datatype
        is used). To fix this problem, you either need to change "int" to "double" or cast the value to an int.
        It should be written as:
         */
        double ouncesPerLitres = 28.35;

        //3.
        double unitPrice = 40.99;
        int quantity = 12;

        //4
        double total = unitPrice * quantity;
        System.out.println("The total price is " + total);

        //5
        /*
        The problem with the comment is that they put the 2 backslashes at the end of the comment instead
        of at the beginning.
        It should be written as:
         */
        double canVolume = 0.355; //Litres in a 12-ounce can

        //6
        //declare constant for millimeters per inch
        final double MILLIMETERS_PER_INCH = 25.4;

        //convert width of letter-size paper in inches to millimeters
        double widthInMillimeters = 8.5 * MILLIMETERS_PER_INCH;

        //convert length of letter-size paper in inches to millimeters
        double lengthInMillimeters = 11 * MILLIMETERS_PER_INCH;

        //Display dimensions in inches
        System.out.println("The length and width of a letter sized paper are 11 inches and 8.5 inches respectively.");

        //Display dimensions in millimeters
        System.out.println("This is " + lengthInMillimeters + " millimeters long and " + widthInMillimeters + " millimeters wide");

        //7
        //break
        System.out.println();

        //Set up scanner
        Scanner k = new Scanner(System.in);

        //ask user for value in dollars and record it
        System.out.print("Enter an amount in dollars, for example, 12.35: ");
        double input = k.nextDouble();

        //get dollars
        double dollars = (int)input;

        //get decimal value
        double leftover = input - dollars;

        //get quarters
        double quarters = (input - dollars) / 0.25 ;

        //assign quarter value
        double quartersValue = ((int)quarters) * 0.25;

        //get dimes
        double dimes = ((leftover - quartersValue) / 0.099); //0.099 instead of 0.1 to account for round off error

        //assign dime value
        double dimeValue = ((int)dimes) * 0.1;

        //refresh leftover
        leftover = (leftover - quartersValue - dimeValue);

        //get nickels
        double nickels = leftover / 0.0499; //0.0499 instead of 0.05 to account for round off error

        //assign nickel value
        double nickelValue = ((int)nickels) * 0.05;

        //refresh leftover
        leftover = leftover - nickelValue;

        //get pennies
        double pennies = leftover / 0.009; // 0.009 instead of 0.1 to account for round off error

        //display results
        System.out.println("Your amount of $" + input + " consists of:");
        System.out.println(dollars + " dollars");
        System.out.println(Math.floor(quarters) + " quarters");
        System.out.println(Math.floor(dimes) + " dimes");
        System.out.println(Math.floor(nickels) + " nickels");
        System.out.println(Math.floor(pennies) + " pennies");

    }
}
