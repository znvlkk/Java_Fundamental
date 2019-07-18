package java_20190717;

public class ContinueDemo {
	public static void main(String[] args) {
	
	int sum = 0;
	for (int i = 1; i <= 10; i++) {
			if (i == 6) continue; // 6을  수행하지 않고 계속하라.
				sum += i;
	}
	System.out.printf("1부터 10까지 총 짝수 합은 %d입니다.", sum);
	
	if(true) return; //리턴을 만나면 main을 종료..
	
	for (int first = 2; first <= 9; first++) {
		for (int second = 1; second <= 9; second++) {
		if(second == 5) continue; 
		// second 변수가 5를 만나면, first 변수의 다음(first++)으로 이동
	System.out.printf("%d * %d = %d%n", first, second, first * second);
	}
	}
	
	}
}