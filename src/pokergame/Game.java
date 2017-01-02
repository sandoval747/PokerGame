package pokergame;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Maurice
 */
class Game
{
    private ArrayList<Player> players;
    private Round round;
    
    public Game()
    {
        
    }
    
    public void newGame()
    {
        int numPlayers;
        int startingBank;
        Scanner input = new Scanner(System.in);
        String response;
        boolean isValidResponse;
        
        //Determine number of players
        isValidResponse = false;
        while(!isValidResponse)
        {
            System.out.println("How many players are there in this game?");
            response = input.nextLine();
            
            try
            {
                numPlayers = Integer.valueOf(response);
                if(numPlayers > 0)
                {
                    isValidResponse = true;
                    System.out.println("");
                }
                else
                {
                    rejectNonIntegerMessage();
                }
            }
            catch (NumberFormatException ex)
            {
                rejectNonIntegerMessage();
            }
        }
        
        //Determine starting bank amount for each player
        isValidResponse = false;
        while(!isValidResponse)
        {
            System.out.println("How much money will each player "
                             + "start the game with?");
            response = input.nextLine();
            
            try
            {
                startingBank = Integer.valueOf(response);
                if(startingBank > 0)
                {
                    isValidResponse = true;
                    System.out.println("");
                }
                else
                {
                    rejectNonIntegerMessage();
                }
            }
            catch (NumberFormatException ex)
            {
                rejectNonIntegerMessage();
            }
        }
        
        //Add players to ArrayList of players
    }
    
    private void rejectNonIntegerMessage()
    {
        System.out.println("That is not a valid response. "
                         + "Please enter a positive integer value.");
        System.out.println("");
    }
    
    public void play()
    {
        System.out.println("You started a new Game.");
        System.out.println("");
    }
}
