package java_20190722;

import java_20190722.aa.Notice;

public class Notice2Demo extends Notice {
	
		
		public static void main(String[] args) {
			
			Notice n1 = new Notice();			// public은 서로 다른 패키지도 접근가능
			n1.number = 1;
			// protected은 서로 다른 패키지 이면서 상속받은 경우에는 접근가능
			//n1.title = "공지사항";
			// default는 같은 패키지 내에서 접근가능
			//n1.hit = 0;
			// private는 같은 클래스내에서만 접근가능
			//n1.regdate = "2019";
			
			//부모클래스인 Notice에서 접근할 수있는 접근 한정자는 public, protected
			Notice2Demo n2 = new Notice2Demo();
			n2.number = 1;
			n2.title = "공지사항이빈다";
		}
	}
