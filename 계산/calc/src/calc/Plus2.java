package calc;

public class Plus2 {
   //더하기 기능을 분리 : 메소드명 sum()
	public static int sum(int num1, int num2) {
		//void 제외를 쓰면 return을 써줘야 함 (int는 return type)
		//return; ->프로그램 끝, 제일 마지막 줄에 작성
		return num1 + num2;   //더한 결과값을 실제로 필요한 곳으로 돌려준다
	}
	public static void main(String[] args) {
		int num1, num2;
		int sum; 
		
		num1 = 100;
		num2 = 200;
		
		//sum = num1 + num2;  -> 기능(메소드) 만들어서 공유해서 사용(메인 안쪽에 만들면x-아예 밖에도 안됨 그래서 {여기에{}})
		//sum(num1, num2);    //위에서 메소드를 생성했으니 위(sum)에도 똑같이 해줘야함, 위에서 결과를 return시켜서 결과가 나옴
		sum = sum(num1, num2);  //static을 써서 sum이 기울어져서 보임
		
		
		System.out.println(sum);
		
		// TODO Auto-generated method stub

	}

}
