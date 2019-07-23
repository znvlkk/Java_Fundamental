package java_20190723;

public class VarArgDemo {
	public long sum(int... temp) {
		long sum = 0; //지역변수, 메서드내에서 유요함
			for(int t : temp) {
				sum += t;
			}
			return sum;
	}
	
	public static void main(String[] args) {
		VarArgDemo v1 = new VarArgDemo();
		
		long s1 = v1.sum(1,2);
		System.out.println(s1);
		long s2 = v1.sum(1,2,3,4);
		System.out.println(s2);
	}
}
