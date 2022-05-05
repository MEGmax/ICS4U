package javareview3;
/*
This program changes english seasons names to spanish
 */

import java.util.Scanner;

public class Seasons
{
    public static void main(String[] args)
    {
        //creates keyboard
        Scanner k = new Scanner(System.in);

        //get name of season and record it
        System.out.print("Enter the name of the season: ");
        String input = k.nextLine();


        switch (input.toLowerCase()) //makes sure it is not case sensitive since input will be converted to all lower case just like the cases
        {
            case "spring":
                System.out.println("La Primavera");
                break;

            case "summer":
                System.out.println("El Verano");
                break;

            case "fall":
            case "autumn":
                System.out.println("El Otono");
                break;

            case "winter":
                System.out.println("El Invierno");
                break;

            default:
                System.out.println("Please enter one of these words: \nspring, summer, fall, autumn, winter");
                break;
        }
        k.close();



    }
}
