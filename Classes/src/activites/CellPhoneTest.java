package activites;

import java.util.Scanner;

public class CellPhoneTest
{
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);

        String manufacturer;
        String model;
        double retailPrice;

        System.out.print("Enter the manufacturer: ");
        manufacturer = k.nextLine();

        System.out.print("Enter the model: ");
        model = k.nextLine();

        System.out.print("Enter the retail price: ");
        retailPrice = k.nextDouble();

        System.out.println("\nHere is the data you provided: ");
        Cellphone cell = new Cellphone(manufacturer, model, retailPrice);

        System.out.printf("Manufacturer: %s\nModel number: %s\nRetail price: $%.2f", cell.getManufact(), cell.getModel(), cell.getRetailPrice());



    }
}
