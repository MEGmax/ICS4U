package javareview6;

// Write a program that makes a method call to a method named printGrade.
// The method call should accept an argument of double data type representing
// a students grade. The method should then print whether the student has achieved
// a grade of A, B, C, D, or F

public class TestVoidMethod
{
    public static void main(String[] args)
    {
        System.out.print("The grade is: ");
        printGrade(78.5);
        System.out.print("The grade is: ");
        printGrade(50.5);

    }
    public static void printGrade(double score)
    {
        if (score >= 90)
        {
            System.out.println('A');
        }
        else if (score >= 80)
        {
            System.out.println('B');
        }
        else if (score >= 70)
        {
            System.out.println("C");
        }
        else if (score >= 60)
        {
            System.out.println("D");
        }
        else
        {
            System.out.println('F');
        }
    }
}
