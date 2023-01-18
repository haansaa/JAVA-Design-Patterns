
public class CafeLatteStrategy implements CoffeeStrategy{
	private /*static*/ final String CAFE_LATTE = "카페라떼";
	
	@Override
	public String brew() {
		// 카페라떼를 내리는 기능
		return CAFE_LATTE;
	} 
}
