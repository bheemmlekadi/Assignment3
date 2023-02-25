package assignment3;

import java.util.*;

class Guesser
{
	int guessNum;
	
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Guesser kindly guess the number and number should be"
				+ " between 1 to 100");
		
		guessNum=scan.nextInt();
		if(guessNum>0 && guessNum<101) {
			return guessNum;
		}
		else {
			System.out.println("Number crosses the limit, "
					+ "Please guess the number between 1 to 100");
			return 0;
		}
	}	
}

class Player
{
	int guessNum;
	
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Player kindly guess the number and number should be"
				+ " between 1 to 100");
		guessNum=scan.nextInt();
		if(guessNum>0 && guessNum<101) {
		return guessNum;
		}
		else {
			System.out.println("Number crosses the limit, "
					+ "Please guess the number between 1 to 100");
			return 0;
		}
	}
}

class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		
		numFromGuesser=g.guessNum();
	}
	void collectNumFromPlayers()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numFromPlayer1=p1.guessNum();
		numFromPlayer2=p2.guessNum();
		numFromPlayer3=p3.guessNum();
	}
	void compare()
	{
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("All players won the game");
				System.out.println("All Players entered into Semi-Finals");
				
				Umpire u=new Umpire();
				u.collectNumFromGuesser();
				u.collectNumFromPlayers();
				u.compare();
				System.out.println("All Players entered into Semi-Finals");

				
			}
			else if(numFromGuesser==numFromPlayer2 )
			{
				System.out.println("Player 1 & Player2 won");
				System.out.println("Player 1 and Player 2 entered into Finals");
				
				Umpire u=new Umpire();
				u.collectNumFromGuesser();
				u.collectNumFromPlayers();
				u.compare();	
				System.out.println("Player 1 and Player 2 entered into Finals");

			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1 & Player3 won");
				System.out.println("Player 1 and Player 3 entered into Finals");
				
				Umpire u=new Umpire();
				u.collectNumFromGuesser();
				u.collectNumFromPlayers();
				u.compare();			
				System.out.println("Player 1 and Player 3 entered into Finals");

			}
			else
			{
			System.out.println("Player 1 won the game");
			System.out.println("Player 1 won the series");
			}
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 2 & Player3 won");
			}
			else
			{
			System.out.println("Player 2 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player 3 won the game");
		}
		else
		{
			System.out.println("Game lost Try Again!");
		}
		
	}
	
}

public class GuesserGame {
	
	public static void main(String[] args) {
		Umpire u=new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayers();
		u.compare();
		
	}

}
