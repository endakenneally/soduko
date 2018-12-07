package soduko;

public class soduko {
	public static void main(String[] args)
	{
		// int[][] board = new int[9][9];
		
		board game = new board();
		//game.createSample();
		//game.insertValues();
		game.printBoard();
		System.out.println(game.checkColumn(1, 0));
	}	
}
