package is.aadoj.TicTacToe;

import java.util.Scanner;
import is.aadoj.TicTacToe.TicTacToe.TicTacToeException;

public class TicTacToeConsoleUI
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		boolean gameOn = true;
		while(gameOn)
		{
			TicTacToe game = new TicTacToe();
			System.out.println("Welcome to TicTacToe, insert a number from 0-8 to place your mark.");
			while(!game.gameFinished())
			{
				//if(in.hasNextInt()){
					System.out.println(game.printBoard());
					try
					{
						game.insertChar(in.nextInt());
					} catch(TicTacToeException ex)
					{
						System.out.println(ex.getMessage());
					}
				/*} else {
					System.out.println("Illigal input, Not Integer");
					in.nextInt();
				}*/
			}
			System.out.println(game.printBoard());
			if (game.whoWon() == 0) 																// TODO:Laga whoWon
				System.out.println("It's a tie!");
			else
				System.out.println("Player " + game.whoWon() + " won!");							// TODO:Laga whoWon

			System.out.println("Another game? (Y/N)");
			String newGame = in.next();
			while(!(newGame.equals("Y") || newGame.equals("y") || newGame.equals("N") || newGame.equals("n")))
				System.out.println("Incorrect input, use either Y or N");

			if (newGame.equals("N") || newGame.equals("n"))
				gameOn = false;
		}
		
	}

	

}