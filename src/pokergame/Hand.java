package pokergame;

import java.util.ArrayList;

/**
 *
 * @author Maurice
 */
public class Hand implements Comparable<Hand>
{
    private ArrayList<Card> cards = new ArrayList<Card>();
    
    public Hand()
    {
        
    }

    @Override
    public int compareTo(Hand t)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void add(Card card)
    {
        cards.add(card);
    }
}
