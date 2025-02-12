package week06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/*
 * i.     Fields

                         1.     cards (List of Card)

               ii.    Methods

                         1.     shuffle (randomizes the order of the cards)

                         2.     draw (removes and returns the top card of the Cards field)

                         3.     In the constructor, when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards.

 */

public class Deck {
	//I copied and pasted the contents of my final version of the Deck class from last week's lab.
	
	//field
	private List<Card> cards = new ArrayList<>();
	
	
	//Constructor- my initial constructor was not very efficient. See the constructSuit method commented out at the bottom.
	//After completing the lab, I wanted to see if there was a better way to create 52 cards.
	//I liked how it was done in the lab walkthrough and copied it into my code while following along.
	public Deck() {
		String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
		String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
						"Ten", "Jack", "Queen", "King", "Ace"};
		for (String suit : suits) {
			int counter = 2;
			for (String name : names) {
				cards.add(new Card(name, suit, counter));
				counter++;
			}
		}
//		constructSuit("Hearts");
//		constructSuit("Diamonds");
//		constructSuit("Spades");
//		constructSuit("Clubs");
	}
	
	//shuffle method- I opted to use the shuffle method available to Collections.
	//I found it while looking for ways to randomize ArrayLists, and it seemed like the most straightforward way to do it.
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	//At first I tried to work out a way to randomly remove a card, but then I remembered I'd always be shuffling first.
	//So I simply use remove on the first element in the list (top card of the deck).
	public Card draw() {
		return cards.remove(0);
	}
	
	//describe method- not required here, but a good way to check if the constructor and shuffle methods are working as intended.
	public void describe() {
		for (Card card : cards) {
			card.describe();
		}
	}
	
	
	//Here is my initial constructSuit method, repeated four times in the constructor.
	//It was much more tedious to type out and took many more lines of code than the version in the walkthrough,
	//which is why I decided to change it and comment out my original.
	//However, I left it here to show my process.
//	private void constructSuit(String suit) {
//		for (int i = 2; i <= 14; i++) {
//			switch(i) {
//				case 2 :
//					cards.add(new Card("Two", suit, i));
//					break;
//				case 3 :
//					cards.add(new Card("Three", suit, i));
//					break;
//				case 4 :
//					cards.add(new Card("Four", suit, i));
//					break;
//				case 5 :
//					cards.add(new Card("Five", suit, i));
//					break;
//				case 6 :
//					cards.add(new Card("Six", suit, i));
//					break;
//				case 7 :
//					cards.add(new Card("Seven", suit, i));
//					break;
//				case 8 :
//					cards.add(new Card("Eight", suit, i));
//					break;
//				case 9 :
//					cards.add(new Card("Nine", suit, i));
//					break;
//				case 10 :
//					cards.add(new Card("Ten", suit, i));
//					break;
//				case 11 :
//					cards.add(new Card("Jack", suit, i));
//					break;
//				case 12 :
//					cards.add(new Card("Queen", suit, i));
//					break;
//				case 13 :
//					cards.add(new Card("King", suit, i));
//					break;
//				case 14 :
//					cards.add(new Card("Ace", suit, i));
//					break;
//			}
//		}
//	}
	
}
