
public class HotChocolateStrategy implements CoffeeStrategy{
	private static final String HOTCHOCOLATE = "핫초코";
	@Override
	public String brew() {
		// 핫초코를 내리는 기능
		return HOTCHOCOLATE;
	}
} 
