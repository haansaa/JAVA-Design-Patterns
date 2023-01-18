package unit;

import attack.AttackByFireball;
import move.MoveByTeleporting;
import weapon.WeaponExWand;

public class Wizard extends Unit{
	private static final int HP = 20;
	
	// 생성자
	public Wizard() {
		super(HP, WIZARD);
		move = new MoveByTeleporting();
		attack = new AttackByFireball();
		weapon = new WeaponExWand();
	}
	
//	public void display() {
//		System.out.println("초천재 대마법사 등장");
//	}
}
