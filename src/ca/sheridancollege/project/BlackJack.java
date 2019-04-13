package ca.sheridancollege.project;
import java.util.ArrayList;
import java.util.Scanner; 

/* This is the main class of our project BlackJack
@author: Truc,Divjot,Nguyen,Gaurav
@version:1.4
@since: 22 march,2019
*/

public class BlackJack{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //String nickname1;
        String input;
        int playerNo;
        boolean isValidNumber =false;

        Game game = new NameGame("Welcome To BlackJacK");
        ArrayList<Game> name = new ArrayList<Game>();
        name.add(game);
        System.out.println(name.get(0).getGameName());
        System.out.println("*********************************");
        do {
        System.out.println("How many players are there? (Enter 1 - 4)");
        
        Scanner playerCount = new Scanner(System.in);
        
        playerNo = playerCount.nextInt();
        if (checkNumber(playerNo))//here you will add conditions for the other two method calls
            {
                
            isValidNumber=true;
            System.out.print("Number of player is: "+playerNo);  
            }
        else {
        System.out.println("Invalid Length Input. The player must less than 5");
        }
        }
        while (!isValidNumber);
    
       
        
        

            // new game message
            System.out.println();
            System.out.println("Now Game is started.");
            System.out.println();
            System.out.println("\n Please enter players names");
             String [] names = new String[playerNo];
    
                

            for(int i =0; i<playerNo;i++){
                Scanner playerName= new Scanner(System.in);
                //nickname1 =playerName.nextLine();
                 names[i] = playerName.nextLine();}
                 for (String i : names){
                System.out.println("Welcome " + i + ". Enjoy your game! ");
                
                  }
                 do {
            for (String i :names){
            int money = 100;          // Amount of money the user has.
            int bet;
                
             
            Player player = new Player_1(i) ;
            Player dealer = new Player_1("Dealer");
            int totalDealerSum = dealer.getHandSum();
            int totalPlayerSum = player.getHandSum();
            boolean userWin = false;
            System.out.println(i + " have " + money + " dollars.");
            do
            {
                System.out.println("How many dollars do you want to bet?  (Enter 0 to end.)");
                System.out.print("? ");
                bet = scanner.nextInt();
                if (bet < 0 || bet > money)
                {
                    System.out.println("Your answer must be between 0 and " + money + '.');
                }
            } while (bet < 0 || bet > money);
            if (bet == 0)
            {
                break;
            }
            //userWins = playBlackjack();
            
            
            System.out.println();
            if (money == 0)
            {
                System.out.println("Looks like you've are out of money!");
                break;
            }
        
            
            Desk deck = new Desk();
            deck.shuffle();
            boolean gameOver = false;
            

            // give cards to the player
            player.addCard(deck.draw());
            player.addCard(deck.draw());
            System.out.println(player.getHandAsString(false));
            
            
            // give cards to the dealer
            dealer.addCard(deck.draw());
            dealer.addCard(deck.draw());
            System.out.println(dealer.getHandAsString(true));
            
           

            // player's turn
            do {
                System.out.println("Would " + player.getNickname() + " like to Hit or Stand? 'H/S'");
                do {
                    input = scanner.nextLine();
                } while (!input.equalsIgnoreCase("H") && !input.equalsIgnoreCase("S"));

                // BUST
                if (input.equalsIgnoreCase("H")) {
                    player.addCard(deck.draw());
                    System.out.println(player.getNickname() + " drew a card.");
                    System.out.println();
                    System.out.println(player.getHandAsString(false));
                    if (player.getHandSum() > 21) {
                        System.out.println(
                                "You busted and got a total of " + player.getHandSum() + ". Dealer wins this time!");
                        gameOver = true;
                        userWin= false;
                    }
                }
                // STAY
                if (input.equalsIgnoreCase("S")) {
                    System.out.println("You have chosen to Stand. Your hand: " + player.getHandSum());
                }

            } while (input.equalsIgnoreCase("H") && !gameOver);

            // dealer's turn
            if (!gameOver) {
                System.out.println();
                System.out.println("- Dealers turn -");
                System.out.println();
                System.out.println(dealer.getHandAsString(false));
            }

            while (!gameOver) {

                if (dealer.getHandSum() <= 15) {
                    // DRAW CARD
                    dealer.addCard(deck.draw());
                    System.out.println(dealer.getNickname() + " drew another card");
                    System.out.println();
                    System.out.println(dealer.getHandAsString(false));
                    if (dealer.getHandSum() == 15) {
                        System.out.println("Blackjack! Dealer won.");
                        gameOver = true;
                        userWin= false;
                    }
                    if (dealer.getHandSum() > 21) {
                        System.out.println("Dealer busted and got a total of " + dealer.getHandSum() + ". "
                                + player.getNickname() + " wins this time!");
                        gameOver = true;
                        userWin= true;
                    }

                } else {
                    // STAY
                    System.out.println("Dealer has chosen to Stand!");
                    System.out.println();
                    totalDealerSum = dealer.getHandSum();
                    totalPlayerSum = player.getHandSum();

                    if (totalDealerSum > totalPlayerSum) {
                        System.out.println("Both players has decided to stand. The winner is " + dealer.getNickname()
                                + " with a total of " + totalDealerSum + ".");
                        userWin= false;
                    } else {
                        System.out.println("Both players has decided to stand. The winner is " + player.getNickname()
                                + " with a total of " + totalPlayerSum + ".");
                        userWin= true;
                    }
                    gameOver = true;
                    
                }
                
                }
            if (userWin)
            {
                money = money + bet;
                
            } else
            {
                money = money - bet;
            }
             System.out.println(i + " have " + money + " dollars.");
            }
            
            // ask for new game
            System.out.println();
            System.out.println("Would you like to start a new game?  'Y/N' :");
            do {
                input = scanner.nextLine();
            } while (!input.equalsIgnoreCase("Y") && !input.equalsIgnoreCase("N"));

        } while (input.equalsIgnoreCase("Y"));
        
        // tidy up
        scanner.close();
    }
        
    public static boolean checkNumber(int s)
        {
            if(s <= 4 )
        {
        return true;
        }
        return false;
        }
      public static boolean checkWinner(int s)
        {
            if(s >= 21 )
        {
        return true;
        }
        return false;
        }
     
       public static boolean checkMoney(int n)
        {
            if(n <=100 )
        {
        return true;
        }
        return false;
        }
     
}