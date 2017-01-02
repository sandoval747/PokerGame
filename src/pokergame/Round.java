package pokergame;

import java.util.ArrayList;

/**
 *
 * @author Maurice
 */
public class Round
{
    public enum Phase
    {
        PREFLOP, FLOP, RIVER, TURN
    }
    
    private ArrayList<Card> cards = new ArrayList<Card>();
    private Phase phase;
    private Deck deck;
    private int pot;
    private Player activePlayer;
    private Player dealer;
    
    public Round()
    {
        //Start in the preflop phase when a new Round is created
        this.phase = Phase.PREFLOP;
    }
    
}
