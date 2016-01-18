package gamer;

public class Demo {

	public static void main(String[] args) {
		
		Soldier ghost = new Soldier(3,3000);
		
		ghost.takeDamage(500);
		//System.out.println(ghost.takeDamage(500));
		
		SuperSoldier brad = new SuperSoldier(3, 1000);
		
		System.out.println("Damage: "+brad.takeDamage(500));
		
		
		

	}

}
