package week06;

import java.util.ArrayList;
import java.util.List;

/*
 * 

i.     Fields

                1.     hand (List of Card)

                 2.     score (set to 0 in the constructor)

                 3.     name

ii.    Methods

                1.     describe (prints out information about the player and calls the describe method for each card in the Hand List)

                2.     flip (removes and returns the top card of the Hand)

                3.     draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)

               4.     incrementScore (adds 1 to the Player’s score field)

 */

public class Player {

	//fields
	private List<Card> hand = new ArrayList<>();
	private int score;
	private String name;
	
	//Constructor
	public Player(String name) {
		this.name = name;
		this.score = 0;
	}
	
	//describe method
	public void describe() {
		System.out.println(name + " has " + score + " points. Current cards:");
		for (Card card : hand) {
			card.describe();
		}
	}
	
	//flip method
	public Card flip() {
		return hand.remove(0);
	}
	
	//draw method
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	//incrementScore method
	public void incrementScore() {
		score += 1;
	}
	
	//Getters- added these later as I realized I needed them in my print statements in the main method,
	//since the describe method prints all their cards as well.
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
	
}
