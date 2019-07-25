package java_20190725;

public class ShapeDemo {

	public static void run(Shape s) {
		s.draw();
	}

	public static void main(String[] args) {
		// 추상클래스는 객체를 생성 할 수 없음
		// Shape s =new Shape(); -> X
		//Rectangle r = new Rectangle();
		//Shape s1 = r;
		//s1.draw();

		run(new Rectangle());
		
		Shape s2 = new Circle();
		//s2.draw();
		
		run(s2);
	}
}
