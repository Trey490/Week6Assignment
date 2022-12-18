package week6Assignment;

public class App {

	public static void main(String[] args) {
		
		Deck newDeck = new Deck();
		
		Player player1 = new Player("Trey");
		Player player2 = new Player("Caitlynn");
		
		newDeck.shuffle();
		
		for (int i = 0; i < 26; i++) {
			player1.draw(newDeck);
			player2.draw(newDeck);
			}
		
		player1.describe();
		player2.describe();
		
		
		int player1Value, player2Value; 
	
		
		for (int i = 0; i < 26; i++) {
			player1Value = player1.flip().getValue();
			
			player2Value = player2.flip().getValue();
			
				if (player1Value > player2Value) {
					player1.incrementScore();
						System.out.println(player1.getName() + " took the round ");
						
				}else if (player2Value > player1Value) {
					player2.incrementScore();
					System.out.println(player2.getName() + " took the round ");
					
				}
				else {
					System.out.println("Tie");
				}
				System.out.println(player1.getName() + " has " + player1.getScore() + " and " + player2.getName() + " has " + player2.getScore() + "\n");
				
	}
		
		System.out.println("Score: " + player1.getName() + " " + player1.getScore() + " to " + player2.getName() + " " + player2.getScore());
			if (player1.getScore() > player2.getScore()) {
				System.out.println(player1.getName() + " is the Champ!");
				
 			}
			else if (player2.getScore() > player1.getScore()) {
				System.out.println(player2.getName() + " is the Champ!");
				
			}
			else {
				System.out.println("Tie game!"); } 
			} 
	}
			
	
	

