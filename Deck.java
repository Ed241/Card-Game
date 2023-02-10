package week6CodingAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	public List<Card> cards = new ArrayList<Card>();
	
	public Deck() {
		String[] names1 = {"Two of ", "Three of ", "Four of ", "Five of ", "Six of ", "Seven of ", "Eight of ", "Nine of ", "Ten of ", "Jack of ",
				"Queen of ", "King of ", "Ace of "};
		String[] valOfName = {"Clubs", "Spades", "Diamonds", "Hearts"};
		
		for(String val : valOfName) {
			int counter = 2;
			for(String name : names1) {
				Card card = new Card(name + val, counter);
				cards.add(card);
				counter++;
			}
		}	
	}
	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	
	public Card draw() {
		Card card = this.cards.remove(0);
		return card;
	}
	
	public void describe() {
		for(Card card : this.cards) {
			card.describe();
		}
	}

}
