package pokergame;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Maurice
 */
public class Deck
{
    private ArrayDeque<Card> cards = new ArrayDeque<Card>();
    
    public Deck()
    {
        addSuit(Card.Suit.CLUBS);
        addSuit(Card.Suit.DIAMONDS);
        addSuit(Card.Suit.HEARTS);
        addSuit(Card.Suit.SPADES);
    }
    
    private void addSuit(Card.Suit suit)
    {
        for(int i = 0; i < 13; i++)
        {
            Card card = new Card(suit, i);
            
            cards.add(card);
        }
    }
    
    public void shuffle()
    {
        ArrayList<Card> shufflableList = new ArrayList<Card>();
        for(Card card: cards)
        {
            shufflableList.add(card);
        }
        Collections.shuffle(shufflableList);
        cards = new ArrayDeque<Card>();
        for(Card card: shufflableList)
        {
            cards.add(card);
        }
    }
    
    public Hand deal()
    {
        Hand hand = new Hand();
        hand.add(cards.poll());
        hand.add(cards.poll());
        
        return hand;
    }
}
