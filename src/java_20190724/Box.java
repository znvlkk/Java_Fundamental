package java_20190724;

public class Box {
	int width;
	int height;
	int depth;
	//final 변수는 멤버변수 위치에서 초기화해야함
	//한번정해지면 변경불가
	//final 변수명은 대문자로 하는것아이관례
	//final변수는 변수의 특성상 인스턴스변수로 처리하지않고static 변수로 처리함
	final String NAME="BOX";
	public void change(Box b) {
		//메서드내에서 매개변수를 포함한 사용자가 정의한 변수를 지역변수라고 한다
		//지역변수는 자동으로 초기화 되지 않기 때문에 기본값을 저장하고 사용한다
		//지역변수의 유효범위는 메서드 내에서만 사용가능
		int a =0;
		String str = null;
		double d= 0/0;
		
		int c= width +4;
		System.out.println(width);
		
		b.depth= 3000;
	}


}
