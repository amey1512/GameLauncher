public class GuessGame {
	Player p1;
	Player p2;	
	Player p3;
	
	void startGame() {
		 p1 = new Player();
		 p2 = new Player();
		 p3 = new Player();
		
		 int guessedP1 = 0;
		 int guessedP2 = 0;
		 int guessedP3 = 0;
		 
		 System.out.println("Game Started !!!");
		 
		 int targetNumber = (int)(Math.random() * 10);
		 System.out.println("Target number is - "+targetNumber);
	
		 while(true) {
			 p1.guessNumber();
			 p2.guessNumber();
			 p3.guessNumber();
			 
			 guessedP1 = p1.number;
			 guessedP2 = p2.number;
			 guessedP3 = p3.number;
			 
			 if(guessedP1 == targetNumber || guessedP2 == targetNumber || guessedP3 == targetNumber) {
				System.out.print("The Number is guessed correctly\n");
				break;
			}
			else {
				System.out.print("Still guessing !! \n");
			}
		}
	}
}
