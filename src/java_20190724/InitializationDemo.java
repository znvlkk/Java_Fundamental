package java_20190724;

//i18n -> 국체화 Internationalization
//l10n -> 지역화 localization
public class InitializationDemo {
	int a;
	static int b;
	static final int c = 10;
	//static 초기화
	static {
		System.out.println("static area");
		b=100;
	}
	// 생성자에서 초기화 할 수 있는 변수는 instance변수
	public InitializationDemo(int a) {
		this.a = a;
	}
	
	public static void main(String[] args) {
		System.out.println("main area");
		InitializationDemo i = new InitializationDemo(1000);
		System.out.println(i.a);
		System.out.println(b);
		System.out.println(c);
		
	}
}
