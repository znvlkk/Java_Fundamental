package homework2;

public class MemberFindDto {
	private int seq;
	private String email;
	private String code;
	private String sdate;
	private String edate;
	//생성자 만들기
	protected MemberFindDto(int seq, String email, String code, String sdate, String edate) {
		this.seq = seq;
		this.email = email;
		this.code = code;
		this.sdate = sdate;
		this.edate = edate;
	}
	
	public int getSeq() {
		return seq;
	}
	//seq에 대한 setter 만들기 
	//seq에 대한 getter 만들기 
	
}
