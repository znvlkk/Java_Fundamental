package java_20190722.aa;

public class NoticeDemo {
	public static void main(String[] args) {
		Notice n1 = new Notice();
		// public은 서로 다른 패키지도 접근가능
		n1.number = 1;
		// protected은 서로 다른 패키지 이면서 상속받은 경우에는 접근가능
		n1.title = "공지사항";
		// default는 같은 패키지 내에서 접근가능
		n1.hit = 0;
		// private는 같은 클래스내에서만 접근가능
		//n1.regdate = "2019";
	}
}
