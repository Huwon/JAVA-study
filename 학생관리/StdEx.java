package ch07;

public class StdEx {

	public static void main(String[] args) {
		//new 3번쓰면 학생을 3명 저장한다는 뜻
		//학번은 자동생성, 생성자를 통해서 이름만 입력하면 됨
		//결과-static유무 차:showInfo()로 화면 출력
		//static없으면 학생 3명다 10001로 시작하게됨(공유x, 별개로 처리하게 됨)
		//static있으면 학생 3명이 각자 다른 번호로 시작하게됨(공유)

		System.out.println("1번학생. ");
		Student s1 = new Student("홍길동"); //new(객체 사용) + 생성자(), 저장만 된 것
		s1.showinfo();  //화면 출력
		
		System.out.println();
		
		System.out.println("2번학생. ");
		Student s2 = new Student("김그린");
		s2.showinfo();
		
		System.out.println();
		
		System.out.println("3번학생. ");
		Student s3 = new Student("김철수");
		s3.showinfo();
		
	}

}
