package soduko;
import java.util.Scanner;

// i = column, j = row
// i = y, j = x
// 0 stands for blank

public class board
{
	int gameboard[][];
	Scanner sc = new Scanner(System.in);
	int currenty, currentx;
	int currentinput;
	
	// Constructor method. Creates a main board
	public board() {
		//this.gameboard = new int[9][9];
		this.gameboard = new int[][]{
			  { 0, 1, 0, 0, 0, 2, 9, 4, 6},
			  { 0, 0, 5, 0, 4, 7, 0, 0, 0},
			  { 6, 0, 0, 0, 0, 8, 0, 0, 5},
			  { 0, 0, 0, 0, 7, 0, 4, 0, 1},
			  { 0, 0, 0, 5, 0, 4, 0, 0, 0},
			  { 7, 0, 4, 0, 6, 0, 0, 0, 0},
			  { 4, 0, 0, 7, 0, 0, 0, 0, 2},
			  { 0, 0, 0, 4, 9, 0, 3, 0, 0},
			  { 5, 8, 1, 2, 0, 0, 0, 9, 0},
			};
	}
	
	public void createSample()
	{
		for(int i = 0; i < 9; i++)
		{
			for(int j = 0; j < 9; j++)
			{
				this.gameboard[i][j] = 0;
			}
		}
	}
	
	public void insertValues() {
		for(int i = 0; i < 9; i++)
		{
			for(int j = 0; j < 9; j++)
			{
				this.currentx = j + 1;
				this.currenty = i + 1;
				
				System.out.println("Please input value for (" + this.currentx +"," + currenty + ") :");
				currentinput = sc.nextInt();
				
				if(!(currentinput >= 1) && !(currentinput <= 9))
				{
					this.gameboard[i][j] = 0;
				}
				else
				{
					this.gameboard[i][j] = currentinput;
				}
				
			}
		}
		sc.close();
	}
		
	public void printBoard()
	{			
		for(int i = 0; i < 9; i++)
		{
			for(int j = 0; j < 9; j++)
			{
				if(gameboard[i][j] == 0)
				{
					if(j%3==2)
					{
						System.out.print(" ¦¦");
					}
					else
					{
						System.out.print(" ¦");
					}
				}
				else
				{
					if(j%3==2)
					{
						System.out.print(gameboard[i][j] + "¦¦");
					}
					else
					{
						System.out.print(gameboard[i][j] + "¦");
					}
				}
			}
			if(i%3==2)
			{
				System.out.print("\n=====================\n");
			}				
			else
			{
				System.out.print("\n---------------------\n");
			}
		}
	}
	
	public boolean checkColumn(int number,int xvalue)
	{
		boolean result = true;
		// int compare = 0;
		
		for(int i = 0; i < 9; i++)
		{
			if(gameboard[i][xvalue] == number ) // If the current entered number is found in column
			{
				result = false;
			}
		}
		
		return result; // returns true if the number is not found in the column
	}
	
	public boolean checkRow(int number, int yvalue)
	{
		boolean result = true;
		
		for(int i = 0; i < 9; i++)
		{
			if(gameboard[yvalue][i] == number)
			{
				result = false;
			}
		}
		
		return result; // returns true if the number is not found in the column
	}
	
	public boolean checkBox(int number, int xvalue, int yvalue)
	{
		boolean result = true;
		
		// Create a way to figure out which one of the 9 boxes that the given value is in
		if()
		
		
		
		return result;
	}
	
}

