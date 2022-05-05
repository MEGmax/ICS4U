package arrays3;


public class DeckOfCards
{
    public static void main(String[] args)
    {

        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", };

        for (int i = 0; i < deck.length; i++)
        {
            deck[i] = i;
        }

        //this will shuffle
        for (int i = 0; i < deck.length ; i++)
        {
            int index = (int)(Math.random() * deck.length); //will generate a number between 0 and 51
            int temp = deck[i];
            deck[i] = deck[index]; //this is where it does the first switch
            deck[index] = temp;
        }

        for (int i = 0; i < 4 ; i++)
        {
            String suit = suits[deck[i] / 13]; //determines the suit
            String rank = ranks[deck[i] % 13];
            System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
        }
    }
}
