package Sokoban;

public class Level extends SokobanGame {

	private int lengthOfLevel;
	private int heightOfLevel;
	private int numberOfMoves;
	
	
	public Level()
	{
		this.lengthOfLevel = 25;
		this.heightOfLevel = 15;
		addTilesToLevel(lengthOfLevel, heightOfLevel);
		
}
	
	public Level(int lengthOfLevel, int heightOfLevel)
	{
		this.lengthOfLevel = lengthOfLevel;
		this.heightOfLevel = heightOfLevel;
		addTilesToLevel(lengthOfLevel, heightOfLevel);
	}

	private void addTilesToLevel(int lengthOfLevel, int heightOfLevel) {
		// TODO Auto-generated method stub
		
		int xCoord = 0;
		int yCoord = 0;
		for(int i = 0; i < (lengthOfLevel * heightOfLevel); i++)
		{
			if(xCoord == lengthOfLevel)
			{
				xCoord = 0;
				yCoord++;
			}
			getTilesOnLevel().add(new Tile(i, xCoord, yCoord, 0, 0));
			xCoord++;
		}
	}
	
}
