package weather;

import java.util.ArrayList;

import observer.Observer;
import subject.Subject;
 
public class WeatherData implements Subject{	// 이제 WeatherData에서 Subject 인터페이스를 구현합니다.
	private ArrayList observers;	// Observer 객체들을 저장하기 위해 ArrayList를 추가했습니다...
	private float temperature;
	private float humidity;
	private float pressure;
	
	// Constructor
	public WeatherData() {
		observers = new ArrayList();// 그리고 생성자에서 그 객체를 생성합니다.	
	}
	
	// Subject 인터페이스를 구현하는 부분 -----------------------------
	public void registerObserver(Observer o) {	// 옵저버가 등록을 하면 목록 맨 뒤에 추가하기만 하면 됩니다
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {	// 마찬가지로, 옵저버가 탈퇴를 신청하면 목록에서 빼기만 하면 됩니다.
		int i = observers.indexOf(o);
		if(i > 0) {
			observers.remove(i);
		}
	}
	
	public void notifyObservers() {				
		// 여기가 정말 중요한 부분입니다. 상태에 대해서 모든 옵저버들한테 알려주는 부분이죠. 모두 Observer 인터페이스를 구현하는, 즉 update() 메소드가 있는 객체들이므로 손쉽게 알려줄 수 있습니다.																
		for(int i=0; i<observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(temperature,  humidity,  pressure);
		}
	}
	//----------------------------------------------------------
	public void measurementsChanged() {	// 기상 스테이션으로부터 갱신된 측정치를 받으면 옵저버들한테 알립니다.
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;	// 이 메소드를 써서 디스플레이 항목을 테스트해야 합니다. 
		measurementsChanged();
	}
	
	// 기타 WeatherData 메소드
}
