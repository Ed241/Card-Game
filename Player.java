package week6CodingAssignment;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	public List<Card> hand = new ArrayList<Card>();
	public int score;
	public String name;
	
	public Player(String name, List<Card> hand, int score) {
		this.hand = hand;
		this.name = name;
		this.score = score;
		
		this.score = 0;
	}
	
	public void describe() {
		System.out.println(this.name + this.score + "Player hand: ");
		for(int i = 0; i < this.hand.size(); i++) {
			System.out.println(this.hand.get(i));
		}
	}
	
	public Card flip() {
		Card card = this.hand.remove(0);
		return card;
	}
	
	public Card draw(Deck deck) {
		Card card = deck.draw();
		this.hand.add(card);
		return card;
	}
	
	public void incrementScore() {
		this.score++;
	}

}
