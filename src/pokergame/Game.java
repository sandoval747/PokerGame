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
        Scanner input = new Scanner(System.in);
        String response;
        
        System.out.println("How many players are there in this game?");
        response = input.nextLine();
        
        while(isNumeric(response))
        {
            
        }
    }
    
    public void play()
    {
        System.out.println("You started a new Game.");
    }
}
