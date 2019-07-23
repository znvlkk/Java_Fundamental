package java_20190723;

public class AdminDemo {
	public static void main(String[] args) {
		Admin a = new Admin("zxc123","123123","zzz@zzz.com",1);
		//a.setId("zxc123");
		//a.setPwd("123123");
		//a.setEmail("zzz@zzz.com");
		//a.setLevel(1);
		System.out.printf("%s,%s,%s,%d %n",a.getId(),a.getPwd(),a.getEmail(),a.getLevel());
	}
}
