package java_20190725.step2;

//1.요구사항은 밀리세컨드로 경과시간을 만들어주세요
public class StopWatch {

	long startTime;
	long endTime;

	long startNanoTime;
	long endNanoTime;

	public void start() {
		startTime = System.currentTimeMillis();
	}

	public void stop() {
		endTime = System.currentTimeMillis();
	}
	

	public void startNano() {
		startNanoTime = System.nanoTime();
	}

	public void stopNano() {
		endNanoTime = System.nanoTime();
	}

	public double getElapsedTime() {
		return (double) (endTime - startTime) / (double) 1000;
	}

	public double getElapsedNanoTime() {
		return (double) (endNanoTime - startNanoTime) / (double) 1000000000;
	}
}
