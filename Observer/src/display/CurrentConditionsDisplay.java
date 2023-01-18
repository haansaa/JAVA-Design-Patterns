package display;

import observer.Observer;
import subject.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement{	// WeatherData 객체로부터 변경 사항을 받기 위해서 Observer를 구현합니다.
														  // API 구조상 모든 디스플레이 항목에서 DisplayElement를 구현하기로 했기 때문에 이 인터페이스도 구현합니다.
	private float temperature;
	private float humidity;
	private Subject weatherData;
	 
	// Constructor
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	// 옵저버 구현 메서드
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;	// update()가 호출되면 기온과 습도를 저장하고 display()를 호출합니다.
		display();
	}
	
	// 디스플레이엘리멘트 구현 메서드
	public void display() {
		System.out.println("Current conditions : " + temperature + "F degrees and " + humidity + "% humidity");
		// display() 메소드에서는 가장 최근에 얻은 기온과 습도를 출력합니다.
	}
	
}
