package java_20190722;

public class Member {

	private String name;
	private String zipcode;
	private String addr1;
	private String addr2;
	private String ssn1;
	private String ssn2;
	private int age;
	private String regdate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getAddr1() {
		return addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getAddr2() {
		return addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	public String getSsn1() {
		return ssn1;
	}

	public void setSsn1(String ssn1) {
		this.ssn1 = ssn1;
	}

	public String getSsn2() {
		return ssn2;
	}

	public void setSsn2(String ssn2) {
		this.ssn2 = ssn2;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	/*
	 * // name => setter, getter 메서드 // name에 대한 getter메서드 => 인스턴스 name정보를 가져올수있는
	 * 메서드 public String getName() { // name에 대한 getter메서드 return this.name; }
	 * 
	 * // name에대한 setter메서드 => 인스턴스name정보를 변경할수있는 메서드 public void setName(String
	 * name) { // name에 대한 setter메서드 this.name = name; }
	 * 
	 * public String getAddress() { return this.address; }
	 * 
	 * public void setAddress(String address) { this.address = address; }
	 * 
	 * public String getSsn() { return this.ssn; }
	 * 
	 * public void setSsn(String ssn) { this.ssn = ssn; }
	 * 
	 * public int getAge() { return this.age; }
	 * 
	 * public void setAge(int age) { this.age = age; }
	 * 
	 * public String getRegdate() { return this.regdate; }
	 * 
	 * public void setRegdate(String regdate) { this.regdate = regdate; }
	 */

}
