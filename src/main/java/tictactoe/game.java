package tictactoe;

import java.util.ArrayList;


public class game {
	
	public void gameEngine()
	{
		char[][] gameboard= new char [][] {{'0', '0', 'X'}, {'X', 'O', 'X'}, {'O', 'X', 'O'}};
		horizontalrowpattern (gameboard);
    
}
    
    public void gamedecision(int user1count, int user2count)
    {
	    if (user1count==3)
		{
			System.out.println("user1 wins");
		}
		else if (user2count==3)
		{
			System.out.println("user2 wins");
		}
		else {
			System.out.println("withdraw");
		}
    }
    
 
    
    public void horizontalrowpattern(char[][]gameboard)
    {
    	int user1count = 0, user2count=0;
    	boolean flag= true;
    	for (int i=0; i<3; i++)
    	{
        	for (int j=0; j<3; j++)
        	{
		    	if (gameboard[i][j]=='X')
				{
					user1count++;
				}
				else if (gameboard[i][j]=='0')
				{
					user2count++;
				}
		    	    
        	}    	
        		gamedecision(user1count, user2count);	
	
        	
        	user1count=0;
        	user2count=0;
        	
        	
        }
  
    	
    }
    
    
 /*   public void diagonalpattern(char[][]gameboard)
    {
    	int user1count = 1, user2count=1;
    	for (int i=0; i<3; i++)
        {
        	for (int j=i; j<=i; j++)
        	{
		    	if (gameboard[i][j]=='X')
				{
					user1count= user1count+1;
				}
				else if (gameboard[i][j]=='0')
				{
					user2count= user2count+1;
				}
        	}
        }
    	gamedecision(user1count, user2count);
    }
  
	
    public void columnpattern(char[][]gameboard)
    {
    	int user1count = 1, user2count=1;
    	for (int i=0; i<3; i++)
        {
        	for (int j=0; j<=i; j++)
        	{
		    	if (gameboard[i][j]=='X')
				{
					user1count= user1count+1;
				}
				else if (gameboard[i][j]=='0')
				{
					user2count= user2count+1;
				}
        	}
        }
    	gamedecision(user1count, user2count);
    }*/
}
