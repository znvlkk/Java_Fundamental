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
		
		int index = ssn.indexOf("-");
		System.out.println(index);
		
		System.out.println(fileName.indexOf("."));
		System.out.println(fileName.lastIndexOf("."));
		
		String first = fileName.substring(0,fileName.lastIndexOf("."));
		String second = fileName.substring(fileName.lastIndexOf(".")+1);
		System.out.println(first + "\n" + second);
		
	}
}
