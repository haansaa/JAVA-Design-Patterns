package state;

import java.util.Random;

public class State {
	Random ran = new Random();
	
	private int locX;
	private int locY;
	private int hp;
	private int speed;
	
	// Constructor
	public State(int hp, int speed) {
		this.locX = ranX();
		this.locY = ranY();
		this.hp = hp;
		this.speed = speed;
		printInfo();
	}
	
	// location 랜덤 생성
	private int ranX() {
		int x = ran.nextInt(200) -100;
		return x;
	}
	private int ranY() {
		int y = ran.nextInt(200) -100;
		return y;
	}
	
	// 기본 정보 출력
	public void printInfo() {
		System.out.printf("위치 (%d, %d), hp : %d, speed : %d\n", this.locX, this.locY, this.hp, this.speed);
	}

	// getter & setter
	public int getLocX() {
		return locX;
	}

	public void setLocX(int locX) {
		this.locX = locX;
	}

	public int getLocY() {
		return locY;
	}

	public void setLocY(int locY) {
		this.locY = locY;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
}
