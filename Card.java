package week6Assignment;

public class Card {

	private int value;
	private int name;
	
	public Card (int value, int name) {
		this.name = name;
		this.value = value;
	}
	
	public Card(int num) {
		this.name = num / 13;
		this.value = num % 13;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	
	public String describe() {
		String[] suits = {"Spades", "Clubs", "Diamonds", "Hearts"};
		String [] values = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		
		return values[value] + " of " + suits[name]; 
	}
}
