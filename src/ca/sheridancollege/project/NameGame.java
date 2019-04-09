/*
 * Truc Pham
 * Student ID: 991511456
 * SYST10199 - Web Programming
 */
package ca.sheridancollege.project;

/**
 *
 * @author phamt
 */
public class NameGame extends Game 
        
{
    int playerSum = 0;
    int dealerSum = 0;
    public NameGame(String gameName)
    {
        super(gameName);
    }

    @Override
    public void play() {
        
    }

    @Override
    public boolean declareWinner() {
        if (playerSum > dealerSum) 
            return true;
        else
            return false;
    }
    
}
