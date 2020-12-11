package ch07;

public class LoginVo {
	/*
	 * 객체 생성 1. 필드(입력값을 저장) - private 2.생성자:클래스이름과 동일, 리턴타입 필요 없음-생략이 가능
	 * 3.getter(get), setter(set) : 왼쪽은 this-오른쪽은 this(x)
	 */

	private String userID; // 외부접근 차단, 외부에 이 변수 직접 저장x-set이용
	private String name;
	private String pwd;

	//회원가입 정보가 저장되어 있다고 가정하고
	private final String DBID = "green"; //db는 데이터베이스에 저장되어 있다
	private final String DBNAME = "홍길동";
	private final String DBPWD = "1234";
	
	//생성자
	
	public LoginVo() {}
	
	public LoginVo(String userid) { // 아이디만 보여주는 생성자
		System.out.println("아이디" + userid);
	}

	public LoginVo(String userid, String name) {
		System.out.println("아이디" + userid + "\t이름" + name);
	}

	public LoginVo(String userid, String name, String pwd) {
		System.out.println("아이디" + userid + "\t이름" + name + "\t비밀번호" + pwd);
	}

	// get, set설정-public 통해 접근 가능해짐
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) { // 외부에서 들어온 아이디를 뜯함
		if (userID.length() > 12) { // 글자수가 12개를 초과
			System.out.println("아이디 길이가 너무 깁니다.");
		} else {

		}
		this.userID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	//DB저장된 값과 main에서 입력되는 값을 비교해서 일치하면 true,
	//아니면 false
	/*메소드()를 만들어서 체크-
	 * 접근제한자 리턴타입 메소드명(파라미터){
	 * 실행코드 
	 * }*/
	 public boolean loginCheck(String userID, String name, String pwd)
	 { //this는 현재 페이지, ()는파라미터: 앞에서 넘어오는 값이 있는지
		 //문자열 메모리 주소를 비교할 떄는 ==
		 if( this.DBID.equals(userID) 
				 && this.DBNAME.equals(name)
				 && this.DBPWD.equals(pwd)) //3개를 다 만족하면 결과값으로 true
			 {
		 return true;
	 }else {
		 return false; 
	 }
	//데이터베이스에 있는것과 맞는지 비교
			 
	 }
	

}
