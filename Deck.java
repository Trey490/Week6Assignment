package week6Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	public List<Card> cards = new ArrayList<Card>();	
	
	public Deck() {
		for (int i = 0; i <52; i++) {
			cards.add(new Card(i));
			
		}
		
	}
	
	// Will shuffle deck
	public void shuffle() {
	Collections.shuffle(cards);
	
}
	
	// Will take first card then delete after it has been given to one of the players
	public Card draw() {
		Card cardDrawn = cards.get(0);
		cards.remove(cardDrawn);
		
		return cardDrawn;
	}
	
		
	}
	
