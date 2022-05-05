package classes1;

import classes2.Die;

public class classes3
{
    public static void main(String[] args)
    {
        final int SIX_SIDES = 6;
        final int TWENTY_SIDES = 20;

        Die sixDie = new Die(SIX_SIDES);
        Die twentyDie = new Die(TWENTY_SIDES);

        rollDie(sixDie);
        rollDie(twentyDie);



    }

    public static void rollDie(Die d)
    {
        System.out.println("Rolling a " + d.getSides() + " sides die");
        d.roll();
        System.out.println("The die value: " + d.getValue() );

    }

}
