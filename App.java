package week06;

/*
 * 

2. Create a class called App with a main method.

a.      Instantiate a Deck and two Players, call the shuffle method on the deck.

b.     Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.

c.      Using a traditional for loop, iterate 26 times and call the flip method for each player.

    Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method on the player whose card has the higher value.  Print a message to say which player received a point.
    Note:  If the values are equal (it is a tie), print a message saying that no point was awarded.

d.      After the loop, compare the final score from each player.

e.      Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.

 

3.  Tips:  Printing out information throughout the game adds value including easier debugging as you progress and a better user experience.

a.  Using the Card describe() method when each card is flipped illustrates the game play.

b.  Printing the winner of each turn adds interest -- or a message indicating a tie.

c.  Printing the updated score after each turn shows game progression.

d.  At the end of the game: print the final score of each player and the winner’s name or “Draw” if the result is a tie.

 */

public class App {

	public static void main(String[] args) {
		
		//After instantiating my deck and players, I described each of them to check that the constructors worked correctly.
		Deck deck = new Deck();
//		deck.describe();
		
		Player player1 = new Player("Player 1");
//		player1.describe();
		
		Player player2 = new Player("Player 2");
//		player2.describe();
		
		//I also described the deck after shuffling as a check.
		deck.shuffle();
//		deck.describe();
	
		//I used a for loop going from 1 to 52 and alternated using the draw method of each player.
		for(int i = 1; i <= 52; i++) {
			if(i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}	
		//I used the describe method again as a quick check to make sure that my for loop and draw method worked.
//		player1.describe();
//		player2.describe();
		
		System.out.println("Welcome to War!");
		
		for(int i = 1; i <= 26; i++) {
			//flipping the cards
			Card player1Card = player1.flip();
			Card player2Card = player2.flip();
			//a descriptor of the players and their cards, and a line to separate it from the previous turn.
			System.out.println("-------------------------");
			//I used a print with no line break to combine the player name and card descriptor into one line.
			System.out.print(player1.getName() + " played: ");
			player1Card.describe();
			System.out.print(player2.getName() + " played: ");
			player2Card.describe();
			
			//comparing values and altering the score, or not if it is a tie.
			//I copied and pasted for the else if and forgot to change player1.incrementScore the first time through.
			//When I noticed player2 never got points I immediately spotted and fixed it.
			if(player1Card.getValue() > player2Card.getValue()) {
				player1.incrementScore();
				System.out.println(player1.getName() + " had a higher card! They get a point.");
			} else if(player2Card.getValue() > player1Card.getValue()) {
				player2.incrementScore();
				System.out.println(player2.getName() + " had a higher card! They get a point.");
			} else {
				System.out.println("It's a tie! No points gained.");
			}
			
			//end of turn score comparison, except for the final turn as I list the final scores directly below.
			if(i != 26) {
				System.out.println();
				System.out.println("Current scores:");
				System.out.println(player1.getName() + ": " + player1.getScore());
				System.out.println(player2.getName() + ": " + player2.getScore());
			}
		}
		
		//I added a line above the final score and winner declaration that matches the ones between turns.
		System.out.println("-------------------------");
		//Exactly the same print statements to display the score as I used from turn to turn, just copied and pasted.
		System.out.println("The game is over! Final scores:");
		System.out.println(player1.getName() + ": " + player1.getScore());
		System.out.println(player2.getName() + ": " + player2.getScore());
		
		//A simple if statement, similar to the card comparison one as there are printed messages for each result.
		//The draw is very rare, I ran the program over a dozen times and only got a tie once.
		if (player1.getScore() > player2.getScore()) {
			System.out.println(player1.getName() + " wins!");
		} else if (player2.getScore() > player1.getScore()) {
			System.out.println(player2.getName() + " wins!");
		} else {
			System.out.println("It's a draw!");
		}
	

	}

}
