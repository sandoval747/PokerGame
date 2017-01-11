package pokergame;

import java.util.ArrayDeque;
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
    private ArrayList<Player> players = new ArrayList<Player>();
    private Phase phase;
    private Deck deck;
    private int pot;
    private Player activePlayer;
    private Player dealer;
    private ArrayDeque<Player> turnRotation;
    
    public Round(ArrayList<Player> players, Player dealer)
    {
        //Start in the preflop phase when a new Round is created
        this.phase = Phase.PREFLOP;
        this.players = players;
        this.deck = new Deck();
        this.deck.shuffle();
        this.dealer = dealer;
        this.pot = 0;
                
        //Add players to the turn rotation
        this.turnRotation = new ArrayDeque<Player>();
        for(Player player: players)
        {
            turnRotation.add(player);
        }
        
        //Set Active Player to the one after the dealer
        while(!activePlayer.equals(dealer))
        {
            nextPlayer();
        }
        nextPlayer();
        
        //Deal cards
        deal();
    }
    
    public ArrayList<Player> play()
    {
        return this.players;
    }
    
    private void nextPlayer()
    {
        activePlayer = turnRotation.poll();
        turnRotation.add(activePlayer);
    }
    
    private void deal()
    {
        for(Player player: turnRotation)
        {
            
            player.setHand(deck.deal());
        }
    }
}
