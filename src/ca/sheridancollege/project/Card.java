/*
 * Truc Pham 
 * Student ID: 991511456
 * SYST10199 - Web Programming
 */
package ca.sheridancollege.project;

/**
 *
 * @author phamt and divjot
 */
public abstract class Card {

    private final Face face;

    private final Suit suit;

    public Card(Face face, Suit suit) {
        this.face = face;
        this.suit = suit;
    }

    public Face getFace() {
        return face;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return face + " of " + suit;
    }

}
