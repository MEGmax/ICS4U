package javareview3;
/*
Write a program that determines the chinese zodiac for the given year.
 */

import java.util.Scanner;

public class ChineseZodiac
{
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = k.nextInt();

        switch (year % 12) //will give one of the 12 cases, 2000 and 2012 have the same case since it repeats every 12 years
        {
            case 0:
                System.out.println("Monkey");
                break;
            case 1:
                System.out.println("Rooster");
                break;
            case 2:
                System.out.println("Dog");
                break;
            case 3:
                System.out.println("Pig");
                break;
            case 4:
                System.out.println("Rat");
                break;
            case 5:
                System.out.println("Ox");
                break;
            case 6:
                System.out.println("Tiger");
                break;
            case 7:
                System.out.println("Rabbit");
                break;
            case 8:
                System.out.println("Dragon");
                break;
            case 9:
                System.out.println("Snake");
                break;
            case 10:
                System.out.println("Horse");
                break;
            case 11:
                System.out.println("Sheep");
                break;
            default:
                System.out.println("There is no assigned value.");
                break;

        }

        k.close();

    }
}
