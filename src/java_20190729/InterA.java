package java_20190729;

public interface InterA extends InterB, InterC{
	// 인터페이스 변수 public static final이 생략되어 있음
	double PI = 3.14;
	//인터페이스 메서드의 접근 한정자를 붙이지 않으면 public이 생략되어 있음
	//abstract 생략 가능
	void mA();
}
