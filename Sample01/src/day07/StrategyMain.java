package day07;

public class StrategyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Robot tg = new TaegwonV("TaegwonV");
		Robot at = new Atom("Atom");
		
		Moving fly = new Flying();
		Moving walk = new Walking();
		
		Attacking punch = new Punch();
		Attacking missile = new Missile();
		
		
		tg.settingAttack(punch);
		tg.settingMove(walk);
		
		at.settingAttack(missile);
		at.settingMove(fly);
		
		tg.attack();
		at.attack();
		tg.move();
		at.move();
		
		tg.settingAttack(missile);
		tg.attack();
		
		
		
	}

}
