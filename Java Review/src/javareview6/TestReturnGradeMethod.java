package javareview6;

public class TestReturnGradeMethod
{
    public static void main(String[] args)
    {
        System.out.print("The grade is: " + getGrade(78.4));
        System.out.print("\nThe grade is: " + getGrade(62.3));
    }

    public static char getGrade(double score)
    {
        if (score >= 90)
        {
            return 'A';
        }
        else if (score >= 80)
        {
            return 'B';
        }
        else if (score >= 70)
        {
            return 'C';
        }
        else if (score >= 60)
        {
            return 'D';
        }
        else
        {
            return 'F';
        }
    }

}
