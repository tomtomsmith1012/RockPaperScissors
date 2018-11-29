package rpsTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class RpsTest {

	@Test
	public void testPaperTie() {
		String player1 = "Paper";
		String player2 = "Paper";
		assertEquals("Player 1 and Player 2 do not match", "Tie", rockPaperScissors.Main.fight(player1, player2));
	}

	@Test
	public void testRockTie() {
		String player1 = "Rock";
		String player2 = "Rock";
		assertEquals("Player 1 and Player 2 do not match", "Tie", rockPaperScissors.Main.fight(player1, player2));
	}
	
	@Test
	public void testScissorsTie() {
		String player1 = "Scissors";
		String player2 = "Scissors";
		assertEquals("Player 1 and Player 2 do not match", "Tie", rockPaperScissors.Main.fight(player1, player2));
	}
	
	@Test
	public void testPWinRock() {
		String player1 = "Rock";
		String player2 = "Scissors";
		assertEquals("Player 1 did not win", "Player 1 wins", rockPaperScissors.Main.fight(player1, player2));
	}
	
	@Test
	public void testCWinRock() {
		String player1 = "Scissors";
		String player2 = "Rock";
		assertEquals("Player 2 did not win", "Player 2 wins", rockPaperScissors.Main.fight(player1, player2));
	}
	
	@Test
	public void testPWinScissors() {
		String player1 = "Scissors";
		String player2 = "Paper";
		assertEquals("Player 1 did not win", "Player 1 wins", rockPaperScissors.Main.fight(player1, player2));
	}
	
	@Test
	public void testCWinScissors() {
		String player1 = "Paper";
		String player2 = "Scissors";
		assertEquals("Player 2 did not win", "Player 2 wins", rockPaperScissors.Main.fight(player1, player2));
	}
	
	@Test
	public void testPWinPaper() {
		String player1 = "Paper";
		String player2 = "Rock";
		assertEquals("Player 1 did not win", "Player 1 wins", rockPaperScissors.Main.fight(player1, player2));
	}
	
	@Test
	public void testCWinPaper() {
		String player1 = "Rock";
		String player2 = "Paper";
		assertEquals("Player 2 did not win", "Player 2 wins", rockPaperScissors.Main.fight(player1, player2));
	}
	
}
