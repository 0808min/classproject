package ver02;

class Contact {

//	저장 정보
//	 이름 전화번호 이메일 주소 생일 그룹

	private String name;
	private String phonenumber;
	private String email;
	private String address;
	private String birthday;
	private String group;

	public Contact(String name, String phoneNumber, String eMail, String address, int birth, String group) {
		this.name = name;
		this.phonenumber = phonenumber;
		this.email = email;
		this.address = address;
		this.birthday = birthday;
		this.group = group;

	}

	Contact() {

	}

//	기능
//	 위 데이터를 출력하는 기능

//	추가 요구 사항 
//	 변수들은 직접 참조를 막아 캡슐화 처리를 하도록 해봅시다. 
//	변수의 직접 참조는 안되지만 변수의 값을 얻을 수 있는 메소드(getter)와
//	변수에 값을 저장할 수 있는 메소드(setter)를 정의합니다.
//	 인스턴스 생성과 함께 데이터를 초기화 할 수 있도록 생성자를 정의해봅시다.
//	 저장할 데이터를 콘솔에서 사용자의 입력 값으로 인스턴스를 생성해봅시다.

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phonenumber;
	}

	public void setPhoneNumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public void tell() {
		System.out.println(" ------data------");
		System.out.println("이름 : " + this.name);
		System.out.println("전화번호 : " + this.phonenumber);
		System.out.println("E-mail : " + this.email);
		System.out.println("주소 : " + this.address);
		System.out.println("생일 : " + this.birthday);
		System.out.println("그룹 : " + this.group);

	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", phonenumber=" + phonenumber + ", email=" + email + ", address=" + address
				+ ", birthday=" + birthday + ", group=" + group + "]";
	}
	
	public static void main(String[] args) {
		
		Contact contact = new Contact();
		
	}

}
