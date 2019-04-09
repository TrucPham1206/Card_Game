/*
 * Truc Pham
 * Student ID: 991511456
 * SYST10199 - Web Programming
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author phamt
 */
import java.util.Random;
public class DeskOfCard {

private Card[] deck;
private static final Random random = new Random();

private int currentCard; 
private static int numCard = 52;

public DeskOfCard(){

    Face [] faces = {Face.ACE, Face.TWO, Face.THREE, Face.FOUR, Face.FIVE, Face.SIX,
                     Face.SEVEN, Face.EIGHT, Face.NINE, Face.TEN, Face.JACK, Face.QUEEN,
                     Face.KING};
    Suit[] suits = {Suit.HEARTS, Suit.SPADES, Suit.DIAMONDS, Suit.CLUBS};

    deck = new Card [numCard]; // create array with Cards (52)
    currentCard = 0;

    //Populate deck with Cards
    for(int count = 0; count < deck.length; count++)
        deck [count] = new Card(faces [count % 13], suits [count / 13]) {};
}

public void shuffleDeck(){
    currentCard = 0;

    for (int first = 0; first < deck.length; first++){

        int second = random.nextInt(numCard); //Select a random card from number 0-51 (Number_of_cards)

        //Loops through all the cards and swaps it with the "Second" card which is randomly chosen card from hte same list.
        Card temp = deck[first];
        deck [first] = deck [second];
        deck [second] = temp;
    }
}

public void getCardDeck(){
    int start = 1;
    for(Card k : deck) {
        System.out.println("" + start + "/52 " + k);
        start++;
    }
}

public Card dealNextCard(){

    //Get the top card
    Card topCard = this.deck[0];

    //shift all the subsequent cards to the left by one index
    for(int currentCard = 1; currentCard < numCard; currentCard ++){
        this.deck[currentCard-1] = this.deck[currentCard];
    }
    this.deck[numCard-1] = null;

    //decrement the number of cards in our deck
    this.numCard--;

    return topCard;
}
}