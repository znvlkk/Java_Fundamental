package java_20190725;

public class Parent {
	static {
		staticParent = 20;
		System.out.println("Parent static 초기화");
	}
	static int staticParent;
	String name;
	{
		System.out.println("Parent instance block");
	}

	public Parent()

	{
		System.out.println("Parent 생성자");
	}
}
