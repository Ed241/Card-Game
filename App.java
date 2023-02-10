package week6CodingAssignment;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
		
		long startTime;
		long endTime;
		long timeElapsed;
		
		startTime = System.nanoTime(); 
		
		List<Card> hand1 = new ArrayList<Card>();
		List<Card> hand2 = new ArrayList<Card>();
		
		Player player1 = new Player("John",hand1, 0);
		Player player2 = new Player("Kyle", hand2, 0);
		
		deck.shuffle();
		
		for(int i = 0; i < deck.cards.size() ; i++) {
			hand1.add(deck.draw());
			i--;
			hand2.add(deck.draw());
		}
		
		
		int roundCounter = 1;
		for(int i = 0; i < player1.hand.size(); i++) {
			
			System.out.println("Round " + roundCounter);
			
			roundCounter++;
			
			Card card1 = player1.flip();
			Card card2 = player2.flip();
			
			if(card1.getValue() == card2.getValue()) {
				System.out.print("\n" +player1.name + " drew a ");
				card1.describe();
				System.out.print("\n" +player2.name + " drew a ");
				card2.describe();
				System.out.println("\n" + "This round ends in a draw");
				
			}else if(card1.getValue() > card2.getValue()) {
				player1.incrementScore();
				System.out.print("\n" + player1.name + " drew a ");
				card1.describe();
				System.out.print("\n" + player2.name + " drew a ");
				card2.describe();
				System.out.println("\n" + player1.name + "Wins this Round. New Score: " + player1.score + "\n");
						
			}else if(card1.getValue() < card2.getValue()) {
				player2.incrementScore();
				System.out.print("\n" + player1.name + " drew a ");
				card1.describe();
				System.out.print("\n" +player2.name + " drew a ");
				card2.describe();
				System.out.println("\n" + player2.name + "Wins this Round. New Score: " + player2.score + "\n");
			}
			i--;
		}
		System.out.println("\n" + "Final score for " + player1.name + ": " + player1.score +"\n");
		System.out.println("Final score for " + player2.name + ": " + player2.score + "\n");
		if(player1.score == player2.score) {
			System.out.println("Game ended in a draw");
		}else if(player1.score > player2.score) {
			System.out.println( player1.name + " won the game");
		}else if(player1.score < player2.score) {
			System.out.println( player2.name + " won the game");
		}
		endTime = System.nanoTime();
		timeElapsed = endTime - startTime;
		
		System.out.println("Total time: " + timeElapsed);
		
		
		
		
		
		
		
		
		
		
	}

}
