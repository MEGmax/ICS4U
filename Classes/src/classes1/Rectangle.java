package classes1;

public class Rectangle
{
    private double length;
    private double width;

    public Rectangle()
    {

    }


    public Rectangle(double len, double w)
    {
        length = len;
        width = w;
    }

    //mutator method
    public void setLength(double len)
    {
        length = len;

    }

    //mutator method
    public void setWidth(double w)
    {
        width = w;
    }

    //accessor method
    public double getLength()
    {
        return length;
    }

    //accessor method
    public double getWidth()
    {
        return width;
    }

    //accessor method
    public double getArea()
    {
        return length * width;
    }
}
