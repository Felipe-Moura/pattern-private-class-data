package player;

public class Player {
	
	private PlayerStatus status;
	
	public Player(int damage, int movement) {
		this.status = new PlayerStatus(damage, movement);
	}
	
	public void attack() {
		System.out.println("The player attacked dealing " + status.getDamage() + " damage");
	}
	
	public void move() {
		System.out.println("The player moved " + status.getMovement() + " squares");
	}

}
