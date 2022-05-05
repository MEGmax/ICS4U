package arrays1;

public class ArrayAlgorithms
{
    public static void main(String[] args)
    {
        double[] myList = new double[10];
        java.util.Scanner input = new java.util.Scanner(System.in); //alternate way of creating scanner

        //***********************************************************
        //[ 0, ,0 ,0 ,0 ,0 ,0 ,0 ,0 ,0 ,0 ,0 ,0] elements
        //[ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 ] index

        //Header
        System.out.println("Example 1: Initializing an array With Input Values:");

        //ask the user to input x values (for this example it is 10 values)
        System.out.println("Please enter " + myList.length + " values: ");

        //run for loop to assign values to the arrays for the index's 0-9
        for (int i = 0; i < myList.length; i++)
        {
            System.out.print("Enter value " + (i + 1) + ": "); //0 + 1 = 1
            myList[i] = input.nextDouble(); //record value entered
        }

        System.out.println(); //new line for new example

        //***********************************************************

        System.out.println("Example 2: Initializing Arrays With Random Values");

        for (int i = 0; i < myList.length ; i++)
        {
            myList[i] = Math.random() * 100; //math.random gives a decimal, * 100 to get rid of it
        }

        System.out.println();

        //***********************************************************

        //header
        System.out.println("Example 3: Displaying Arrays");

        //print the random values created in example 2
        for (int i = 0; i < myList.length; i++)
        {
            System.out.println(myList[i]);
        }

        System.out.println(); //new line for new example

        //***********************************************************

        //header
        System.out.println("Example 4: Summing all Elements");

        //initialize and declare total variable
        double total = 0;

        //run for loop to keep a running total for the total variable
        for (int i = 0; i < myList.length; i++)
        {
            total += myList[i];
        }
        //display results
        System.out.println("The sum of the my list array is: " + total);

        System.out.println(); //new line for new example

        //***********************************************************

        //header
        System.out.println("Example 5 : Finding the Largest Element");

        //start max with the first number in the array. Since it is the first value it is also the largest
        double max = myList[0];

        //run this block as long as i is less than the array length (10 times)
        for (int i = 0; i < myList.length; i++)
        {
            //if the index being tested holds a higher value than max then run this block
            if(myList[i] > max)
            {
                max = myList[i]; //reassign max
            }

        }

        //output results
        System.out.println("The maximum number in the array is " + max);

        System.out.println(); //new line for new example

        //***********************************************************

        //header
        System.out.println("Example 6: Finding the Smallest Index of the Largest Element");

        //create new array
        int [] myListArray = {1, 5, 3, 4, 5, 5};

        //new max and set it equal to the first index
        int max2 = myListArray[0];

        //this is the index of the max
        int indexOfMax = 0;

        //run for each element of the array
        for (int i = 0; i < myListArray.length; i++)
        {
            //if element being tested is greater than max than run this block
            if (myListArray[i] > max2)
            {
                max2 = myListArray[i]; //reassign max
                indexOfMax = i; //the index of the max value is i
            }
        }

        //output results
        System.out.println("The index of the largest number is: " + indexOfMax);

        System.out.println();//new line for new example

        //***********************************************************

        //header
        System.out.println("Example 7: Random Shuffling");

        //run this block for each index of the array
        for (int i = 0; i < myListArray.length; i++)
        {
            int j = (int) (Math.random() * myList.length); //generates a random value from 0-9
            double temp = myList[i]; //temporarily hold the current value for myList[i] in temp
            myList[i] = myList[j]; //take the value found at myList[j] and assign it to myList[i]
            myList[j] = temp; //take the value found at temp and assign it to myList[j]
        }

        //use this loop to print results
        for (int i = 0; i < myList.length; i++)
        {
            System.out.println(myList[i]);
        }

        System.out.println(); //new line for new example

        //***********************************************************

        //header
        System.out.println("Example 8: Shifting Elements");

        //start with first value in array
        double temp = myList[0];

        //starting with 1 because 1-1=0
        for (int i = 1; i < myList.length; i++)
        {
            myList[i - 1] = myList[i]; //this will shift the elements left by assigning for example myList[0] to myList[1]

        }

        //this will move the first element to the last position
        myList[myList.length - 1] = temp; //for example myList[9] = myList[0]

        //print array that is shifted left using a for loop
        for (int i = 0; i < myList.length; i++)
        {
            System.out.println(myList[i]);
        }

        //close keyboard
        input.close();

    }
}
