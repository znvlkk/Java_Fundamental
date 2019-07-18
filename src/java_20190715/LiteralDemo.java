package java_20190715;

public class LiteralDemo {
	public static void main(String[] args) {
	
		//byte 범위를 넘어가면 컴파일 에러발생
		//byte a1 = (byte)128;
		//System.out.println(a1);
		
		int a1 = 128;
		int a2 = 076; //8진수
		int a3 = 0x123; //16진수
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		 
		//long 리터럴은 숫자뒤에 l,L로 표기함
		long a4 = 2200000000l;
		
		//float 리터럴은 소숫점 뒤에f,F로 표기함
		float f1 = 1234.43f;
		//double 리터럴은 소숫점 뒤에d,D로 표기, 생략가능
		double d1 =123455.56d;
		
		//boolean 리터럴은 true, false
		boolean isExisted = false;
		
		a1 = 10;
		d1 = 10.0d;
		// primitive data type의 == 연산자는 값만 비교함
		System.out.println(a1==d1);
		
		int b1 = 10;
		int b2 = b1;
		b2 = 20;
		System.out.println(b1);
		System.out.println(b2);
		
		
	}
}
