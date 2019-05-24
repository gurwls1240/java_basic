package day07;

public abstract class Robot {
	private String name;
	
	private Moving moving;
	private Attacking attacking;
	
	
	public Robot(String name) {
		this.name = name;
	}
	public void attack() {
		System.out.print(name + " -> ");
		attacking.attack();
	}
	public void move() {
		System.out.print(name + " -> ");
		moving.move();
	}
	
	
	public void settingMove(Moving moving) {
		this.moving = moving;
	}
		
	public void settingAttack(Attacking attacking) {
		this.attacking = attacking;
	}
		
	
	
	
}
