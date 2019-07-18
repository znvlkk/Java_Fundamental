package java_20190718;

public class LotteryDemo {
	public static void main(String[] args) {

		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) { // temp는 1보다 크거나 같고 45보다 작거나 같은 임의의 값. 매번 새로 생성되어야 한다
			double random = Math.random(); // Math.random() => 0보다 크거나 같고 1보다 작은 양수를 double값으로 반환한다
			int temp = (int) (random * 45) + 1;

			if (i == 0) { // 첫번째 방은 무조건 임의의 값 temp를 저장한다
				lotto[i] = temp;

			} else {
				// isExisted는 임의의 값 temp와 이전 배열의 값을 비교 했을때 동일한 값이 있는 경우는 true, 없으면 false
				boolean isExisted = false;
				// i==1아래의 for loop는 1번 반복,
				// i==2 아래의 for loop는 2번반복
				for (int j = 0; j < i; j++) {
					if (lotto[j] == temp) {
						// 새로생성한temp와 이전 배열의 값을 비교해서 같은 값이 존재하면
						isExisted = true;
						break;
					}
				}
				if (!isExisted) {
					lotto[i] = temp;
				} else {
					i--; // 이전위치로 변경함 for문에서 i++로 증가하기 때문에 원위치로 다시 시도할 수있음
				}
			}

		}
		for (int j = 0; j < 100; j++) {
			for (int i = 0; i < lotto.length - (j + 1); i++) {
				if (lotto[i] > lotto[i + 1]) {
					int temp = lotto[i];
					lotto[i] = lotto[i + 1];
					lotto[i + 1] = temp;
				}
				
			}
		}
	}



}
