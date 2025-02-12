package week06;

/*
 * 

        i.     Fields

                           1.     value (contains a value from 2-14 representing cards 2-Ace)

                           2.     name (e.g. Ace of Diamonds, or Two of Hearts)

               ii.    Methods

                   1.     Getters and Setters

                   2.     describe (prints out information about a card)

 */

public class Card {
	
	//I have an additional field for suit to make creating 52 cards quicker.
	//This is a holdover from last week's lab where the instructions had all 3 fields for the Card class.
	private String name;
	private String suit;
	private int value;
	
	//Constructor
	public Card(String name, String suit, int value) {
		this.name = name;
		this.suit = suit;
		this.value = value;
	}
	
	//describe function- this prints out the information in a way that makes it easy to understand.
	//I have two versions of the print line as I don't consider the value necessary to show, but wanted it still present.
	//Leaving it in but commented out makes it easier to access if I want it without having to retype it.
	public void describe() {
		System.out.println(name + " of " + suit);
//		System.out.println(name + " of " + suit + ": " + value);
	}
	
	
	//Getters
	public String getName() {
		return name;
	}
	
	public String getSuit() {
		return suit;
	}
	
	public int getValue() {
		return value;
	}
	
	
	//Setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	public void setValue(int value) {
		this.value = value;
	}

}
