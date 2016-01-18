package gamer;

public class Soldier {

	private int lives;
	private int hitpoints;
	
	
	public int getLives() {
		return lives;
	}
	
	public Soldier(int lives, int hitpoints) {
		super();
		this.lives = lives;
		this.hitpoints = hitpoints;
	}
	
	public void setLives(int lives) {
		this.lives = lives;
	}
	public int getHitpoints() {
		return hitpoints;
	}
	public void setHitpoints(int hitpoints) {
		this.hitpoints = hitpoints;
	}
	public int takeDamage(int damage){
		int remainingHitpoints = 0;
		//getHitpoints() sets access to private variable hitpoints
	    remainingHitpoints = getHitpoints() - damage;
		
		return remainingHitpoints;
	}
	
}

