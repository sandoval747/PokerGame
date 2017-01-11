package pokergame;

/**
 *
 * @author Maurice
 */
public class Player
{
    private String name;
    private Hand hand;
    private int bank;
    
    public Player(String name, int bank)
    {
        this.name = name;
        this.bank = bank;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public int getBank()
    {
        return this.bank;
    }
    
    public void setHand(Hand hand)
    {
        this.hand = hand;
    }
    
}
