package javareview5.activites;

public class JavaReviewAct5a
{
    public static void main(String[] args)
    {
        final double KM_PER_MILE = 0.6215;
        final double MILE_PER_KM = 1.609;

        int j = 20;

        System.out.println("Miles      Kilometers   |   Kilometers       Miles");

        for (int i = 1; i <= 10; i++)
        {
            double milesInKm = i * MILE_PER_KM;
            double kmInMiles = j * KM_PER_MILE;
            System.out.printf("%-10d %-12.3f | %4d %20.3f\n", i, milesInKm, j, kmInMiles);
            j += 5;
        }



        }
    }

