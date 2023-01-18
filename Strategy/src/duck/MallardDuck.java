package duck;

import fly.FlyWithWings;
import quack.Quack;
 
public class MallardDuck extends Duck{		// MallardDuck은 Duck 클래스에서 quackBehavior와 flyBehavior 인스턴스 변수를 상속받는다는 것을 잊지 마세요. 
	
	// 생성자
	public MallardDuck() {				
		quackBehavior = new Quack();		// MallardDuck에서는 꽥꽥거리는 소리를 처리할 때는 Quack 클래스를 사용하기 때문에
											// performQuack()이 호출되면 꽥꽥거리는 행동은 Quack 객체에게 위임됩니다. 결과적으로 진짜 꽥꽥거리는 소리를 들을 수 있겠죠
		flyBehavior = new FlyWithWings();	// 그리고 FlyBehavior 형식으로는 FlyWithWings를 사용합니다		
	}
	
	public void display() {
		System.out.println("저는 물오리입니다.");
	}
}
