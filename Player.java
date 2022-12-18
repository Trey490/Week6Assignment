package week6Assignment;

import java.util.ArrayList;
import java.util.List;

public class Player {

	List<Card> hand = new ArrayList<>();
	private int score;
	private String name;
	
	
	public Player (String name) {
		this.name = name;
		this.score = 0;
		this.hand = new ArrayList<Card> ();	
		}
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public int getScore() {
		return score;
	}
	public void describe() {
		System.out.println("\n" + name + " has drawn:");
		for (Card card : hand) {
			System.out.println(card.describe());
		}
	}
	
	public Card flip() {
		Card inHand = hand.get(0);
		hand.remove(0);
		System.out.println(name + " plays " + inHand.describe());
		
		return inHand;
		}
	

	public void draw (Deck deck) {
		Card inHand = deck.draw();
		hand.add(inHand);
			
		}
	
	public void incrementScore() {
		
		this.score++;
	}
	}
	