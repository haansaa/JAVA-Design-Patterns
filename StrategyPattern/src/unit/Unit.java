package unit;

import java.util.Random;

import attack.Attack;
import move.Move;
import state.State;
import weapon.Weapon;

public abstract class Unit extends State{
	static Random ran = new Random();
	protected static final int CITIZEN = 111;
	protected static final int KNIGHT = 112;
	protected static final int WIZARD = 113;
	
	String name;
	
	Move move;
	Attack attack;
	Weapon weapon;
	
	// Constructor
	public Unit(int hp, int code) {
		super(hp, ranSpeed());
		this.name = nameGenerator();
		printInfo(code);
	}
	
	// speed
	private static int ranSpeed() {
		return ran.nextInt(6)+5;
	}
	
	// setter
	public void setMove(Move m) {
		move = m;
	}
	
	public void setAttack(Attack a) {
		attack = a;
	}
	
	public void setWeapon(Weapon w) {
		weapon = w;
	}
	
	// -----------
//	public abstract void display();
	
	public void performMove() {
		move.move();
	}
	
	public void performAttack() {
		attack.attack();
	}
	
	public void performWeapon() {
		weapon.weapon();
	}
	
	public String nameGenerator() {
		String[] spell = {"유", "민", "다", "엘", "예", "리", "나"};
		String tmpName = spell[ran.nextInt(spell.length)];
		tmpName += spell[ran.nextInt(spell.length)];
		
//		System.out.println("이름 : " + tmpName);
		
		return tmpName;
	}
	
	
	public void printInfo(int code) {
		String result = "☆★☆★ ";
		if(code == CITIZEN) {
			result += "평범하고 싶은 시민 ";
		}else if(code == KNIGHT) {
			result += "위대한 빛의 기사 ";
		}else {
			result += "초천재 대마법사 ";
		}
		
		result += this.name + " 등장☆★☆★";
		System.out.println(result);
	}
}
