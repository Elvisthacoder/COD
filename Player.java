package gamer;

public class Player {
	private String handleName;
	private int lives;
	private int level;
	private int score;

	//Constructors
	public Player(String handleName) {
		super();
		this.handleName = handleName;
	}
	
	public Player(String handleName,int lives) {
		super();
		this.lives = lives;
	}


	public Player(String handleName,int lives,int level,int score) {
		super();
		this.level = level;
	}

	
	
	
	//handleName getter n setter
	public String getHandleName() {
		return handleName;
	}
	public void setHandleName(String handleName) {
		this.handleName = handleName;
	}
	
	//lives getter n setter
	public int getLives() {
		return lives;
	}
	public void setLives(int lives) {
		this.lives = lives;
	}
	
	//level getter n setter
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}

	// score getter n setter
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
	
	
	
	
	

}
