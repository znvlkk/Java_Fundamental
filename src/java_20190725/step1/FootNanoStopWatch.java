package java_20190725.step1;

//1.요구사항은 밀리세컨드로 경과시간을 만들어주세요
public class FootNanoStopWatch {

	long startTime;
	long endTime;

	long startNanoTime;
	long endNanoTime;

	public double getElapsedTime() {
		return (double) (endTime - startTime) / (double) 1000;
	}

	public double getElapsedNanoTime() {
		return (double) (endNanoTime - startNanoTime) / (double) 1000000000;
	}

	public static void main(String[] args) {
		FootNanoStopWatch f1 = new FootNanoStopWatch();
		// currentTimeMills() -> 1970부터 1 1일부터 지금까지 시간을 밀리세컨드로 반환한다
		f1.startNanoTime = System.nanoTime();

		for (long i = 0; i < 23_000_000_000l; i++) {

		}

		f1.endNanoTime = System.nanoTime();

		double elapsedTime = f1.getElapsedNanoTime();
		System.out.printf("경과시간 : %.9f", elapsedTime);
	}
}
