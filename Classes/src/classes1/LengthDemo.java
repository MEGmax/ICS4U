package classes1;

public class LengthDemo
{
    public static void main(String[] args)
    {
        Rectangle box = new Rectangle(15, 15);
        Rectangle box2 = new Rectangle();

        System.out.println("The boxes length is " + box.getLength());
        System.out.println("The boxes width is " + box.getWidth());
        System.out.println("The area of the rectangle is " + box.getArea());

        box.setLength(10);
        box.setWidth(10);

        System.out.println("The boxes length is " + box.getLength());
        System.out.println("The boxes width is " + box.getWidth());
        System.out.println("The area of the rectangle is " + box.getArea());

        System.out.println("Box 2 length is " + box2.getLength());
        System.out.println("Box 2 width is " + box2.getWidth());
        System.out.println("Area of box 2 of the rectangle is " + box2.getArea());



    }

}
