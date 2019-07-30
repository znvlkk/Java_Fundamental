package java_20190729;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = new String("test");
		String s2 = new String("test");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		String s3 = "abc";
		String s4 = "abc";
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));

		String ssn = "111111-1111118";
		char c = ssn.charAt(6);
		System.out.println(c);

		ssn = ssn.concat("abcd");
		System.out.println(ssn);

		String fileName = "abc.abc.abc.abbbb.b.doc";
		if (fileName.endsWith("zip")) {
			System.out.println("압축파일입니다?");
		} else if (fileName.endsWith("doc")) {
			System.out.println("워드문ㅅ거이빈다");
		} else {
			System.out.println("파일입니까?");
		}

		System.out.println(fileName.equalsIgnoreCase("ABC.DoC"));

		// indexOf(String msg) : msg 문자열의 위치를 반한한다
		// msg 문자열을 처음부터 찾고 index는 처음부터 0으로 시작한다

		// lastIndexOf(String msg) : msg 문자열의 위치를 반한한다
		// msg 문자열을 찾을때 끝에서 찾고 index는 처음부터 0으로 시작한다

		int index = ssn.indexOf("-");
		System.out.println(index);

		System.out.println(fileName.indexOf("."));
		System.out.println(fileName.lastIndexOf("."));
		// 111111-1111118
		// subString(int first, int second)
		// first부터(포함), second(포함하지않음) 사이의 문자열을 추출한다
		// substring(int first)
		// first(포함) 보다 큰 모든 문자열을 추출한다
		String first = fileName.substring(0, fileName.lastIndexOf("."));
		String second = fileName.substring(fileName.lastIndexOf(".") + 1);
		System.out.println(first + "\n" + second);

		String html = "안녕하세여\n저는푸하핳입니다?\n푸하 푸하하";
		// replaceAll(String first, String second)
		// first 문자열을 second 문자열로 대체한다
		html = html.replaceAll("\n", "<br>");
		System.out.println(html);

		String url = "https://www.naver.com";
		String path = "/news";
		if (path.startsWith("/news")) {
			System.out.println("뉴스페이지입니다");
		} else if (path.startsWith("/sports")) {
			System.out.println("스포츠페이지입니다");
		} else {
			System.out.println("페이지가 존재하지 않습니다");
		}

		String m1 = "hello";
		String m2 = "hello ";
		System.out.println(m1.length());
		System.out.println(m2.length());
		if (m1.equals(m2.trim())) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		// toUpperCase() 대문자로 변환
		m1 = m1.toUpperCase();
		System.out.println(m1);

		// toLowerCase() 소문자로 변환
		m1 = m1.toLowerCase();
		System.out.println(m1);

		// String.valueOf() : primitive data type을 문자열로 변환한다
		int a = 10;
		String str = String.valueOf(a);

		char[] c1 = { 'a', 'b', 'c' };
		String str1 = String.valueOf(c1, 0, 2);
		System.out.println(str1);

		// ssn : 111111-11111118
		// split (String delimiter
		// 문자열을 구분자로 토큰화 시키는 메서드
		String[] strArray = ssn.split("-");
		System.out.println(strArray[0]);
		System.out.println(strArray[1]);

		String str2 = String.format("%,2d", 1234.478);
		System.out.println(str2);
		
		str2 = String.format("%,d", 1000000);
		System.out.println(str2);
	}
}
