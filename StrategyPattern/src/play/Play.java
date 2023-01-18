package play;

import unit.Citizen;
import unit.Knight;
import unit.Unit;
import unit.Wizard;

public class Play {
	public static void main(String[] args) {
		Unit[] citizens = new Unit[3];
		for(int i=0; i<citizens.length; i++) {
			citizens[i] = new Citizen();
			citizens[i].performMove();
			citizens[i].performWeapon();
			citizens[i].performAttack();
			System.out.println("-------");
		}
		System.out.println("+++++++++++++++++++");
		
		Unit[] knights = new Unit[3];
		for(int i=0; i<knights.length; i++) {
			knights[i] = new Knight();
			System.out.println("-------");
			knights[i].performMove();
			knights[i].performWeapon();
			knights[i].performAttack();
		}
		System.out.println("+++++++++++++++++++");
		
		Unit[] wizards = new Unit[3];
		for(int i=0; i<wizards.length; i++) {
			wizards[i] = new Wizard();
			System.out.println("-------");
			wizards[i].performMove();
			wizards[i].performWeapon();
			wizards[i].performAttack();
		}
		System.out.println("+++++++++++++++++++");
		
		
		
	}
}
