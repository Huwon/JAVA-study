package ch07;

public class LoginEx {

	public static void main(String[] args) {
		LoginVo vo = new LoginVo();
	    vo.setUserID("green");
	    vo.setName("홍길동");
	    vo.setPwd("1234");
		
	    boolean b = vo.loginCheck(vo.getUserID(), vo.getName(), vo.getPwd());
	    
		if( b == true) { //true생략 가능, if(b)로도 가능
			System.out.println("로그인이 되었습니다. ");
		}else {
			System.out.println("로그인 정보를 확인하세요. ");
		}
		
		

	}

}
