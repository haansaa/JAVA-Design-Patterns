package main;

import Calculator.MinusCalculator;
import Calculator.PlusCalculator;
import people.People;

public class Main {
	public static void main(String[] args) {
		People people = new People();
		
		// 숫자 설정
		people.changeNumber(1,2);
		
		// Calculator 설정
		people.setCalculator(new PlusCalculator());
		/* setCalculator는 Calculator를 파라미터 값으로 받는데 PlusCalculator가 인터페이스 Calculator를 구현하기 때문에 조건 충족 가능 */
		double result1 = people.operate();
		System.out.println(result1);
		
		// 새로운 Calculator 설정 
		people.setCalculator(new MinusCalculator());
		double result2 = people.operate();
		System.out.println(result2);
	}
}
