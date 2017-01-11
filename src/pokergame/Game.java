package pokergame;

import java.util.ArrayDeque;
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
        int numPlayers = 0;
        int startingBank = 0;
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
        
        for(int i = 0; i < numPlayers; i++)
        {
            System.out.println("Player " + i + ", what is your name?");
            response = input.nextLine();
            
            Player player = new Player(response, startingBank);
            players.add(player);
            
            System.out.println("Welcome to the game, " + player.getName());
            System.out.println("");
        }
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
        
        ArrayDeque<Player> dealerRotation = new ArrayDeque<Player>();
        for(Player player: players)
        {
            dealerRotation.add(player);
        }
        
        while(players.size() > 1)
        {
            Player dealer = dealerRotation.poll();
            dealerRotation.add(dealer);
            
            round = new Round(players, dealer);            
            players = round.play();
            
            eliminatePlayers();

        }
        
       
    }
    
    private void eliminatePlayers()
    {
        for(Player player : players)
        {
            if(player.getBank() <= 0)
            {
                players.remove(player);
            }
        }
    }
    
}
