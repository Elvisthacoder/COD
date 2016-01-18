package gamer;

public class SuperSoldier extends Soldier{
//inheritance displayed through extending Soldier
	
	//Constructor for variable values
	public SuperSoldier(int lives, int hitpoints) {
		super(lives, hitpoints);
		
	}
	public int takeDamage(int damage){
		//Makes sure damage is half
		damage = damage/2; 
		//Checks Number of hit points and displays message
		if(getHitpoints() < 3000){
			//displays message to console....
			System.out.println("This is a Super Soldier man! Add more points...");
		}
		
		int remainingHitpoints = super.getHitpoints() - damage;
		return remainingHitpoints;
	}
	

}
