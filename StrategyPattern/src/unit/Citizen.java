package unit;

import attack.AttackByPunching;
import move.MoveByWalking;
import weapon.WeaponExHands;

public class Citizen extends Unit{
	private static final int HP = 10;
	
	// 생성자
	public Citizen() {
		super(HP, CITIZEN);
		move = new MoveByWalking();
		attack = new AttackByPunching();
		weapon = new WeaponExHands();
	}
	
//	public void display() {
//		System.out.println("시민 등장");
//	}
	
}
