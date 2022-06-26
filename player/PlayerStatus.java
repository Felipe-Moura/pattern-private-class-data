package player;

public class PlayerStatus {
	
	private int damage;
	private int movement;
	
	public PlayerStatus(int damage, int movement) {
		this.damage = damage;
		this.movement = movement;
	}

	public int getDamage() {
		return damage;
	}

	public int getMovement() {
		return movement;
	}

}
