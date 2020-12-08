package calc;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);  //준비상태. 열었으면 바로 닫는게 좋음
		System.out.println("------------------------------------------------------");
		System.out.println("이름, 거주지, 나이, 체중을 띄워쓰기로 분리하여 입력하세요.");
		System.out.println("------------------------------------------------------");
		
		String name = s.next();
		String area = s.next();
		int age = s.nextInt();
		double weight = s.nextDouble();
		
		System.out.println("이름은 " + name + "\t" + "거주지는 " + area + "\n " + "나이는 " + age + "\n " + "체중은 " + weight);
		//이스케이프 문자 : \t는 ㅡ띄어쓰기 7칸  \n은 줄바꿈
		
		
		s.close();  //스캐너 닫음
		// TODO Auto-generated method stub

	}

}
