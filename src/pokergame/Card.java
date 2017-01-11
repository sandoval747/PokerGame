package pokergame;

/**
 *
 * @author Maurice
 */
public class Card
{
    public enum Suit
    {
        HEARTS, SPADES, DIAMONDS, CLUBS
    }
    
    private Suit suit;
    private int value;
    
    public Card(Suit suit, int value)
    {
        this.suit = suit;
        this.value = value;
        
    }
}
