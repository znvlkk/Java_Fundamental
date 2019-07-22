package java_20190722;

public class StaticMethodDemo {
	String name;
	static double interestRate;

	public void m1() {
		System.out.println("m1() 메서드 호출");
	}

	public void m2() {
		//instance method에서는 instance변수 , static변수 사용가능
		//instance 메서드, static 메서드 호출가능
		this.name = "고길동";
		StaticMethodDemo.interestRate = 0.1;
		this.m1();
		StaticMethodDemo.m3();

	}

	public static void m3() {
		System.out.println("m3() 메서드 호출");
	}

	public static void m4() {
		//static method에서는 this사용 불가능
		//static method에서는 instance변수 사용 불가능 , static변수 사용 가능
		//instance 메서드 호출 불가능,static 메서드 호출 가능
		
		//name = "뱉뫤";
		interestRate = 0.2;
		//m1();
		m3();
	}
	
	public static void main(String[] args) {
		StaticMethodDemo.m3();
		StaticMethodDemo.m4();
		StaticMethodDemo.interestRate = 1.4;
		
		StaticMethodDemo s1= new StaticMethodDemo();		
		s1.m1();
		s1.m2();
		s1.name="asdf";
		
	}
}
