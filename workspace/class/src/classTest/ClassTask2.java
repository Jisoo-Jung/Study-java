package classTest;

import java.util.Scanner;

public class ClassTask2 {
	public static void main(String[] args) {
//		화면
//		학생의 점수를 입력받은 뒤 총점과 평균을 출력한다.
//		학생의 점수는 생성자로 초기화 한다.
//		모든 학생은 공통적으로 총점과 평균을 구할 수 있다.
//		Scanner sc = new Scanner(System.in);
//		String message = "번호 국어 영어 수학 점수를 순서대로 입력하세요";
//		String example = "예)3 100 20 50";
//		int id = 0, kor = 0, eng = 0, math = 0;
//		Student ted = null;
//		
//		System.out.println(message + "\n" + example);
//		id = sc.nextInt();
//		kor = sc.nextInt();
//		eng = sc.nextInt();
//		math = sc.nextInt();
//		
//		ted = new Student(id, kor, math, eng);
//		
//		System.out.println("총점: " + ted.total);
//		System.out.println("평균: " + ted.average);
		
		String message = "번호 국어 영어 수학 점수를 순서대로 입력하세요";
		String example = "예)3 100 20 50";
		Scanner sc = new Scanner(System.in);
		int id = 0, kor = 0, eng = 0, math = 0;
		Subject[] arSubject = null;
		Student ted = null;
		
		System.out.println(message + "\n" + example);
		id = sc.nextInt();
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		arSubject = new Subject[] {
				new Subject("국어", kor),
				new Subject("영어", eng),
				new Subject("수학", math),
		};
		
		ted = new Student(id, arSubject);
		
		System.out.println("총점: " + ted.total);
		System.out.println("평균: " + ted.average);
		
	}
}

















