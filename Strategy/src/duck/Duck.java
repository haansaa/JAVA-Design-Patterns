package duck;

import fly.FlyBehavior;
import quack.QuackBehavior;
 
public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;	// 모든 Duck에는 QuackBehavior 인터페이스를 구현하는 것에 대한 레퍼런스가 있다
	// 행동 인터페이스 형식의 레퍼런스 변수 두개를 선언합니다. (같은 패키지에 속하는) 모든 서브클래스에서 이 변수를 상속받습니다.
	
	// Constructor
	public Duck() {}
	
	// setter
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
	
	// 기타 코드
	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();			// 행동 클래스에 위임한다
	}
	
	public void performQuack() {
		quackBehavior.quack();		// 꽥꽥거리는 행동을 직접 처리하는 대신, quackBehavior로 참조되는 객체에 그 행동을 위임한다
	}
	
	public void swim() {
		System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠.");
	}
	
	
	// 기타 오리 관련 메소드
}
