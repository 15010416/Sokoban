package Sokoban;

public class Coordinate {

	private int xCoord;
	private int yCoord;
	
	public Coordinate(int xCoord, int yCoord)
	{
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}
	
	public int getXCoord()
	{
		return this.xCoord;		
	}
	
	public int getYCoord()
	{
		return this.yCoord;
	}
}
