package java_20190723;

public class PrimeNumber {
	public void printPrimeNumber(int temp) {
		// temp => 50이면 50이하의 소수를 모두구하여 출력한다
		boolean isPrimeNumber = false;
		int count = 0;
		for (int i = 2; i <= temp; i++) {
			isPrimeNumber = true;
			for (int n = 2; n < i; n++) {
				if (i % n == 0) {
					isPrimeNumber = false;
					break;
				}
			}
			if (isPrimeNumber) {
				count++;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.printf("소수의 갯수 : %s%n", count);
	}

	public int[] getPrimeNumber(int temp) {
		int[] array = new int[temp];
		boolean isPrimeNumber = false;
		int count = 0;
		for (int i = 2; i <= temp; i++) {
			isPrimeNumber = true;
			for (int n = 2; n < i; n++) {
				if (i % n == 0) {
					isPrimeNumber = false;
					break;
				}
			}
			if (isPrimeNumber) {
				array[count] = i;
				count++;
				System.out.print(i + " ");
			}
		}
		int[] copyArray = new int[count];
		System.arraycopy(array, 0, copyArray, 0, count);
		return copyArray;

	}
}
