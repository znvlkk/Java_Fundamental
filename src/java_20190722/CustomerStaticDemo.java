package java_20190722;

import java_20190719.Customer;

public class CustomerStaticDemo {
	public static void main(String[] args) {
		
		//static 변수는 클래스 이름으로 접근한다
		Customer.interestRate=3.7;

		Customer c1 = new Customer();
		c1.name = "홍길동";
		c1.age = 40;
		c1.email = "zzz@asdf.com";
		c1.phone = "010-1234-5678";
		c1.balance = 190000.43;
		c1.isReleased = false;
		//final 변수는 재할당 할 수 업승ㅁ
		//Customer.BANKNAME = "국민은행";
		//static 변수는 클래스 이름으로 접근하는 것이 관례이지만 reference로도 접근이 가능하다(비권장)
		//c1.interestRate = 3.5;

		Customer c2 = new Customer();
		c2.name = "홍진호";
		c2.age = 22;
		c2.email = "222@2222.com";
		c2.phone = "010-2222-2222";
		c2.balance = 22222222.22;
		c2.isReleased = false;

		System.out.println(Customer.interestRate);
		
		Customer c3 = new Customer();
		c3.name = "구선생";
		c3.age = 99;
		c3.email = "bidulgi@dove.com";
		c3.phone = "010-9999-9999";
		c3.balance = 99999999.99;
		c3.isReleased = true;
		
		System.out.println(Customer.interestRate);
		
	}

}
