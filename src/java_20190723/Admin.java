package java_20190723;

public class Admin {
	private String id;
	private String pwd;
	private String email;
	private int level;
	//디폴트 생성자( default constructor) -> alt + shift + s => c
	public Admin() {
		super(); // 부모클래스의 디폴트 생성자를 호출
	}
	
	//생성자(constructor) -> alt + shift + s => o
	//생성자는 반환앖이 없고, 아이름은 클랴스 이름과 동일하게
	//역할은 인스턴스 변수 초기화(값을처음으로 할당)
	public Admin(String id, String pwd, String email, int level) {
		this.id=id;
		this.pwd=pwd;
		this.email=email;
		this.level=level;
	}
	
	public Admin(String id, String pwd, String email) {
		//this.id=id;
		//this.pwd=pwd;
		//this.email=email;
		this(id,pwd,email,0);//다른생성자 호출, 생성자에서만 사용가능
		//this 용법2가지
		//1. 자기자신객채 => this.
		//2. 다른생성자 호출 => this(~)
	}
		//instance변수의 setter,getter 생성 방법  a + s + s -> r
	
	public String getId() {
		return id;
	}

	public String getPwd() {
		return pwd;
	}

	public String getEmail() {
		return email;
	}

	public int getLevel() {
		return level;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setLevel(int level) {
		this.level = level;
	}

}
