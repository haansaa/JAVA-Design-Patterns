package duck;

import fly.FlyRocketPowered;
 
public class MiniDuckSimulator {
	public static void main(String[] args) {
		// p.57
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		/*
		이렇게 하면 MallardDuck에서 상속받은 performQuack() 메소드가 호출됩니다.
		이 메소드에서는 객체의 QuackBehavior에게 할 일을 위임하죠.
		(즉 quackBehavior 레퍼런스의 quack() 메소드가 호출됩니다)
		*/
		
		mallard.performFly();	// performFly() 메소드도 호출합니다.
		
		// --------- 수정 -----------
		// p.59
		Duck model = new ModelDuck();
		model.performFly();	// performFly()를 처음 호출하면 ModelDuck 새성자에서 설정되었던 flyBehavior, 즉 flyNoWay 인스턴스의 fly() 메소드가 호출된다 
		model.setFlyBehavior(new FlyRocketPowered());	// 이렇게 하면 행동 세터 메소드가 호출됩니다. 이제 모형 오리에 로켓의추진력으로 날 수 있는 능력이 생겼습니다.
		model.performFly();	// 제대로 돌아간다면 모형 오리는 동적으로 나는 행동을 바꿀 수 있습니다. 구현 코드가 Duck 클래스 안에 들어 있었다면 그렇게 할 수 없었겠죠 
	}
}
