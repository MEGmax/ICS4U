package classes1;

import java.util.Scanner;

public class RoomAreas
{
    public static void main(String[] args)
    {
        double number;
        double totalArea;

        Scanner k = new Scanner(System.in);

        Rectangle kitchen = new Rectangle();
        Rectangle bedroom = new Rectangle();
        Rectangle den = new Rectangle();

        System.out.println("What is the kitchen's length? ");
        number = k.nextDouble();
        kitchen.setLength(number);

        System.out.println("What is the kitchen's width? ");
        number = k.nextDouble();
        kitchen.setWidth(number);

        System.out.println("What is the bedroom's length? ");
        number = k.nextDouble();
        bedroom.setLength(number);

        System.out.println("What is the bedroom's width? ");
        number = k.nextDouble();
        bedroom.setWidth(number);

        System.out.println("What is the den's length? ");
        number = k.nextDouble();
        den.setLength(number);

        System.out.println("What is the den's width? ");
        number = k.nextDouble();
        den.setWidth(number);

        totalArea = kitchen.getArea() + bedroom.getArea() + den.getArea();

        System.out.println("THe total area of the rooms is " + totalArea);

        k.close();

    }
}
