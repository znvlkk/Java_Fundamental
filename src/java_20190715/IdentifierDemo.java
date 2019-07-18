//특수문자중에 $,_는 사용할 수 있음
package java_20190715;
//클래스명의 첫글자는 대문자
//두단어가 합친경우에는 두번째단어의 첫글자는 대문자로(camel-case)
//
public class IdentifierDemo {
	public static void main(String[] args) {
		int age = 10;
		String name = "hello";
		
		//String 1fatherName = "John";
		//String mother Name = "Micheel";
		//String void = "empty";
		
		//자바는 유니코드를 지원하기 때문에 한글도 식별자로 샤용가능하지만 안쓰는게 조흥ㅁ
		String 이름 ="파하하";
		System.out.println(이름);
	}
}
