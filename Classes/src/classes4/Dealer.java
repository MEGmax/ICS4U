package classes4;

import classes2.Die;

public class Dealer
{
    private int Die1Value;
    private int Die2Value;

    public Dealer()
    {
        Die1Value = 0;
        Die2Value = 0;
    }

    public void rollDice()
    {
        final int SIDES = 6;
        Die die1 = new Die(SIDES);
        Die die2 = new Die(SIDES);
        Die1Value = die1.getValue();
        Die2Value = die2.getValue();
    }

    public String getChoOrHan()
    {
        String result;
        int sum = Die1Value + Die2Value;
        if (sum % 2 == 0)
        {
            result = "Cho (even)";
        }
        else
        {
            result= "Han (odd)";
        }
        return result;
    }

    public int getDie1Value()
    {
        return Die1Value;
    }

    public int getDie2Value()
    {
        return Die2Value;
    }


}

