package javareview1;

//Write a program that calculates the monthly payment of a loan given the monthly interest rate
//and the length of the loan in years. The program should ask the user to input the yearly
//interest rate, the length of the loan in years, the amount of the loan. The program should then display the
//monthly payment and total payment

import java.util.Scanner;

public class ComputerLoan
{
    public static void main(String[] args)
    {
        //create scanner
        Scanner k = new Scanner(System.in);

        //get interest rate from user
        System.out.print("Enter yearly interest rate, (e.g. 8.25): ");
        double annualir = k.nextDouble();

        //convert yearly interest rate to decimal and monthly
        double monthlyir = (annualir / 100) / 12;

        //get number of years loan will be paid by the user
        System.out.print("Enter number of years as an integer (e.g. 5): ");
        int years = k.nextInt();

        //get the loan amount from the user
        System.out.print("Enter the loan amount (e.g 120,000.34): ");
        double loanAmount = k.nextDouble();

        //calculate monthly payment using formula given by Petti
        double monthlyPayment = loanAmount * monthlyir / (1 - 1 / Math.pow(1 + monthlyir, years * 12));

        //using the monthly payment, get the total payment
        double totalPayment = monthlyPayment * years * 12;

        //display results
        System.out.printf("\nThe monthly payment is %.2f ", monthlyPayment);
        System.out.printf("\nThe total payment is %.2f", totalPayment);

        k.close();

    }
}
