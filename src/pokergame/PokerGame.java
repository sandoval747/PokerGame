package pokergame;

import java.util.Scanner;

/**
 *
 * @author Maurice
 */
public class PokerGame
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String response;
        
        System.out.println("Welcome to Poker Game.");
        System.out.println("");
        System.out.println("What would you like to do?");
        System.out.println("New Game (N), Exit (X)");
        
        response = input.nextLine();
        response = response.toUpperCase();

        while(!response.equals("X"))
        {
            if(response.equals("N"))
            {
                System.out.println("");
                
                Game game = new Game();
                game.newGame();
                game.play();
                
                break;
            }
            else
            {
                System.out.println("I'm sorry, that's not a valid response.");
                System.out.println("");
                System.out.println("What would you like to do?");
                System.out.println("New Game (N), Exit (X)");
                response = input.nextLine();
                response = response.toUpperCase();
            }
        }
    }
}
