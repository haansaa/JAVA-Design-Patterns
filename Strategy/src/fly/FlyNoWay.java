package fly;

public class FlyNoWay implements FlyBehavior{
	
	@Override 
	public void fly() {
		// 아무것도 하지 않음 - 날 수 없는 경우
		System.out.println("저는 못 날아요");
	}
}
