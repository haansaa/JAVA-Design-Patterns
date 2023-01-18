package unit;

import attack.AttackByWielding;
import move.MoveByWalking;
import weapon.WeaponExSword;

public class Knight extends Unit{
	private static final int HP = 30;
	
	// 생성자
	public Knight() {
		super(HP, KNIGHT);
		move = new MoveByWalking();
		attack = new AttackByWielding();
		weapon = new WeaponExSword();
	}
	
//	public void display() {
//		System.out.println("기사 등장");
//	}
}
