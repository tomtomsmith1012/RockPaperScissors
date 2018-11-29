package rockPaperScissors;

public class Main {

	public static void main(String[] args) {
		
		String Player1 = "Rock";
		String Player2 = "Paper";
		
		//input rps
		//random number
		//computer assigned rps

	}
	
	public static String fight(String player1, String player2) {
		//check who wins
		
		if ((player1 == "Paper") && (player2 == "Paper")) {
			return "Tie";
		}
		else if ((player1 == "Rock") && (player2 == "Rock")) {
			return "Tie";
		}
		else if ((player1 == "Scissors") && (player2 == "Scissors")) {
			return "Tie";
		}
		
		else if ((player1 == "Rock") && (player2 == "Scissors")) {
			return "Player 1 wins";
		}
		
		else if ((player1 == "Scissors") && (player2 == "Rock")) {
			return "Player 2 wins";
		}
		
		
		else if ((player1 == "Scissors") && (player2 == "Paper")) {
			return "Player 1 wins";
		}
		
		else if ((player1 == "Paper") && (player2 == "Scissors")) {
			return "Player 2 wins";
		}
		
		else if ((player1 == "Paper") && (player2 == "Rock")) {
			return "Player 1 wins";
		}
		
		else if ((player1 == "Rock") && (player2 == "Paper")) {
			return "Player 2 wins";
		}
		
		
		return "";
	}

	
	
}
