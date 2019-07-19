package java_20190719;

public class CustomerDemo {
	public static void main(String[] args) {
		
		//Customer 객체생성
		//Customer => Object type
		//c1 => reference
		//new Customer() => Object
		Customer c1 = new Customer();
		c1.name = "푸하하";
		c1.age = 77;
		c1.email = "hahaman@puhaha.com";
		c1.phone = "010-4444-7777";
		c1.balance = 23000000000.23;
		c1.isReleased = false;
		
		System.out.printf("%s, %d, %s, %s, %,.2f, %s", 
							c1.name, c1.age,c1.email,c1.phone,c1.balance,c1.isReleased);
		
		Customer c2 = new Customer();
		c2.name = "키요옷";
		c2.age = 54;
		c2.email = "calmdownman@puhaha.com";
		c2.phone = "010-2432-3425";
		c2.balance = 1200000.23;
		c2.isReleased = true;
			
		Customer c3=c2;
		c3.age = 22;
		
		System.out.printf("\n%s, %d, %s, %s, %,.2f, %s", 
				c2.name, c2.age,c2.email,c2.phone,c2.balance,c2.isReleased);
		
	}
}
