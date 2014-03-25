package p;

public class MyGameP{
    public static final String version  = "1.0";
    public static final String creator = "t3kot3ko";
    
    public int playerCount;
    protected int _turnNum;
    public int remainTime;
	public char gameType;

    public void start()
    {
    	if (playerCount != 0)
    	{
    		playerCount = 0;
    		System.out.println("A new player joined the game.");
    	}
    }

	void startGameP() {

		
		if (gameType != 'P')
		{
			gameType = 'P';
			System.out.println("Game P start.");
		}
		
		start();
	}

	protected void extracted() {
		start();
		
		if (gameType != 'P')
		{
			gameType = 'P';
			System.out.println("Game P start.");
		}
	}

}