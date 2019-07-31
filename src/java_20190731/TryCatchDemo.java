package java_20190731;

public class TryCatchDemo {
	public static double getAvg(int korean, int english) {
		int sum = korean + english;
		double avg = (double) sum / (double) 2;
		return avg;
	}

	public static void main(String[] args) {
		try {
			int korean = Integer.parseInt(args[0]);
			int english = Integer.parseInt(args[1]);
			double average = getAvg(korean, english);
			System.out.printf("평균 : %f", average);

		} catch (NumberFormatException e1) {
			// System.out.println("예외 메시지 : " + e1.getMessage());
			// e1.printStackTrace();
			System.err.println("문자말고 숫자? 너?");
		} catch (ArrayIndexOutOfBoundsException e2) {
			System.err.println("2개 너?");
		} finally {
			// 무조건 수행되는 블럭
			System.out.println("finally");
		}

	}

}
