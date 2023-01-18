
public class Road {
	public static void main(String[] args) {
		// 도로 위에 커피머신을 설치합니다
		CoffeeMachine coffeeMachine = new CoffeeMachine();
		
		// 아메리카노 버튼을 누르면 아메리카노 전략을 넣어 아메리카노를 추출해줍니다
		String americano = coffeeMachine.brew(americanoButton());
		System.out.println(americano);
		 
		// 카페라떼 버튼을 누르면 아메리카노 전략을 넣어 아메리카노를 추출해줍니다.
		String cafelatte = coffeeMachine.brew(cafeLatteButton());
		System.out.println(cafelatte);
		
		// 핫초코 버튼을 누르면 핫코모 전략을 넣어 아메리카노를 추출해줍니다.
		String hotchocolate = coffeeMachine.brew(hotChocolateButton());
		System.out.println(hotchocolate);
	}
	
	public static CoffeeStrategy americanoButton() {
		return new AmericanoStrategy();
	}
	
	public static CoffeeStrategy cafeLatteButton() {
		return new CafeLatteStrategy();
	}
	
	public static CoffeeStrategy hotChocolateButton() {
		return new HotChocolateStrategy();
	}
}
