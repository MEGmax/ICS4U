package javareview2;
/*
Write a program that calculates BMI given the users height and weight
 */
import java.util.Scanner;


public class BMI
{
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);

        //declare final variables (constants)
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        //ask user for weight in pounds and record it
        System.out.print("Enter weight in pounds: ");
        double weight = k.nextDouble();

        //ask user for height in inches and record it
        System.out.print("Enter height in inches: ");
        double height = k.nextDouble();

        //convert to appropriate units
        double weightInKilo = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = height * METERS_PER_INCH;

        //calculate bmi
        double bmi = weightInKilo / (heightInMeters * heightInMeters);
        //can also use Math.pow(heightInMeters, 2)

        System.out.println("BMI is: " + bmi);

        if (bmi < 18.5)
        {
            System.out.println("Underweight");
        }
        else if (bmi < 25)
        {
            System.out.println("Normal");
        }
        else if (bmi < 30)
        {
            System.out.println("Overweight");
        }
        else
        {
            System.out.println("Obese");
        }






    }
}
